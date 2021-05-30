/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.base.activitymanagement.domain;

import eapli.framework.domain.model.ValueObject;
import eapli.framework.strings.util.StringPredicates;
import javax.persistence.Embeddable;

/**
 *
 * @author andre
 */
@Embeddable
public class ActivityExecutionId implements ValueObject, Comparable<ActivityExecutionId>{
     private static final long serialVersionUID = 1L;

    private String number;
    
    public ActivityExecutionId(final String activityExecutionId) {
        if (StringPredicates.isNullOrEmpty(activityExecutionId)) {
            throw new IllegalArgumentException(
                    "Activity ID should neither be null nor empty");
        }
        // TODO validate invariants, i.e., mecanographic number regular
        // expression
        this.number = activityExecutionId;
    }
    
    protected ActivityExecutionId() {
        // for ORM
    }
    
    public static ActivityExecutionId valueOf(final String activityExecutionId) {
        return new ActivityExecutionId(activityExecutionId);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ActivityExecutionId)) {
            return false;
        }

        final ActivityExecutionId that = (ActivityExecutionId) o;
        return this.number.equals(that.number);
    }
    
    @Override
    public int hashCode() {
        return this.number.hashCode();
    }

    @Override
    public String toString() {
        return this.number;
    }
    
    @Override
    public int compareTo(final ActivityExecutionId arg0) {
        return number.compareTo(arg0.number);
    }
    
}
