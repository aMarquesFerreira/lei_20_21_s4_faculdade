/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.base.formmanagement.application;

import eapli.base.formmanagement.domain.Form;
import eapli.base.formmanagement.domain.FormId;
import eapli.base.formmanagement.domain.FormParameters;
import eapli.base.formmanagement.repositories.FormRepository;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.servicemanagement.application.ListServiceService;
import eapli.base.servicemanagement.domain.Service;
import eapli.base.usermanagement.domain.BaseRoles;
import eapli.framework.general.domain.model.Designation;
import eapli.framework.infrastructure.authz.application.AuthorizationService;
import eapli.framework.infrastructure.authz.application.AuthzRegistry;
import java.util.List;

/**
 *
 * @author andre
 */
public class RegisterFormController {
    private final AuthorizationService authz = AuthzRegistry.authorizationService();
    private final FormRepository formRepository = PersistenceContext.repositories().forms();
    private final ListServiceService svcServices = new ListServiceService();

    /**
     * Constructor.
     *
     * @param formId
     * @param name
     * @param service
     * @param formPar
     * @return 
     */
    public Form RegisterForm(final String formId, final String name,final Service service, List<FormParameters> formPar) {
       //value of form ID??
        
        authz.ensureAuthenticatedUserHasAnyOf(BaseRoles.POWER_USER, BaseRoles.ADMIN, BaseRoles.HELP_DESK_SERVICE_MANAGER);

        final Form newForm = new Form(FormId.valueOf(formId), Designation.valueOf(name), service, formPar);
                   
        return formRepository.save(newForm);
      
    }
    
    
    public Iterable<Service> services() {
        return svcServices.activeServices();
    }
 
    /*public Iterable<> teams() {
        return svcTeams.allTeams();
    }*/
    
}
