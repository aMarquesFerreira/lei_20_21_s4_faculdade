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
public class Label implements ValueObject, Comparable<Label>{

     private static final long serialVersionUID = 1L;
     
     private String label;
     
      public Label(final String label) {
        if (StringPredicates.isNullOrEmpty(label)) {
            throw new IllegalArgumentException(
                    "Label should neither be null nor empty");
        }
        // TODO validate invariants, i.e., mecanographic number regular
        // expression
        this.label = label;
    }
      
    protected Label() {
        // for ORM
    }
    
    public static Label valueOf(final String label) {
        return new Label(label);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Label)) {
            return false;
        }

        final Label that = (Label) o;
        return this.label.equals(that.label);
    }
    
     @Override
    public int hashCode() {
        return this.label.hashCode();
    }

    @Override
    public String toString() {
        return this.label;
    }
    
    @Override
    public int compareTo(final Label arg0) {
        return label.compareTo(arg0.label);
    }
    
    
}
