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
public class ExecutionTime implements ValueObject, Comparable<ExecutionTime>{

     private static final long serialVersionUID = 1L;

    
     
     private Integer execTime;
     
      public ExecutionTime(final Integer execTime) {
        if (execTime == null) {
            throw new IllegalArgumentException(
                    "Time should neither be null nor empty");
        }
        // TODO validate invariants, i.e., mecanographic number regular
        // expression
        this.execTime = execTime;
    }
      
    protected ExecutionTime() {
        // for ORM
    }
    
    public static ExecutionTime valueOf(final Integer execTime) {
        return new ExecutionTime(execTime);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExecutionTime)) {
            return false;
        }

        final ExecutionTime that = (ExecutionTime) o;
        return this.execTime.equals(that.execTime);
    }
    
     @Override
    public int hashCode() {
        return this.execTime.hashCode();
    }

    @Override
    public String toString() {
        return "ExecutionTime{" + "execTime=" + execTime + '}';
    }

    
    
    @Override
    public int compareTo(final ExecutionTime arg0) {
        return execTime.compareTo(arg0.execTime);
    }
    
}
