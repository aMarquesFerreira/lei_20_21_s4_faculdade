/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.base.servicemanagement.domain;

import eapli.framework.domain.model.ValueObject;
import eapli.framework.strings.util.StringPredicates;

/**
 *
 * @author andre
 */
public class ServiceCode implements ValueObject, Comparable<ServiceCode>  {
    private static final long serialVersionUID = 1L;

    private String number;
    
    public ServiceCode(final String serviceCode) {
        if (StringPredicates.isNullOrEmpty(serviceCode)) {
            throw new IllegalArgumentException(
                    "Service Code should neither be null nor empty");
        }
        // TODO validate invariants, i.e., mecanographic number regular
        // expression
        this.number = serviceCode;
    }
    
    protected ServiceCode() {
        // for ORM
    }
    
    public static ServiceCode valueOf(final String serviceCode) {
        return new ServiceCode(serviceCode);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ServiceCode)) {
            return false;
        }

        final ServiceCode that = (ServiceCode) o;
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
    public int compareTo(final ServiceCode arg0) {
        return number.compareTo(arg0.number);
    }
    
}
