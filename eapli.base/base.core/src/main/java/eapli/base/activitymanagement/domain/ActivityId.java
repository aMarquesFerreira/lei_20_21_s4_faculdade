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
public class ActivityId implements ValueObject, Comparable<ActivityId>{
     private static final long serialVersionUID = 1L;

    private String number;
    
    public ActivityId(final String activityId) {
        if (StringPredicates.isNullOrEmpty(activityId)) {
            throw new IllegalArgumentException(
                    "Activity ID should neither be null nor empty");
        }
        // TODO validate invariants, i.e., mecanographic number regular
        // expression
        this.number = activityId;
    }
    
    protected ActivityId() {
        // for ORM
    }
    
    public static ActivityId valueOf(final String activityId) {
        return new ActivityId(activityId);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ActivityId)) {
            return false;
        }

        final ActivityId that = (ActivityId) o;
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
    public int compareTo(final ActivityId arg0) {
        return number.compareTo(arg0.number);
    }
    
}
