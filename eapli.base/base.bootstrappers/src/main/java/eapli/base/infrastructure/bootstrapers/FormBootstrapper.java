/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.base.infrastructure.bootstrapers;

import eapli.base.activitymanagement.domain.Activity;
import eapli.base.cataloguemanagement.domain.CatalogueId;
import eapli.base.formmanagement.application.RegisterFormController;
import eapli.base.formmanagement.domain.FormParameter;
import eapli.base.formmanagement.domain.FormParameterData;
import eapli.base.formmanagement.domain.FormParameterId;
import eapli.base.formmanagement.domain.Label;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.servicemanagement.domain.Service;
import eapli.base.servicemanagement.domain.ServiceCode;
import eapli.base.servicemanagement.repositories.ServiceRepository;
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


/*FormId formId, final Designation name, List<FormParameter> formParameters*/
public class FormBootstrapper implements Action{
    
    private static final Logger LOGGER = LoggerFactory.getLogger(FormBootstrapper.class);

    private final RegisterFormController formController = new RegisterFormController();
    private final ServiceRepository servRepo = PersistenceContext.repositories().services();
   
    private final List<Service> services = new ArrayList<Service>();
    List<FormParameter> formParameters = new ArrayList<>();

    

    @Override
    public boolean execute() {
        FormParameter fp1 = new FormParameter(FormParameterId.valueOf("2"),
                Designation.valueOf("test Name"),
                Label.valueOf("test"),
                Description.valueOf("test"),
                FormParameterData.valueOf("Boolean"));
        formParameters.add(fp1);
        
        Service svc1 = servRepo.findByServiceCode(ServiceCode.valueOf("S1")).get();

        
            
        registerNewFormInService("F1", "Form1",svc1, formParameters);
        
        //registerNewFormInService("F2", "Form2",svc1, formParameters);

        return true;
    }
    private void registerNewFormInService(String formId, String name, Service service, List<FormParameter> formParameters) {
        
        formController.RegisterFormInService(formId, name, service, formParameters);
        LOGGER.debug("»»» Creating new Form %s", formId);
        
    }
    
    
    /*private void registerFormInActivity(String formId, String name, Activity activity, List<FormParameter> formParameters) {
        
        formController.registerFormInActivity(formId, name, activity, formParameters);
        LOGGER.debug("»»» Creating new Form %s", formId);
        
    }*/
    
    
}
