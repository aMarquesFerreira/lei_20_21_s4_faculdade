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
public class FormId implements ValueObject, Comparable<FormId> {
    
  private static final long serialVersionUID = 1L;

    private String number;
    
    public FormId(final String formId) {
        if (StringPredicates.isNullOrEmpty(formId)) {
            throw new IllegalArgumentException(
                    "Form ID should neither be null nor empty");
        }
        // TODO validate invariants, i.e., mecanographic number regular
        // expression
        this.number = formId;
    }
    
    protected FormId() {
        // for ORM
    }
    
    public static FormId valueOf(final String formId) {
        return new FormId(formId);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof FormId)) {
            return false;
        }

        final FormId that = (FormId) o;
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
    public int compareTo(final FormId arg0) {
        return number.compareTo(arg0.number);
    }
    
}
