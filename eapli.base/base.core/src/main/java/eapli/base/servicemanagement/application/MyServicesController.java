/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.base.servicemanagement.application;

import eapli.base.catalogue.repositories.CatalogueRepository;
import eapli.base.cataloguemanagement.domain.Catalogue;
import eapli.base.colaboratormanagement.repositories.ColaboratorRepository;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.servicemanagement.domain.Service;
import eapli.base.servicemanagement.repositories.ServiceRepository;
import eapli.framework.infrastructure.authz.application.AuthorizationService;
import eapli.framework.infrastructure.authz.application.AuthzRegistry;

/**
 *
 * @author andre
 */
public class MyServicesController {
    
    private final CatalogueRepository catRepo = PersistenceContext.repositories().catalogues();
    private final ServiceRepository servRepo = PersistenceContext.repositories().services();
    private final ColaboratorRepository colabRepo = PersistenceContext.repositories().colaborators();
    private final AuthorizationService authz = AuthzRegistry.authorizationService();
    //private final ListCatalogueService svcCatalogues = new ListCatalogueService();


    public Iterable<Service> myServices(Catalogue catalogue) {
        //authz.ensureAuthenticatedUserHasAnyOf(BaseRoles.COLABORATOR);
        return servRepo.findByCatalogue(catalogue);
    }
    
    

    

    
    
}
