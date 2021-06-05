/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.base.cataloguemanagement.domain;

import eapli.framework.domain.model.ValueObject;
import eapli.framework.strings.util.StringPredicates;

import javax.persistence.Embeddable;


/**
 *
 * @author andre
 */
@Embeddable
public class CatalogueId implements ValueObject, Comparable<CatalogueId> {
    
    private static final long serialVersionUID = 1L;

    private String number;
    
    public CatalogueId(final String catalogueId) {
        if (StringPredicates.isNullOrEmpty(catalogueId)) {
            throw new IllegalArgumentException(
                    "Catalogue ID should neither be null nor empty");
        }
        // TODO validate invariants, i.e., mecanographic number regular
        // expression
        this.number = catalogueId;
    }
    
    protected CatalogueId() {
        // for ORM
    }
    
    public static CatalogueId valueOf(final String catalogueId) {
        return new CatalogueId(catalogueId);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CatalogueId)) {
            return false;
        }

        final CatalogueId that = (CatalogueId) o;
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
    public int compareTo(final CatalogueId arg0) {
        return number.compareTo(arg0.number);
    }
    
}
