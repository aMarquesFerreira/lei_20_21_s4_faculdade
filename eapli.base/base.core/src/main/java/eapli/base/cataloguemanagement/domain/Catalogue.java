/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.base.cataloguemanagement.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import eapli.base.colaboratormanagement.domain.Colaborator;
import eapli.base.teammanagement.domain.Team;
import eapli.framework.domain.model.DomainEntities;
import eapli.framework.domain.model.AggregateRoot;
import eapli.framework.general.domain.model.Description;
import eapli.framework.general.domain.model.Designation;
//import eapli.framework.general.domain.model.
import eapli.framework.representations.Representationable;
import eapli.framework.representations.dto.DTOable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.AttributeOverride;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Version;
import javax.xml.bind.annotation.XmlElement;


/**
 *
 * @author andre
 */
@Entity
public class Catalogue implements AggregateRoot<CatalogueId>{
    
    @Version
    private Long version;

    @XmlElement
    @JsonProperty
    @EmbeddedId
    private CatalogueId catalogueId;
    
    @XmlElement
    @JsonProperty
    @AttributeOverride(name = "value", column = @Column(name = "shortDescription"))
    private Description shortDescription;
    
    @XmlElement
    @JsonProperty
    @AttributeOverride(name = "value", column = @Column(name = "Title"))
    private Designation catalogueTitle;
    
    
    @XmlElement
    @JsonProperty
    private boolean active;
    
    
    /**
     * cascade = CascadeType.NONE as the systemUser is part of another aggregate
     */
    @OneToOne()
    private Colaborator respColaborator;
    /* @OneToMany()
    private Team teams;
     */
    @ManyToMany(cascade = CascadeType.ALL)
    //@JoinTable(name = "Teams", joinColumns = {@JoinColumn(name="CatalogueID")})
    private List<Team> teams;
    
    
   
               
    /**
     * Constructor.
     *
     * @param respColaborator
     * @param catalogueId
     * @param shortDescription
     * @param catalogueTitle
     */
    public Catalogue(final Colaborator respColaborator, final CatalogueId catalogueId, final Description shortDescription, final Designation catalogueTitle) {
        this.teams = new ArrayList<Team>();
        if (catalogueId == null || respColaborator == null || shortDescription == null || catalogueTitle == null || teams == null) {
            throw new IllegalArgumentException();
        }
        this.respColaborator = respColaborator;
        this.catalogueId = catalogueId;
        this.shortDescription = shortDescription;
        this.catalogueTitle = catalogueTitle;
        teams = new ArrayList<>();
        this.active = true;
        
    }
    
    protected Catalogue() {
        // for ORM only
    }

    
    public Colaborator colaborator() {
        return this.respColaborator;
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
        final Catalogue catalogue = (Catalogue) other;
        return DomainEntities.areEqual(this, other) && isActive() == catalogue.isActive();
    }
    
  
    
    public CatalogueId catalogueId() {
        return identity();
    }
    
    @Override
    public CatalogueId identity() {
        return this.catalogueId;
    }
    
     public Description shortDescription() {
        return this.shortDescription;
    }
    
    public Designation catalogueTitle() {
        return this.catalogueTitle;
    }
    
    public Iterable<Team> teams(){
        return this.teams;
    }
    
    public boolean addTeam(final Team tms){
        for (Team teams : teams) {
            if(teams.equals(tms)){
                return false;
            }
        }
        return teams.add(tms);
    }
    
    public boolean isActive() {
        return this.active;
    }
    
    public boolean toggleState() {

        this.active = !this.active;
        return isActive();
    }
    
    
}
