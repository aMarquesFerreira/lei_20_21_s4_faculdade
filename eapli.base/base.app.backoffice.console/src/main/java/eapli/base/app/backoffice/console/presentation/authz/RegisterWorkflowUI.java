/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.base.app.backoffice.console.presentation.authz;

import eapli.base.activitymanagement.domain.Activity;
import eapli.base.app.backoffice.console.presentation.activity.ActivityPrinter;
import eapli.base.backoffice.console.presentation.service.ServicePrinter;
import eapli.base.servicemanagement.domain.Service;
import eapli.base.workflowmanagement.application.RegisterWorkflowController;
import eapli.framework.domain.repositories.IntegrityViolationException;
import eapli.framework.io.util.Console;
import eapli.framework.presentation.console.AbstractUI;
import eapli.framework.presentation.console.SelectWidget;

import java.util.ArrayList;
import java.util.List;
        
        
        

/**
 *
 * @author andre
 */
public class RegisterWorkflowUI extends AbstractUI {
    
    
     
    private final RegisterWorkflowController theController = new RegisterWorkflowController();
    //private final RegisterFormController formController =  new RegisterFormController();
    //private final RegisterFormUI formUI = new RegisterFormUI();
    final Iterable<Activity> activities = this.theController.activities();
    
    
    @Override
    protected boolean doShow() { 
        List<Activity> theActivities = new ArrayList<>();
        
        boolean moreActivities = true;
        while(moreActivities){
            final SelectWidget<Activity> selector = new SelectWidget<>("Activities:", activities, new ActivityPrinter());
            selector.show();
        
            final Activity Activity = selector.selectedElement();
            theActivities.add(Activity);
            
            moreActivities = Console.readBoolean("Add more Activities? (y/n)");
        }

        //especificacao do ID
        final String workflowId = Console.readLine("Workflow ID");
        //--------
        List<Service> theServices = new ArrayList<>();
        
        final SelectWidget<Service> serviceSelector = new SelectWidget<>("Services:", theServices, new ServicePrinter());
        serviceSelector.show();
        
        final Service service = serviceSelector.selectedElement();
        theServices.add(service);
        
         try {
            this.theController.RegisterWorkflow(workflowId, theActivities, service);
        } catch (@SuppressWarnings("unused") final IntegrityViolationException e) {
            System.out.println("You tried to enter a workflow which already exists in the database.");
        }
      
      return false;
    
}
    
   
    @Override
    public String headline() {
        return "Register Service";
    }
    

    
}
