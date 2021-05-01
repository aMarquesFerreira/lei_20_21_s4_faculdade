/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.base.cataloguemanagement.domain;

import eapli.base.colaboratormanagement.domain.Colaborator;
import eapli.framework.domain.model.DomainEntities;
import eapli.framework.domain.model.AggregateRoot;
//import eapli.framework.general.domain.model.
import eapli.framework.representations.Representationable;
import eapli.framework.representations.dto.DTOable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Version;


/**
 *
 * @author andre
 */
@Entity
public class Catalogue implements AggregateRoot<CatalogueId>/* DTOable<CatalogueDTO>, Representationable */{
    
    @Version
    private Long version;

    @EmbeddedId
    private CatalogueId catalogueId;
    
    /**
     * cascade = CascadeType.NONE as the systemUser is part of another aggregate
     */
    @OneToOne()
    private Colaborator colaborator;
    
    public Catalogue(final Colaborator colab, final CatalogueId catId) {
        if (catId == null || colab == null) {
            throw new IllegalArgumentException();
        }
        this.colaborator = colab;
        this.catalogueId = catalogueId;
    }
    
    protected Catalogue() {
        // for ORM only
    }
    
    public Colaborator colaborator() {
        return this.colaborator;
    }
    
    @Override
    public boolean equals(final Object o) {
        return DomainEntities.areEqual(this, o);
    }
    
    @Override
    public int hashCode() {
        return DomainEntities.hashCode(this);
    }

    @Override
    public boolean sameAs(final Object other) {
        return DomainEntities.areEqual(this, other);
    }
    
    public CatalogueId catalogueId() {
        return identity();
    }
    
    @Override
    public CatalogueId identity() {
        return this.catalogueId;
    }
    
}
