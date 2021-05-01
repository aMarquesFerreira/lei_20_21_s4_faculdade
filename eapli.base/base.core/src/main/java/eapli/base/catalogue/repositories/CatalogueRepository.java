package eapli.base.catalogue.repositories;

import eapli.base.cataloguemanagement.domain.Catalogue;
import eapli.base.cataloguemanagement.domain.CatalogueId;
import eapli.base.clientusermanagement.repositories.*;
import java.util.Optional;

import eapli.base.clientusermanagement.domain.ClientUser;
import eapli.base.clientusermanagement.domain.MecanographicNumber;
import eapli.framework.domain.repositories.DomainRepository;
//import eapli.framework.infrastructure.authz.domain.model.

/**
 *
 * @author Jorge Santos ajs@isep.ipp.pt 02/04/2016
 */
public interface CatalogueRepository
        extends DomainRepository<CatalogueId, Catalogue> {

    /**
     * returns the catalogue whose Catalogue ID is given
     *
     * @param catalogueId
     *            the Catalogue ID to search for
     * @return
     */
    /*Optional<Catalogue> findByCatalogueId(CatalogueId catalogueId);*/

    /**
     * returns the Catalogue with the given ID number
     *
     * @param catalogueId
     * @return
     */
    default Optional<Catalogue> findByCatalogueId(CatalogueId catalogueId) {
        return ofIdentity(catalogueId);
    }

    public Iterable<Catalogue> findAllActive();
}
