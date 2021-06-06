package eapli.base.catalogue.repositories;

import eapli.base.cataloguemanagement.domain.Catalogue;
import eapli.base.cataloguemanagement.domain.CatalogueId;
import eapli.base.colaboratormanagement.domain.Colaborator;
import eapli.framework.domain.repositories.DomainRepository;

import java.util.Optional;
//import eapli.framework.infrastructure.authz.domain.model.

/**
 *
 * @author Jorge Santos ajs@isep.ipp.pt 02/04/2016
 */
public interface CatalogueRepository
        extends DomainRepository<CatalogueId, Catalogue> {

    Iterable<Catalogue> findByColaborator(Colaborator who);

    /**
     * returns the Catalogue with the given ID number
     *
     * @param catalogueId
     * @return
     */
    default Optional<Catalogue> findByCatalogueId(CatalogueId catalogueId) {
        return ofIdentity(catalogueId);
    }

    Iterable<Catalogue> findAllActive();
}
