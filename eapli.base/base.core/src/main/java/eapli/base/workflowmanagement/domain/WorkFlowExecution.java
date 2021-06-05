/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.base.workflowmanagement.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import eapli.base.activitymanagement.domain.Activity;
import eapli.base.activitymanagement.domain.ActivityExecution;
import eapli.base.activitymanagement.domain.ActivityExecutionId;
import eapli.framework.domain.model.AggregateRoot;
import eapli.framework.domain.model.DomainEntities;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Version;
import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author andre
 */
@Entity
public class WorkFlowExecution implements AggregateRoot<WorkFlowExecutionId> {

    
    @Version
    private Long version;

    @XmlElement
    @JsonProperty
    @EmbeddedId
    private WorkFlowExecutionId workFlowExecutionId;

    private WorkFlow workFlow;

    /**
     * cascade = CascadeType.NONE as the systemUser is part of another aggregate
     */
    @OneToMany()
    private List<ActivityExecution> activityExecutions;
     

    /**
     * Constructor.
     *
     * @param workFlowExecutionId
     * @param workFlow
     * 
     */
    public WorkFlowExecution(final WorkFlowExecutionId workFlowExecutionId, WorkFlow workFlow) {
       
        if (workFlowExecutionId == null) {
            throw new IllegalArgumentException();
        }
        this.workFlow=workFlow;
        this.workFlowExecutionId = workFlowExecutionId;
        this.activityExecutions = new ArrayList<>();
        
        for (Activity activity : workFlow.activities()) {
            String id = workFlowExecutionId.toString()+"."+activity.activityId().toString();
            activityExecutions.add(new ActivityExecution(ActivityExecutionId.valueOf(id), activity));
        }
        
        
    }

    protected WorkFlowExecution() {
        // for ORM only
    }


     public Iterable<ActivityExecution> activityExecutions() {
        return this.activityExecutions;
    }

    public boolean addActivityExecution(final ActivityExecution act) {
        for (ActivityExecution activity : activityExecutions) {
            if (activity.equals(act)) {
                return false;
            }
        }
        return activityExecutions.add(act);
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
        final WorkFlowExecution workFlowExecution = (WorkFlowExecution) other;
        return DomainEntities.areEqual(this, other);
    }


    public WorkFlowExecutionId workFlowId() {
        return identity();
    }

    @Override
    public WorkFlowExecutionId identity() {
        return this.workFlowExecutionId;
    }


    public static WorkFlowExecution from(WorkFlowExecutionId workFlowExecutionId, WorkFlow workFlow) {
        WorkFlowExecution wfe = new WorkFlowExecution(workFlowExecutionId, workFlow);
        return wfe;
    }

    
}
