/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.base.clientusermanagement.domain;

import eapli.framework.domain.model.AggregateRoot;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Version;

/**
 *
 * @author andre
 */
@Entity
public class Catalogue /*implements AggregateRoot<CatalogueId>*/ {

@Version
private long version;

@EmbeddedId
private CatalogueId catalogueId;

@OneToOne()
private Colaborator colaborator;

public Catalogue(final Colaborator colaborator, final CatalogueId catalogueId) {
        if (catalogueId == null || colaborator == null) {
            throw new IllegalArgumentException();
        }
        this.colaborator = colaborator;
        this.catalogueId = catalogueId;
    }

    protected Catalogue() {
        // for ORM only
    }
    
    public Colaborator colaborator(){
        return this.colaborator;
    }

   /* @Override
    public boolean sameAs(Object other) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int compareTo(CatalogueId other) {
        return AggregateRoot.super.compareTo(other); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public CatalogueId identity() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean hasIdentity(CatalogueId otherId) {
        return AggregateRoot.super.hasIdentity(otherId); //To change body of generated methods, choose Tools | Templates.
    }

*/
}
