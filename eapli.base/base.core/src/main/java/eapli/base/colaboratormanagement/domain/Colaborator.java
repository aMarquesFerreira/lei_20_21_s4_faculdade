package eapli.base.colaboratormanagement.domain;

import eapli.base.clientusermanagement.domain.MecanographicNumber;
import eapli.framework.domain.model.AggregateRoot;
import eapli.framework.domain.model.DomainEntities;
import eapli.framework.domain.model.DomainEntity;
import eapli.framework.infrastructure.authz.domain.model.SystemUser;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Version;

@Entity
public abstract class Colaborator implements AggregateRoot<MecanographicNumber>{

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

    public Colaborator(final SystemUser user,
                       MecanographicNumber mecanographicNumber,
                       Name name,
                       Address address,
                       BirthDate birthDate,
                       Evaluation evaluation,
                       Contact contact) {
        if (user == null) {
            throw new IllegalArgumentException();
        }
        this.systemUser = user;
        this.mecanographicNumber = mecanographicNumber;
        this.name = name;
        this.address = address;
        this.birthDate = birthDate;
        this.evaluation = evaluation;
        this.contact = contact;

    }

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
        return DomainEntities.hashCode((DomainEntity<?>) this);
    }

    @Override
    public boolean sameAs(final Object other) {
        return DomainEntities.areEqual((DomainEntity<?>) this, other);
    }

}
