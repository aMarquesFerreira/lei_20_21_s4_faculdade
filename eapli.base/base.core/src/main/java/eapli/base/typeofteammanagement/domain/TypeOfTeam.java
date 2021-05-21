/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.base.typeofteammanagement.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import eapli.base.teammanagement.domain.Team;
import eapli.framework.domain.model.AggregateRoot;
import eapli.framework.domain.model.DomainEntities;
import eapli.framework.general.domain.model.Description;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.AttributeOverride;
//import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Version;
import javax.xml.bind.annotation.XmlElement;

/**
 *
 * @author Omen
 */
@Entity
public class TypeOfTeam implements AggregateRoot<Color>{
    
    @Version
    private Long version;

    @XmlElement
    @JsonProperty
    @EmbeddedId
    private Color color;

    @XmlElement
    @JsonProperty
    @AttributeOverride(name = "value", column = @Column(name = "Type of team description"))
    private Description description;

    @XmlElement
    @JsonProperty
    private boolean active;


    @OneToMany//(cascade = CascadeType.ALL)
    //@JoinTable(name = "Colaborator", joinColumns = {@JoinColumn(name="TeamCode", nullable = true)})
    //@JoinColumn(name="TeamCode")
    private List<Team> teams;


    /**
     * Constructor.
     *
     * @param color
     * @param description
     */
    public TypeOfTeam(final Color color, final Description description
            /*, final Colaborator colaborator   manager ????*/) {
        if (color == null || description == null  /*|| colaborator == null*/) {
            throw new IllegalArgumentException();
        }
        this.color = color;
        this.description = description;
        teams = new ArrayList<>();
        this.active = true;

    }

    protected TypeOfTeam() {
        // for ORM only
    }


    public Iterable<Team> teams() {
        return this.teams;
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
        final TypeOfTeam typeofteam = (TypeOfTeam) other;
        return DomainEntities.areEqual(this, other) && isActive() == typeofteam.isActive();
    }

    public Color color() {
        return identity();
    }

    @Override
    public Color identity() {
        return this.color;
    }

    public boolean isActive() {
        return this.active;
    }

    public Description description() {
        return this.description;
    }

    public boolean toogleState() {

        this.active = !this.active;
        return isActive();
    }

    public void addTeam(Team team) {
        teams.add(team);
    }
    
}
