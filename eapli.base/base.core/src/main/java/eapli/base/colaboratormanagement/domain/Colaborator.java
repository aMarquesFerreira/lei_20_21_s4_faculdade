package eapli.base.colaboratormanagement.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import eapli.base.clientusermanagement.domain.MecanographicNumber;
import eapli.base.teammanagement.domain.Team;
import eapli.framework.domain.model.AggregateRoot;
import eapli.framework.domain.model.DomainEntities;
import eapli.framework.infrastructure.authz.domain.model.SystemUser;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Version;
import javax.xml.bind.annotation.XmlElement;
/**
 *
 * @author andre
 */
@Entity
public class Colaborator implements AggregateRoot<MecanographicNumber> {

    @Version
    private Long version;

    @EmbeddedId
    private MecanographicNumber mecanographicNumber;    
    private Name name;
    private Address address;
    private BirthDate birthDate;
    private Evaluation evaluation;
    private Contact contact;


    @OneToOne()
    private SystemUser systemUser;

    public Colaborator(SystemUser theUser,
                       MecanographicNumber mecanographicNumber,
                       Address address,
                       BirthDate birthDate,
                       Evaluation evaluation,
                       Contact contact) {
        if (theUser == null) {
            throw new IllegalArgumentException();
        }
        String username = theUser.name().toString();
        Name newName = new Name(username);

        this.systemUser = theUser;
        this.mecanographicNumber = mecanographicNumber;
        this.name = newName;
        this.address = address;
        this.birthDate = birthDate;
        this.evaluation = evaluation;
        this.contact = contact;
        this.active = true;

    }

    @XmlElement
    @JsonProperty
    private boolean active;

    
    protected Colaborator() {
        // for ORM only
    }

    public SystemUser user() {
        return this.systemUser;
    }

    @Override
    public boolean equals(final Object o) {
        return DomainEntities.areEqual(this, o);
    }

    @Override
    public int hashCode() {
        return DomainEntities.hashCode(this);
    }

    @Override
    public boolean sameAs(final Object other) {
        final Colaborator colaborator = (Colaborator) other;
        return DomainEntities.areEqual(this, other) && isActive() == colaborator.isActive();
        
    }

    @Override
    public MecanographicNumber identity() {
        return this.mecanographicNumber;
    }

    @Override
    public boolean hasIdentity(MecanographicNumber otherId) {
        return AggregateRoot.super.hasIdentity(otherId);
    }

    public boolean isActive() {
        return this.active;
    }

    
    public boolean toggleState() {

        this.active = !this.active;
        return isActive();
    }

    @Override
    public String toString() {
        return mecanographicNumber + ": " + name;
    }
    
    
    
}