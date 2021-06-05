/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.base.infrastructure.bootstrapers;

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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

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
    private final List<FormParameter> formParameters = new ArrayList<FormParameter>();

    

    @Override
    public boolean execute() {
        FormParameter fp1 = new FormParameter(FormParameterId.valueOf("FP1"),
                Designation.valueOf("User Name"),
                Label.valueOf("NAME"),
                Description.valueOf("Name of the person filling the form"),
                FormParameterData.valueOf("String"));
        formParameters.add(fp1);
        
        Service svc1 = servRepo.findByServiceCode(ServiceCode.valueOf("S1")).get();

        registerNewFormInService("F1", "Form1",svc1, formParameters);
        registerNewFormInService("F2", "Form2",svc1, formParameters);

        return true;
    }
    private void registerNewFormInService(String formId, String name, Service service, List<FormParameter> formParameters) {
        
        formController.RegisterFormInService(formId, name, service, formParameters);
        LOGGER.debug("»»» Creating new Form %s", formId);
        
    }
    
    
}
