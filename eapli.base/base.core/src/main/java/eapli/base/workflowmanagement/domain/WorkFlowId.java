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
public class WorkFlowId implements ValueObject, Comparable<WorkFlowId>{
    
     private static final long serialVersionUID = 1L;
     
     private String workFlowId;
     
      public WorkFlowId(final String workFlowId) {
        if (StringPredicates.isNullOrEmpty(workFlowId)) {
            throw new IllegalArgumentException(
                    "WorkFlowId should neither be null nor empty");
        }
        // TODO validate invariants, i.e., mecanographic number regular
        // expression
        this.workFlowId = workFlowId;
    }
      
    protected WorkFlowId() {
        // for ORM
    }
    
    public static WorkFlowId valueOf(final String workFlowId) {
        return new WorkFlowId(workFlowId);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof WorkFlowId)) {
            return false;
        }

        final WorkFlowId that = (WorkFlowId) o;
        return this.workFlowId.equals(that.workFlowId);
    }
    
     @Override
    public int hashCode() {
        return this.workFlowId.hashCode();
    }

    @Override
    public String toString() {
        return this.workFlowId;
    }
    
    @Override
    public int compareTo(final WorkFlowId arg0) {
        return workFlowId.compareTo(arg0.workFlowId);
    }
    
    
}
