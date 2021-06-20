/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.base.infrastructure.bootstrapers;

import eapli.base.activitymanagement.domain.Activity;
import eapli.base.activitymanagement.domain.ActivityId;
import eapli.base.activitymanagement.repositories.ActivityRepository;
import eapli.base.formmanagement.application.RegisterFormController;
import eapli.base.formmanagement.domain.FormParameter;
import eapli.base.formmanagement.domain.FormParameterData;
import eapli.base.formmanagement.domain.FormParameterId;
import eapli.base.formmanagement.domain.Label;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.servicemanagement.domain.Service;
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
public class FormInActivityBootstrapper implements Action{
    
    private static final Logger LOGGER = LoggerFactory.getLogger(FormBootstrapper.class);

    private final RegisterFormController formController = new RegisterFormController();
    private final ServiceRepository servRepo = PersistenceContext.repositories().services();
    private final ActivityRepository actRepo = PersistenceContext.repositories().activities();
   
    private final List<Service> services = new ArrayList<Service>();
    private final List<FormParameter> formParameters = new ArrayList<FormParameter>();

    

    @Override
    public boolean execute() {
        FormParameter fp1 = new FormParameter(FormParameterId.valueOf("1"),
                Designation.valueOf("User Name"),
                Label.valueOf("NAME"),
                Description.valueOf("Name of the person filling the form"),
                FormParameterData.valueOf("String"));
        formParameters.add(fp1);
        
        
        
        //FOR SERVICE 2
        
        FormParameter fp11 = new FormParameter(FormParameterId.valueOf("12"),
                Designation.valueOf("Decisao"),
                Label.valueOf("D"),
                Description.valueOf("Decisao"),
                FormParameterData.valueOf("String"));
        
        FormParameter fp12 = new FormParameter(FormParameterId.valueOf("13"),
                Designation.valueOf("Motivo"),
                Label.valueOf("M"),
                Description.valueOf("Motivo da decisao"),
                FormParameterData.valueOf("String"));
        
        FormParameter fp13 = new FormParameter(FormParameterId.valueOf("14"),
                Designation.valueOf("Percentagem de desconto"),
                Label.valueOf("D"),
                Description.valueOf("Percentagem de desconto"),
                FormParameterData.valueOf("String"));// pode mudar
        
        FormParameter fp14 = new FormParameter(FormParameterId.valueOf("15"),
                Designation.valueOf("data limite (caso faça sentido)"),
                Label.valueOf("DL"),
                Description.valueOf("data limite (caso faça sentido)"),
                FormParameterData.valueOf("STRING"));
        
        
        
        // FOR SERVICE 2
        
        Activity a1 = actRepo.findByActivityId(ActivityId.valueOf("A3")).get();
        
        registerFormInActivity("F8", "Form3",a1, formParameters);
        //registerFormInActivity("F4", "Form2",a1, formParameters);

        return true;
    }
        
    
    private void registerFormInActivity(String formId, String name, Activity activity, List<FormParameter> formParameters) {
        
        formController.registerFormInActivity(formId, name, activity, formParameters);
        LOGGER.debug("»»» Creating new Form %s", formId);
        
    }
    
    
}
