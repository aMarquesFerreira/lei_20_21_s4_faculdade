/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.base.activitymanagement.application;

import eapli.base.activitymanagement.domain.Activity;
import eapli.base.activitymanagement.domain.ActivityId;
import eapli.base.activitymanagement.repositories.ActivityRepository;
import eapli.base.colaboratormanagement.application.ListColaboratorService;
import eapli.base.colaboratormanagement.domain.Colaborator;
import eapli.base.formmanagement.application.ListFormService;
import eapli.base.formmanagement.domain.Form;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.usermanagement.domain.BaseRoles;
import eapli.framework.general.domain.model.Description;
import eapli.framework.general.domain.model.Designation;
import eapli.framework.infrastructure.authz.application.AuthorizationService;
import eapli.framework.infrastructure.authz.application.AuthzRegistry;

/**
 *
 * @author andre
 */
public class RegisterActivityController {
    
    private final AuthorizationService authz = AuthzRegistry.authorizationService();
    private final ListColaboratorService svcColaborators = new ListColaboratorService();
    private final ListFormService svcForms = new ListFormService();
    private final ActivityRepository activityRepository = PersistenceContext.repositories().activities();

    /**
     *
     * @param activityId
     * @param description
     * @param colaborator
     * @param form
     * @return
     */
    public Activity RegisterActivity(final String activityId, final String description, final Colaborator colaborator,final Form form) {
       
        authz.ensureAuthenticatedUserHasAnyOf(BaseRoles.POWER_USER, BaseRoles.ADMIN, BaseRoles.HELP_DESK_SERVICE_MANAGER);

        final Activity newActivity = new Activity(ActivityId.valueOf(activityId), Description.valueOf(description), form, colaborator);
                    
        return activityRepository.save(newActivity);
      
    }
    
    
    public Iterable<Colaborator> colaborators() {
        return svcColaborators.activeColaborators();
    }
    
     public Iterable<Form> forms() {
        return svcForms.activeForms();
    }

    
}
