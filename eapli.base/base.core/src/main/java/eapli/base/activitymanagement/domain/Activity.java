/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.base.activitymanagement.domain;


import com.fasterxml.jackson.annotation.JsonProperty;
import eapli.base.colaboratormanagement.domain.Colaborator;
import eapli.base.formmanagement.domain.Form;
import eapli.framework.domain.model.AggregateRoot;
import eapli.framework.domain.model.DomainEntities;
import eapli.framework.general.domain.model.Description;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlElement;

/**
 *
 * @author andre
 */
@Entity
public class Activity implements AggregateRoot<ActivityId> {
    
    @Version
    private Long version;
    
    @XmlElement
    @JsonProperty
    @EmbeddedId
    private ActivityId activityId;


    @XmlElement
    @JsonProperty
    private ActivityType type;
    
    @XmlElement
    @JsonProperty
    private Description description;
    
    @XmlElement
    @JsonProperty
    private ExecutionTime execTime;
    
    @XmlElement
    @JsonProperty
    private boolean active;


    /**
     * cascade = CascadeType.NONE as the systemUser is part of another aggregate
     */
    /*@ManyToOne()
    private Service service;*/
    
    @OneToOne(cascade = CascadeType.ALL)
    private Form form;

    @ManyToOne()
    private Colaborator colaborator;

    /**
     * Constructor.
     *
     * 
     * @param activityId
     * @param description
     * @param type
     * @param execTime
     * @param colaborator
     */
    public Activity(final ActivityId activityId,final Description description/*, final Form form*/,ActivityType type, ExecutionTime execTime/*, final Colaborator colaborator*/) {
        if (activityId == null || description  == null || type == null || execTime ==  null/* || colaborator == null*/) {
            throw new IllegalArgumentException();
        }
        this.activityId = activityId;
        this.description = description;
        //this.form = form;
        //this.colaborator = colaborator;
        this.type = type;
        this.active = true;

    }

    protected Activity() {
        // for ORM only
    }


    public Colaborator colaborator() {
        return this.colaborator;
    }
    
    
    public Form getForm() {
        return this.form;
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
        final Activity activity = (Activity) other;
        return DomainEntities.areEqual(this, other) && isActive() == activity.isActive();
    }


    public ActivityId activityId() {
        return identity();
    }
    
    public Description description() {
        return this.description;
    }
    
    public ExecutionTime executionTime() {
        return this.execTime;
    }

    
    /*E PARA APAGAR*/
    public void assignToColaborator(Colaborator colaborator) {
        this.colaborator = colaborator;
    }
    
    public ActivityType type() {
        return this.type;
    }

    @Override
    public ActivityId identity() {
        return this.activityId;
    }

   
    public boolean isActive() {
        return this.active;
    }

    public boolean toggleState() {

        this.active = !this.active;
        return isActive();
    }

    public void addForm(Form form) {
        this.form = form;
    }
    
}
