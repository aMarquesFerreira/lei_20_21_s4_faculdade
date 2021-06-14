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
public class FormParameterId implements ValueObject, Comparable<FormParameterId> {
    
  private static final long serialVersionUID = 1L;

    private String number;
    
    public FormParameterId(final String formParameterId) {
        if (StringPredicates.isNullOrEmpty(formParameterId)) {
            throw new IllegalArgumentException(
                    "Form ID should neither be null nor empty");
        }
        // TODO validate invariants, i.e., mecanographic number regular
        // expression
        this.number = formParameterId;
    }
    
    protected FormParameterId() {
        // for ORM
    }
    
    public static FormParameterId valueOf(final String formParameterId) {
        return new FormParameterId(formParameterId);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof FormParameterId)) {
            return false;
        }

        final FormParameterId that = (FormParameterId) o;
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
    public int compareTo(final FormParameterId arg0) {
        return number.compareTo(arg0.number);
    }
    
}
