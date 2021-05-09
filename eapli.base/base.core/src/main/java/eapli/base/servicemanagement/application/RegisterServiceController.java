/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.base.servicemanagement.application;

import eapli.base.cataloguemanagement.application.ListCatalogueService;
import eapli.base.cataloguemanagement.domain.Catalogue;
import eapli.base.colaboratormanagement.domain.Colaborator;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.servicemanagement.domain.Service;
import eapli.base.servicemanagement.domain.ServiceCode;
import eapli.base.servicemanagement.repositories.ServiceRepository;
import eapli.base.usermanagement.domain.BaseRoles;
import eapli.framework.general.domain.model.Description;
import eapli.framework.general.domain.model.Designation;
import eapli.framework.infrastructure.authz.application.AuthorizationService;
import eapli.framework.infrastructure.authz.application.AuthzRegistry;

/**
 *
 * @author andre
 */
public class RegisterServiceController {
     
    private final AuthorizationService authz = AuthzRegistry.authorizationService();
    private final ListCatalogueService svcCatalogues = new ListCatalogueService();
    private final ServiceRepository serviceRepository = PersistenceContext.repositories().services();

    /**
     *
     * @param serviceCode
     * @param serviceDescription
     * @param serviceTitle
     * @param catalogue
     * @return
     */
    public Service RegisterService(final String serviceCode, final String serviceDescription, final String serviceTitle, final Catalogue catalogue) {
       
        authz.ensureAuthenticatedUserHasAnyOf(BaseRoles.POWER_USER, BaseRoles.ADMIN);

        final Service newService = new Service(ServiceCode.valueOf(serviceCode), Description.valueOf(serviceDescription),  Designation.valueOf(serviceTitle), catalogue);
                    
        return serviceRepository.save(newService);
      
    }
    
    
    public Iterable<Catalogue> catalogues() {
        return svcCatalogues.activeCatalogues();
    }

    
    
}
