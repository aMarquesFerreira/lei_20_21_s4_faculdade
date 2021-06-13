/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.base.formmanagement.application;

import eapli.base.activitymanagement.domain.Activity;
import eapli.base.activitymanagement.repositories.ActivityRepository;
import eapli.base.formmanagement.domain.Form;
import eapli.base.formmanagement.domain.FormId;
import eapli.base.formmanagement.domain.FormParameter;
import eapli.base.formmanagement.repositories.FormParameterRepository;
import eapli.base.formmanagement.repositories.FormRepository;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.servicemanagement.application.ListServiceService;
import eapli.base.servicemanagement.domain.Service;
import eapli.base.servicemanagement.repositories.ServiceRepository;
import eapli.base.usermanagement.domain.BaseRoles;
import eapli.framework.general.domain.model.Designation;
import eapli.framework.infrastructure.authz.application.AuthorizationService;
import eapli.framework.infrastructure.authz.application.AuthzRegistry;

import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import java.util.List;

/**
 *
 * @author andre
 */
public class RegisterFormController {
    @PersistenceUnit
    private EntityManagerFactory entityManagerFactory;
    
    private final AuthorizationService authz = AuthzRegistry.authorizationService();
    private final FormRepository formRepository = PersistenceContext.repositories().forms();
    private final FormParameterRepository formParRepository = PersistenceContext.repositories().formParameters();
    private final ListServiceService svcServices = new ListServiceService();
    private final ServiceRepository serviceRepository = PersistenceContext.repositories().services();
    private final ActivityRepository activityRepository = PersistenceContext.repositories().activities();

    /**
     * Constructor.
     *
     * @param formId
     * @param name
     * @param service
     * @param fp
     * @return 
     */
    public Form RegisterFormInService(final String formId, final String name, Service service, List<FormParameter> fp) {
       //value of form ID??
        
        authz.ensureAuthenticatedUserHasAnyOf(BaseRoles.POWER_USER, BaseRoles.ADMIN, BaseRoles.HELP_DESK_SERVICE_MANAGER);

        final Form newForm = new Form(FormId.valueOf(formId), Designation.valueOf(name)/*, /service, formPar*/);
        
        fp.forEach(t -> {newForm.addFormParameters(t);});
        
        //fp.forEach(t -> {formParRepository.save(t);});
        
        service.setForm(newForm);
        
        service = serviceRepository.save(service);
        
        return service.getForm();
        //return formRepository.save(newForm);
      
    }
    
    //create form parameters
   /* public Form CreateFormParameters(final String formParameterId, final String variableName, final String label, final String description, final String parameterData) {
       //value of form ID??
        
        authz.ensureAuthenticatedUserHasAnyOf(BaseRoles.POWER_USER, BaseRoles.ADMIN, BaseRoles.HELP_DESK_SERVICE_MANAGER);

        final FormParameter newFormParameters = new FormParameter(FormParameterId.valueOf(formParameterId), Designation.valueOf(variableName),
        Label.valueOf(label), Description.valueOf(description), FormParameterData.valueOf(parameterData));
        
        
        //return formRepository.save(newFormParameters);
      
    }*/
    
    public Form registerFormInActivity(final String formId, final String name, Activity activity, List<FormParameter> formPar) {
       
        authz.ensureAuthenticatedUserHasAnyOf(BaseRoles.POWER_USER, BaseRoles.ADMIN, BaseRoles.HELP_DESK_SERVICE_MANAGER);

        final Form newForm = new Form(FormId.valueOf(formId), Designation.valueOf(name)/*, formPar*/);
       
        formPar.forEach(t -> {newForm.addFormParameters(t);});
        
        activity.addForm(newForm);
        
        activity = activityRepository.save(activity);
    
        
        return activity.getForm();
    }
    
    public Iterable<Service> services() {
        return svcServices.activeServices();
    }

    public Iterable<Service> inactiveServices() {
        return svcServices.inactiveServices();
    }

    public Iterable<Service> allServices() {
        return svcServices.allServices();
    }
    
}
