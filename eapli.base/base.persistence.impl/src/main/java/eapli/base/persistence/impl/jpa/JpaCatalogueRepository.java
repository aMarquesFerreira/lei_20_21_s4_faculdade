package eapli.base.persistence.impl.jpa;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import eapli.base.Application;
import eapli.base.catalogue.repositories.CatalogueRepository;
import eapli.base.cataloguemanagement.domain.Catalogue;
import eapli.base.cataloguemanagement.domain.CatalogueId;
import eapli.base.clientusermanagement.domain.ClientUser;
import eapli.base.clientusermanagement.domain.MecanographicNumber;
import eapli.base.clientusermanagement.repositories.ClientUserRepository;
import eapli.framework.domain.repositories.TransactionalContext;
import eapli.framework.infrastructure.authz.domain.model.Username;
import eapli.framework.infrastructure.repositories.impl.jpa.JpaAutoTxRepository;

/**
 *
 * @author Jorge Santos ajs@isep.ipp.pt 02/04/2016
 */
class JpaCatalogueRepository
        extends JpaAutoTxRepository<Catalogue, CatalogueId, CatalogueId>
        implements CatalogueRepository {

    public JpaCatalogueRepository(TransactionalContext autoTx) {
        super(autoTx, "catalogueId");
    }

    public JpaCatalogueRepository(String puname) {
        super(puname, Application.settings().getExtendedPersistenceProperties(),
                "catalogueId");
    }

    @Override
    public Optional<Catalogue> findByCatalogueId(CatalogueId catalogueId) {
        final Map<String, Object> params = new HashMap<>();
        params.put("catalogueId", catalogueId);
        return matchOne("e.catalogueId=:catalogueId", params);
    }

    @Override
    public Iterable<Catalogue> findAllActive() {
        return match("e.catalogue.active = true");
    }
}
