/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.base.cataloguemanagement.application;

import eapli.base.catalogue.repositories.CatalogueRepository;
import eapli.base.cataloguemanagement.domain.Catalogue;
import eapli.base.cataloguemanagement.domain.CatalogueId;
import eapli.base.colaboratormanagement.application.ListColaboratorService;
import eapli.base.colaboratormanagement.domain.Colaborator;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.usermanagement.domain.BaseRoles;
import eapli.framework.infrastructure.authz.application.AuthorizationService;
import eapli.framework.infrastructure.authz.application.AuthzRegistry;
import eapli.framework.general.domain.model.Description;

/**
 *
 * @author andre
 */
public class RegisterCatalogueController {
   
    private final AuthorizationService authz = AuthzRegistry.authorizationService();
    private final ListColaboratorService svcColaborators = new ListColaboratorService();
    private final CatalogueRepository catalogueRepository = PersistenceContext.repositories().catalogues();

    /**
     *
     * @param colaborator
     * @param catalogueId
     * @return
     */
    public Catalogue RegisterCatalogue(final Colaborator colaborator, final String catalogueId) {
       
        authz.ensureAuthenticatedUserHasAnyOf(BaseRoles.POWER_USER, BaseRoles.ADMIN);

        final Catalogue newCatalogue = new Catalogue(colaborator, CatalogueId.valueOf(catalogueId));

        return catalogueRepository.save(newCatalogue);
      
    }
    
    
 public Iterable<Colaborator> colaborators() {
        return svcColaborators.activeColaborators();
    }
    
}
