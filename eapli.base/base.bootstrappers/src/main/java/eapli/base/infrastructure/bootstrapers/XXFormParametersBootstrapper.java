/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.base.infrastructure.bootstrapers;

import eapli.base.activitymanagement.repositories.ActivityRepository;
import eapli.base.catalogue.repositories.CatalogueRepository;
import eapli.base.cataloguemanagement.application.MyCataloguesController;
import eapli.base.cataloguemanagement.domain.Catalogue;
import eapli.base.clientusermanagement.domain.MecanographicNumber;
import eapli.base.colaboratormanagement.domain.Colaborator;
import eapli.base.colaboratormanagement.repositories.ColaboratorRepository;
import eapli.base.formmanagement.domain.FormParameter;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.servicemanagement.domain.Service;
import eapli.base.servicemanagement.domain.ServiceCode;
import eapli.base.servicemanagement.repositories.ServiceRepository;
import eapli.base.ticketmanagement.application.RequestServiceController;
import eapli.framework.actions.Action;
import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author andre
 */
public class XXFormParametersBootstrapper /*implements Action*/ {
    /*
    private static final Logger LOGGER = LoggerFactory.getLogger(FormParametersBootstrapper.class);

    private final MyCataloguesController myCatController = new MyCataloguesController();
    private final RequestServiceController requestServiceController = new RequestServiceController();
    private final ServiceRepository servRepo = PersistenceContext.repositories().services();
    private final ActivityRepository actRepo = PersistenceContext.repositories().activities();
    private final ColaboratorRepository colabRepo = PersistenceContext.repositories().colaborators();
    private final CatalogueRepository catRepo = PersistenceContext.repositories().catalogues();
    private List<Catalogue> cats;
    
 
     @Override     
    public boolean execute() {  
        Service s1 = servRepo.findByServiceCode(ServiceCode.valueOf("S4")).get();
        
        
        requestService(1, );
        requestService("isep959", "002");
        requestService("isep959", "003", );
        
        
        return true;
    }
    
    private void registerParameters(String formParameterId, String designation, String label, String description, String data) {
        
                        
        requestServiceController.requestService(service, params, values);
        
        LOGGER.debug("»»» Requesting Service %s", service);
    }
    */
    
}
