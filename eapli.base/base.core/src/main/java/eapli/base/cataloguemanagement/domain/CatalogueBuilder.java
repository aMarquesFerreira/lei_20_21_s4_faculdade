/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.base.cataloguemanagement.domain;

import eapli.base.colaboratormanagement.domain.Colaborator;
import eapli.framework.domain.model.DomainFactory;

/**
 *
 * @author andre
 */
public class CatalogueBuilder implements DomainFactory<Catalogue>  {
    
    private Colaborator colaborator;
    private CatalogueId catalogueId;
    
    public CatalogueBuilder withColaborator(Colaborator colaborator) {
        this.colaborator = colaborator;
        return this;
    }
    
     public CatalogueBuilder withCatalogueId(CatalogueId catalogueId) {
        this.catalogueId = catalogueId;
        return this;
    }

    public CatalogueBuilder withCatalogueId(String catalogueId) {
        this.catalogueId = new CatalogueId(catalogueId);
        return this;
    }
    
    @Override
    public Catalogue build() {
        // since the factory knows that all the parts are needed it could throw
        // an exception. however, we will leave that to the constructor
        return new Catalogue(this.colaborator, this.catalogueId);
    }


    
    
    
    
}
