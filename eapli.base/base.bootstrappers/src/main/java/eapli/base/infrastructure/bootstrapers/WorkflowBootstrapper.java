/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.base.infrastructure.bootstrapers;

import eapli.base.activitymanagement.domain.Activity;
import eapli.base.activitymanagement.domain.ActivityId;
import eapli.base.activitymanagement.repositories.ActivityRepository;
import eapli.base.catalogue.repositories.CatalogueRepository;
import eapli.base.cataloguemanagement.domain.Catalogue;
import eapli.base.cataloguemanagement.domain.CatalogueId;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.servicemanagement.application.RegisterServiceController;
import eapli.base.servicemanagement.domain.Service;
import eapli.base.servicemanagement.domain.ServiceCode;
import eapli.base.servicemanagement.repositories.ServiceRepository;
import eapli.base.workflowmanagement.application.RegisterWorkflowController;
import eapli.base.workflowmanagement.domain.WorkFlow;
import eapli.base.workflowmanagement.domain.WorkFlowId;
import eapli.base.workflowmanagement.repositories.WorkFlowRepository;
import eapli.framework.actions.Action;
import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author andre
 */
public class WorkflowBootstrapper implements Action {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(WorkflowBootstrapper.class);

    private final RegisterWorkflowController workflowController = new RegisterWorkflowController();
    private final WorkFlowRepository workflowRepo = PersistenceContext.repositories().workflows();
    private final ServiceRepository serviceRepo = PersistenceContext.repositories().services();
    private final ActivityRepository actRepo = PersistenceContext.repositories().activities();

    List<Activity> activitiesServ1 = new ArrayList<>();
    List<Activity> activitiesServ2 = new ArrayList<>();
    List<Activity> activitiesDemo = new ArrayList<>();
    

    @Override
    public boolean execute() {
     
        
        
        //SERVICE 1
        Service s1 = serviceRepo.findByServiceCode(ServiceCode.valueOf("S1")).get();
        Activity a1 = actRepo.findByActivityId(ActivityId.valueOf("A1")).get();
        Activity a2 = actRepo.findByActivityId(ActivityId.valueOf("A2")).get();
        activitiesServ1.add(a1);
        activitiesServ1.add(a2);
        registerNewWorkflow("W1", activitiesServ1, s1);
        //SERVICE 1
        
        //SERVICE 2
        Service s2 = serviceRepo.findByServiceCode(ServiceCode.valueOf("S2")).get();
        Activity a3 = actRepo.findByActivityId(ActivityId.valueOf("A3")).get();
        Activity a4 = actRepo.findByActivityId(ActivityId.valueOf("A4")).get();
        activitiesServ2.add(a3);
        activitiesServ2.add(a4);
        registerNewWorkflow("W2", activitiesServ2, s2);
        //SERVICE 2
        
         //SERVICE 3
        Service s3 = serviceRepo.findByServiceCode(ServiceCode.valueOf("S3")).get();
        Activity a5 = actRepo.findByActivityId(ActivityId.valueOf("A5")).get();
        Activity a6 = actRepo.findByActivityId(ActivityId.valueOf("A6")).get();
        activitiesDemo.add(a5);
        activitiesDemo.add(a6);
        registerNewWorkflow("W3", activitiesDemo, s3);
        //SERVICE 3
  
        
       
        return true;
    }
    private void registerNewWorkflow(String workflowId, List<Activity> activities, Service service) {
        
        workflowController.RegisterWorkflow(workflowId, activities, service);
        LOGGER.debug("»»» Creating new Workflow %s", workflowId);
        
    }

}
