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
public class FormParameterData implements ValueObject, Comparable<FormParameterData>{

     private static final long serialVersionUID = 1L;
     
     private String parameterData;
     
      public FormParameterData(final String parameterData) {
        if (StringPredicates.isNullOrEmpty(parameterData)) {
            throw new IllegalArgumentException(
                    "Parameter Data should neither be null nor empty");
        }
        // TODO validate invariants, i.e., mecanographic number regular
        // expression
        this.parameterData = parameterData;
    }
      
    protected FormParameterData() {
        // for ORM
    }
    
    public static FormParameterData valueOf(final String parameterData) {
        return new FormParameterData(parameterData);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof FormParameterData)) {
            return false;
        }

        final FormParameterData that = (FormParameterData) o;
        return this.parameterData.equals(that.parameterData);
    }
    
     @Override
    public int hashCode() {
        return this.parameterData.hashCode();
    }

    @Override
    public String toString() {
        return this.parameterData;
    }
    
    @Override
    public int compareTo(final FormParameterData arg0) {
        return parameterData.compareTo(arg0.parameterData);
    }
    
    
}
