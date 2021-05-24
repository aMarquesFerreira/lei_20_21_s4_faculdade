/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.base.teammanagement.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import eapli.base.colaboratormanagement.domain.Colaborator;
import eapli.framework.domain.model.AggregateRoot;
import eapli.framework.domain.model.DomainEntities;
import eapli.framework.general.domain.model.Designation;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.annotations.OptimisticLockType;
import org.hibernate.annotations.OptimisticLocking;

/**
 * @author andre
 */
//@OptimisticLocking(type = OptimisticLockType.DIRTY)
@Entity
public class Team implements AggregateRoot<TeamCode> {

    //pode ter que se retirar por causa do optimisticLock exeption no addColabToTeam
    @Version
    private Long version;

    @XmlElement
    @JsonProperty
    @EmbeddedId
    private TeamCode teamCode;

    @XmlElement
    @JsonProperty
    @AttributeOverride(name = "value", column = @Column(name = "Team Designation"))
    private Designation teamDesignation;

    @XmlElement
    @JsonProperty
    @AttributeOverride(name = "value", column = @Column(name = "Team Acronym"))
    private TeamAcronym teamAcronym;

    @XmlElement
    @JsonProperty
    private boolean active;


    @ManyToMany(cascade = CascadeType.ALL)
    //@JoinTable(name = "Colaborator", joinColumns = {@JoinColumn(name="TeamCode", nullable = true)})
    //@JoinColumn(name="TeamCode")
    private List<Colaborator> colaborators;


    /**
     * Constructor.
     *
     * @param teamCode
     * @param teamDesignation
     * @param teamAcronym
     */
    public Team(final TeamCode teamCode, final Designation teamDesignation, final TeamAcronym teamAcronym
            /*, final Colaborator colaborator   manager ????*/) {
        if (teamCode == null || teamDesignation == null || teamAcronym == null /*|| colaborator == null*/) {
            throw new IllegalArgumentException();
        }
        this.teamCode = teamCode;
        this.teamDesignation = teamDesignation;
        this.teamAcronym = teamAcronym;
        colaborators = new ArrayList<>();
        this.active = true;

    }

    protected Team() {
        // for ORM only
    }


    public Iterable<Colaborator> colaborators() {
        return this.colaborators;
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
        final Team team = (Team) other;
        return DomainEntities.areEqual(this, other) && isActive() == team.isActive();
    }

    public TeamCode teamCode() {
        return identity();
    }

    @Override
    public TeamCode identity() {
        return this.teamCode;
    }

    public boolean isActive() {
        return this.active;
    }

    public Designation teamDesignation() {
        return this.teamDesignation;
    }

    public TeamAcronym teamAcronym() {
        return this.teamAcronym;
    }

    public boolean toogleState() {

        this.active = !this.active;
        return isActive();
    }

    public void addColaborator(Colaborator colab) {
        colaborators.add(colab);
    }

}
