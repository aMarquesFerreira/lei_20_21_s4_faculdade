/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.base.activitymanagement.domain;


import com.fasterxml.jackson.annotation.JsonProperty;
import eapli.base.colaboratormanagement.domain.Colaborator;
import eapli.base.formmanagement.domain.FormAnswer;
import eapli.framework.domain.model.AggregateRoot;
import eapli.framework.domain.model.DomainEntities;
import javax.persistence.CascadeType;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.xml.bind.annotation.XmlElement;

/**
 *
 * @author andre
 */
@Entity
public class ActivityExecution implements AggregateRoot<ActivityExecutionId> {
    
    private Long version;
    
    @XmlElement
    @JsonProperty
    @EmbeddedId
    private ActivityExecutionId activityExecutionId;
    
    @XmlElement
    @JsonProperty
    private ActivityExecutionStatus status; 

    /**
     * cascade = CascadeType.NONE as the systemUser is part of another aggregate
     */
    /*@ManyToOne()
    private Service service;*/
    
    @ManyToOne
    private Activity activity;
    
    @OneToOne()
    private FormAnswer formAnswer;

    @ManyToOne(cascade = CascadeType.ALL)
    private Colaborator colaborator;

    /**
     * Constructor.
     *
     * 
     * @param activityExecutionId
     * @param activity
     * @param formAnswer
     * @param colaborator
     */
    public ActivityExecution(final ActivityExecutionId activityExecutionId, Activity activity, final FormAnswer formAnswer, final Colaborator colaborator) {
        if (activityExecutionId == null || activity == null){// || formAnswer == null || colaborator == null) {
            throw new IllegalArgumentException();
        }
        this.activityExecutionId = activityExecutionId;
        this.activity = activity;
        this.formAnswer = formAnswer;
        this.colaborator = colaborator;
        this.status = ActivityExecutionStatus.PENDING;
    }
    
    /**
     * cria uma activity pendente
     * @param id
     * @param activity 
     */
    public ActivityExecution(ActivityExecutionId id, Activity activity) {
        this(id, activity, null, null);
    }

    
    protected ActivityExecution() {
        // for ORM only
    }


    public Colaborator colaborator() {
        return this.colaborator;
    }

    public Activity getActivity() {
        return activity;
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
        final ActivityExecution activity = (ActivityExecution) other;
        return DomainEntities.areEqual(this, other);
    }


    public ActivityExecutionId activityId() {
        return identity();
    }

    @Override
    public ActivityExecutionId identity() {
        return this.activityExecutionId;
    }

    public Long getVersion() {
        return version;
    }

    public ActivityExecutionId getActivityId() {
        return activityExecutionId;
    }

    public ActivityExecutionStatus getStatus() {
        return status;
    }

    public FormAnswer getFormAnswer() {
        return formAnswer;
    }

    public Colaborator getColaborator() {
        return colaborator;
    }

    
    public void statusDone() {
        status = ActivityExecutionStatus.DONE;
    }
    
    public void statusUnassigned() {
        status = ActivityExecutionStatus.UNASSIGNED;
    }

    public void assignToColaborator(Colaborator colab) {
        this.colaborator=colab;
    }

    public void setFormAnswer(FormAnswer formAnswer) {
        this.formAnswer=formAnswer;
    }


    
}
