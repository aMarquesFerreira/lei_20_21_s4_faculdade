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
public class ActivityType implements ValueObject, Comparable<ActivityType>{

     private static final long serialVersionUID = 1L;

    
     
     private String type;
     
      public ActivityType(final String type) {
        if (StringPredicates.isNullOrEmpty(type)) {
            throw new IllegalArgumentException(
                    "Type should neither be null nor empty");
        }
        // TODO validate invariants, i.e., mecanographic number regular
        // expression
        this.type = type;
    }
      
    protected ActivityType() {
        // for ORM
    }
    
    public static ActivityType valueOf(final String type) {
        return new ActivityType(type);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ActivityType)) {
            return false;
        }

        final ActivityType that = (ActivityType) o;
        return this.type.equals(that.type);
    }
    
     @Override
    public int hashCode() {
        return this.type.hashCode();
    }

    @Override
    public String toString() {
        return this.type;
    }
    
    @Override
    public int compareTo(final ActivityType arg0) {
        return type.compareTo(arg0.type);
    }
}
