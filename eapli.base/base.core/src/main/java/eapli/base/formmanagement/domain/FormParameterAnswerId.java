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
public class FormParameterAnswerId implements ValueObject, Comparable<FormParameterAnswerId> {
    
  private static final long serialVersionUID = 1L;

    private String number;
    
    public FormParameterAnswerId(final String formParameterAnswerId) {
        if (StringPredicates.isNullOrEmpty(formParameterAnswerId)) {
            throw new IllegalArgumentException(
                    "Form ID should neither be null nor empty");
        }
        // TODO validate invariants, i.e., mecanographic number regular
        // expression
        this.number = formParameterAnswerId;
    }
    
    protected FormParameterAnswerId() {
        // for ORM
    }
    
    public static FormParameterAnswerId valueOf(final String formParameterAnswerId) {
        return new FormParameterAnswerId(formParameterAnswerId);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof FormParameterAnswerId)) {
            return false;
        }

        final FormParameterAnswerId that = (FormParameterAnswerId) o;
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
    public int compareTo(final FormParameterAnswerId arg0) {
        return number.compareTo(arg0.number);
    }
    
}
