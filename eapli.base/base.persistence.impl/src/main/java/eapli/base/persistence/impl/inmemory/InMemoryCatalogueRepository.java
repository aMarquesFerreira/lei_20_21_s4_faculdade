/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.base.persistence.impl.inmemory;

//import eapli.base.clientusermanagement.
import eapli.base.catalogue.repositories.CatalogueRepository;
import eapli.base.cataloguemanagement.domain.Catalogue;
import eapli.base.cataloguemanagement.domain.CatalogueId;
import eapli.framework.infrastructure.repositories.impl.inmemory.InMemoryDomainRepository;
import java.util.Optional;

/**
 *
 * @author andre
 */
public class InMemoryCatalogueRepository /*extends InMemoryDomainRepository<Catalogue, CatalogueId> 
                                                                  implements CatalogueRepository*/ {
    
    static {
        InMemoryInitializer.init();
    }

   /* @Override
    public Optional<Catalogue> findByCatalogueId(CatalogueId catalogueId) {
        return matchOne(e -> e.user().username().equals(name));
    }
*/
    //@Override
    /*public Optional<Catalogue> findByCatalogueId(CatalogueId catalogueId) {
        return Optional.of(data().get(catalogueId));
    }*/

    /*@Override
    public Iterable<Catalogue> findAllActive() {
        return match(e -> e.user().isActive());
    }*/
    
}
