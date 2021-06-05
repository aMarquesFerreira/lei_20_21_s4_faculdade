/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.base.workflowmanagement.domain;

import eapli.framework.domain.model.ValueObject;
import eapli.framework.strings.util.StringPredicates;

import javax.persistence.Embeddable;

/**
 *
 * @author andre
 */
@Embeddable
public class WorkFlowExecutionId implements ValueObject, Comparable<WorkFlowExecutionId>{
    
     private static final long serialVersionUID = 1L;
     
     private String workFlowExecutionId;
     
      public WorkFlowExecutionId(final String workFlowExecutionId) {
        if (StringPredicates.isNullOrEmpty(workFlowExecutionId)) {
            throw new IllegalArgumentException(
                    "WorkFlowId should neither be null nor empty");
        }
        // TODO validate invariants, i.e., mecanographic number regular
        // expression
        this.workFlowExecutionId = workFlowExecutionId;
    }
      
    protected WorkFlowExecutionId() {
        // for ORM
    }
    
    public static WorkFlowExecutionId valueOf(final String workFlowExecutionId) {
        return new WorkFlowExecutionId(workFlowExecutionId);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof WorkFlowExecutionId)) {
            return false;
        }

        final WorkFlowExecutionId that = (WorkFlowExecutionId) o;
        return this.workFlowExecutionId.equals(that.workFlowExecutionId);
    }
    
     @Override
    public int hashCode() {
        return this.workFlowExecutionId.hashCode();
    }

    @Override
    public String toString() {
        return this.workFlowExecutionId;
    }
    
    @Override
    public int compareTo(final WorkFlowExecutionId arg0) {
        return workFlowExecutionId.compareTo(arg0.workFlowExecutionId);
    }
    
    
}
