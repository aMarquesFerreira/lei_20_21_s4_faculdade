/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.base.formmanagement.domain;

import eapli.framework.domain.model.ValueObject;
import eapli.framework.strings.util.StringPredicates;

import javax.persistence.Embeddable;

/**
 *
 * @author andre
 */
@Embeddable
public class Answer implements ValueObject, Comparable<Answer>{
     private static final long serialVersionUID = 1L;
     
     private String answer;
     
      public Answer(final String answer) {
        if (StringPredicates.isNullOrEmpty(answer)) {
            throw new IllegalArgumentException(
                    "Answer should neither be null nor empty");
        }
        // TODO validate invariants, i.e., mecanographic number regular
        // expression
        this.answer = answer;
    }
      
    protected Answer() {
        // for ORM
    }
    
    public static Answer valueOf(final String answer) {
        return new Answer(answer);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Answer)) {
            return false;
        }

        final Answer that = (Answer) o;
        return this.answer.equals(that.answer);
    }
    
     @Override
    public int hashCode() {
        return this.answer.hashCode();
    }

    @Override
    public String toString() {
        return this.answer;
    }
    
    @Override
    public int compareTo(final Answer arg0) {
        return answer.compareTo(arg0.answer);
    }
    
}
