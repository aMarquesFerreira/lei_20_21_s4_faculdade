/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.base.activitymanagement.application;

import eapli.base.activitymanagement.domain.Activity;
import eapli.base.activitymanagement.domain.ActivityExecution;
import eapli.base.activitymanagement.domain.ActivityId;
import eapli.base.activitymanagement.domain.ActivityType;
import eapli.base.activitymanagement.domain.ExecutionTime;
import eapli.base.activitymanagement.repositories.ActivityRepository;
import eapli.base.clientusermanagement.domain.MecanographicNumber;
import eapli.base.colaboratormanagement.application.ListColaboratorService;
import eapli.base.colaboratormanagement.domain.Colaborator;
import eapli.base.colaboratormanagement.repositories.ColaboratorRepository;
import eapli.base.formmanagement.application.ListFormService;
import eapli.base.formmanagement.domain.Form;
import eapli.base.formmanagement.repositories.FormRepository;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.ticketmanagement.application.RequestServiceController;
import eapli.base.usermanagement.domain.BaseRoles;
import eapli.framework.general.domain.model.Description;
import eapli.framework.infrastructure.authz.application.AuthorizationService;
import eapli.framework.infrastructure.authz.application.AuthzRegistry;

/**
 *
 * @author andre
 */
public class RegisterActivityController {
    
    ////
    //private final RegisterActivityController activityController = new RegisterActivityController();
    private final ColaboratorRepository colabRepo = PersistenceContext.repositories().colaborators();
    private final FormRepository formRepo = PersistenceContext.repositories().forms();
    private final ActivityRepository actRepo = PersistenceContext.repositories().activities();
    private final RequestServiceController requestServController =  new RequestServiceController();
    //private final ActivityDistribution actDistrib = new ActivityDistribution();
    
    ///
    private final AuthorizationService authz = AuthzRegistry.authorizationService();
    private final ListColaboratorService svcColaborators = new ListColaboratorService();
    private final ListFormService svcForms = new ListFormService();
    private final ListActivityService svcAct = new ListActivityService();
    private final ActivityRepository activityRepository = PersistenceContext.repositories().activities();

    /**
     *
     * @param activityId
     * @param description
     * @param type
     * @param colaborator
     * @return
     */
    public Activity RegisterActivity(final String activityId, final String description,final String type,final Integer execTime, final Colaborator colaborator/*,final Form form*/) {
       
        authz.ensureAuthenticatedUserHasAnyOf(BaseRoles.POWER_USER, BaseRoles.ADMIN, BaseRoles.HELP_DESK_SERVICE_MANAGER);

        final Activity newActivity = new Activity(ActivityId.valueOf(activityId), Description.valueOf(description),ActivityType.valueOf(type),ExecutionTime.valueOf(execTime)/*,form, colaborator*/);
                    
        return activityRepository.save(newActivity);
      
    }
     
    
    
    public Iterable<Colaborator> colaborators() {
        return svcColaborators.activeColaborators();
    }
    
    public Iterable<Form> forms() {
        return svcForms.activeForms();
    }

     public Iterable<Activity> activities() {
        return svcAct.activeActivities();
    }

     
     
     ///SIMULATION
     
    /*
    public boolean execute() {
        Colaborator c1 = colabRepo.findByMecanographicNumber(MecanographicNumber.valueOf("isep959")).get();
        Activity a1 = actRepo.findByActivityId(ActivityId.valueOf("A2")).get();
        
        assignActivityToColabManually(c1, a1);
        actRepo.save(a1);

        return true;
    }*/
    
    public ActivityExecution assignActivityToColabManually(Colaborator colab, ActivityExecution act){
        act.assignToColaborator(colab);
        return act;
    }
    

     ///SIMULATION
    
}
