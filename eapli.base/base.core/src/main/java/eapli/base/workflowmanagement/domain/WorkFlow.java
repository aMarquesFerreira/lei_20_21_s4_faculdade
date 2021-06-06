/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.base.workflowmanagement.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import eapli.base.activitymanagement.domain.Activity;
import eapli.base.servicemanagement.domain.Service;
import eapli.framework.domain.model.AggregateRoot;
import eapli.framework.domain.model.DomainEntities;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Version;
import javax.xml.bind.annotation.XmlElement;

/**
 *
 * @author andre
 */
@Entity
public class WorkFlow implements AggregateRoot<WorkFlowId> {
    
    @Version
    private Long version;

    @XmlElement
    @JsonProperty
    @EmbeddedId
    private WorkFlowId workflowId;

    @XmlElement
    @JsonProperty
    private boolean active;


    /**
     * cascade = CascadeType.NONE as the systemUser is part of another aggregate
     */
    @OneToMany()
    private List<Activity> activities;
    
    @OneToOne()
    private Service service;
     

    /**
     * Constructor.
     *
     * @param workflowId
     * @param service
     * 
     */
    public WorkFlow(final WorkFlowId workflowId, final Service service) {
       
        if (workflowId == null || service == null) {
            throw new IllegalArgumentException();
        }
        this.workflowId = workflowId;
        this.service = service;
        activities = new ArrayList<>();
        this.active = true;

    }

    protected WorkFlow() {
        // for ORM only
    }


     public Iterable<Activity> activities() {
        return this.activities;
    }

    public boolean addActivities(final Activity act) {
        for (Activity activity : activities) {
            if (activity.equals(act)) {
                return false;
            }
        }
        return activities.add(act);
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
        final WorkFlow workFlow = (WorkFlow) other;
        return DomainEntities.areEqual(this, other) && isActive() == workFlow.isActive();
    }


    public WorkFlowId workFlowId() {
        return identity();
    }

    @Override
    public WorkFlowId identity() {
        return this.workflowId;
    }

    public boolean isActive() {
        return this.active;
    }

    public boolean toggleState() {

        this.active = !this.active;
        return isActive();
    }

    public Service getService() {
        return service;
    }
    
    

    
}
