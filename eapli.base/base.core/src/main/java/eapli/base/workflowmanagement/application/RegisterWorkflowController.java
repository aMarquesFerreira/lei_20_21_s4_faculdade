/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.base.workflowmanagement.application;

import eapli.base.activitymanagement.application.ListActivityService;
import eapli.base.activitymanagement.domain.Activity;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.servicemanagement.application.ListServiceService;
import eapli.base.servicemanagement.domain.Service;
import eapli.base.usermanagement.domain.BaseRoles;
import eapli.base.workflowmanagement.domain.WorkFlow;
import eapli.base.workflowmanagement.domain.WorkFlowId;
import eapli.base.workflowmanagement.repositories.WorkFlowRepository;
import eapli.framework.infrastructure.authz.application.AuthorizationService;
import eapli.framework.infrastructure.authz.application.AuthzRegistry;

import java.util.List;

/**
 *
 * @author andre
 */
public class RegisterWorkflowController {
    
    
    private final AuthorizationService authz = AuthzRegistry.authorizationService();
    private final ListActivityService svcActivities = new ListActivityService();
    private final ListServiceService svcServices = new ListServiceService();
    //private final ListTeamService svcTeams = new ListTeamService();
    private final WorkFlowRepository workflowRepo = PersistenceContext.repositories().workflows();

    /**
     *
     * @param workflowId
     * @param activities
     * @param service
     * @return
     */
    public WorkFlow RegisterWorkflow(final String workflowId, List<Activity> activities, Service service) {
       
        authz.ensureAuthenticatedUserHasAnyOf(BaseRoles.POWER_USER, BaseRoles.ADMIN, BaseRoles.HELP_DESK_SERVICE_MANAGER);

        final WorkFlow newWorkflow = new WorkFlow(WorkFlowId.valueOf(workflowId), service);
            
        activities.forEach(a -> {newWorkflow.addActivities(a);});
        
        return workflowRepo.save(newWorkflow);
      
    }
    
    
    public Iterable<Activity> activities() {
        return svcActivities.activeActivities();
    }
    
    public Iterable<Service> services() {
        return svcServices.inactiveServices();
    }
 
    
}
