/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.base.formmanagement.domain;


import eapli.framework.domain.model.ValueObject;
import eapli.framework.strings.util.StringPredicates;


/**
 *
 * @author andre
 */
public class FormAnswerId implements ValueObject, Comparable<FormAnswerId> {
    
  private static final long serialVersionUID = 1L;

    private String number;
    
    public FormAnswerId(final String formAnswerId) {
        if (StringPredicates.isNullOrEmpty(formAnswerId)) {
            throw new IllegalArgumentException(
                    "Form ID should neither be null nor empty");
        }
        // TODO validate invariants, i.e., mecanographic number regular
        // expression
        this.number = formAnswerId;
    }
    
    protected FormAnswerId() {
        // for ORM
    }
    
    public static FormAnswerId valueOf(final String formAnswerId) {
        return new FormAnswerId(formAnswerId);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof FormAnswerId)) {
            return false;
        }

        final FormAnswerId that = (FormAnswerId) o;
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
    public int compareTo(final FormAnswerId arg0) {
        return number.compareTo(arg0.number);
    }
    
}
