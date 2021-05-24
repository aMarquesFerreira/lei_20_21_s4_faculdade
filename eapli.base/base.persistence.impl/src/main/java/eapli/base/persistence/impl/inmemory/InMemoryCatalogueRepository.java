/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.base.persistence.impl.inmemory;

import eapli.base.catalogue.repositories.CatalogueRepository;
import eapli.base.cataloguemanagement.domain.Catalogue;
import eapli.base.cataloguemanagement.domain.CatalogueId;
import eapli.base.colaboratormanagement.domain.Colaborator;
import eapli.framework.infrastructure.repositories.impl.inmemory.InMemoryDomainRepository;
import java.util.Optional;
import eapli.framework.infrastructure.authz.domain.model.Username;
import eapli.framework.infrastructure.repositories.impl.inmemory.InMemoryDomainRepository;

/**
 *
 * @author andre
 */
public class InMemoryCatalogueRepository extends InMemoryDomainRepository<Catalogue, CatalogueId> 
                                                                  implements CatalogueRepository{
    
    static {
        InMemoryInitializer.init();
    }

   /* @Override
    public Optional<Catalogue> findByCatalogueId(CatalogueId catalogueId) {
        return matchOne(e -> e.user().username().equals(name));
    }
*/
    @Override
    public Optional<Catalogue> findByCatalogueId(CatalogueId catalogueId) {
        return Optional.ofNullable(data().get(catalogueId));
    }

   @Override
    public Iterable<Catalogue> findAllActive() {
        return match(e -> e.colaborator().isActive());
    }

    @Override
    public Iterable<Catalogue> findByColaborator(Colaborator who) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
