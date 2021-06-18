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
import eapli.base.colaboratormanagement.application.AddColaboratorToTeamController;
import eapli.base.colaboratormanagement.domain.Colaborator;
import eapli.base.colaboratormanagement.repositories.ColaboratorRepository;
import eapli.base.formmanagement.domain.Form;
import eapli.base.formmanagement.domain.FormId;
import eapli.base.formmanagement.domain.FormParameter;
import eapli.base.formmanagement.domain.FormParameterData;
import eapli.base.formmanagement.domain.FormParameterId;
import eapli.base.formmanagement.domain.Label;
import eapli.base.formmanagement.repositories.FormParameterRepository;
import eapli.base.formmanagement.repositories.FormRepository;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.servicemanagement.domain.Service;
import eapli.base.servicemanagement.domain.ServiceCode;
import eapli.base.servicemanagement.repositories.ServiceRepository;
import eapli.base.teammanagement.domain.Team;
import eapli.base.teammanagement.domain.TeamCode;
import eapli.base.teammanagement.repositories.TeamRepository;
import eapli.base.ticketmanagement.application.RequestServiceController;
import eapli.base.ticketmanagement.domain.TicketId;
import eapli.framework.actions.Action;
import eapli.framework.general.domain.model.Description;
import eapli.framework.general.domain.model.Designation;
import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author andre
 */
public class TicketBootstrapper implements Action {
    private static final Logger LOGGER = LoggerFactory.getLogger(TicketBootstrapper.class);

    private final MyCataloguesController myCatController = new MyCataloguesController();
    private final RequestServiceController requestServiceController = new RequestServiceController();
    private final ServiceRepository servRepo = PersistenceContext.repositories().services();
    private final ActivityRepository actRepo = PersistenceContext.repositories().activities();
    private final ColaboratorRepository colabRepo = PersistenceContext.repositories().colaborators();
    private final CatalogueRepository catRepo = PersistenceContext.repositories().catalogues();
    private final FormRepository formRepo = PersistenceContext.repositories().forms();
    private final FormParameterRepository formParRepo = PersistenceContext.repositories().formParameters();
    
    private List<Catalogue> cats;
    List<FormParameter> formParameters;
    List<String> values = new ArrayList<>();
    
     @Override     
    public boolean execute() {  
        Colaborator c1 = colabRepo.findByMecanographicNumber(MecanographicNumber.valueOf("isep959")).get();
        Service s1 = servRepo.findByServiceCode(ServiceCode.valueOf("S1")).get();
        Form f1 = s1.getForm();
       
        
        formParameters = new ArrayList();
        for (FormParameter formPar : f1.getFormParameters()) {
            formParameters.add(formPar);
        }
    
        
        
        String answer1 = "Resposta de teste";
        values.add(answer1);
        
        requestService(s1, formParameters, values, c1);
        
        
        
        return true;
    }
    
    private void requestService(Service service, List<FormParameter> params, List<String> values, Colaborator booker) {
        
                
        requestServiceController.requestServiceOnlyForBootstrap(service, params, values, booker);
        
        LOGGER.debug("»»» Requesting Service %s", service);
    }
    
    
}
