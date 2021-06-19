/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.base.app.backoffice.console.presentation.activity;

import eapli.base.activitymanagement.application.MyActivitiesController;
import eapli.base.activitymanagement.application.PerformActivityController;
import eapli.base.activitymanagement.application.RegisterActivityController;
import eapli.base.activitymanagement.domain.Activity;
import eapli.base.activitymanagement.domain.ActivityExecution;
import eapli.base.activitymanagement.dto.TicketActivityExecutionDto;
import eapli.base.app.backoffice.console.presentation.colaborator.ColaboratorPrinter;
import eapli.base.backoffice.console.presentation.form.FormPrinter;
import eapli.base.backoffice.console.presentation.workflow.RegisterWorkflowUI;
import eapli.base.colaboratormanagement.domain.Colaborator;
import eapli.base.formmanagement.application.RegisterFormController;
import eapli.base.formmanagement.domain.Form;
import eapli.framework.domain.repositories.IntegrityViolationException;
import eapli.framework.io.util.Console;
import eapli.framework.presentation.console.AbstractUI;
import eapli.framework.presentation.console.SelectWidget;

/**
 *
 * @author andre
 */
public class AssignActivityToColabManuallyUI extends AbstractUI {
    
    //private final RegisterServiceController theController = new RegisterServiceController();
    private final RegisterActivityController theController = new RegisterActivityController();
    private final RegisterFormController formController =  new RegisterFormController();
    private final MyActivitiesController myActivitiesController = new MyActivitiesController();
   // private final RegisterFormUI formUI = new RegisterFormUI();
    private final RegisterWorkflowUI workflowUI = new RegisterWorkflowUI();
   
     
    @Override
    protected boolean doShow() {
        
        
        
        //-----------especificaçao de activity
        final Iterable<TicketActivityExecutionDto> activity = this.myActivitiesController.myActivities();
        
        final SelectWidget<TicketActivityExecutionDto> selector = new SelectWidget<>("Activities:", activity,
                new ActivityExecutionPrinter());
        selector.show();
        final TicketActivityExecutionDto theActivity = selector.selectedElement();
        //-----------
        
        //especificaçao do colab
        final Iterable<Colaborator> colaborator = this.theController.colaborators();
        
        final SelectWidget<Colaborator> colabSelector = new SelectWidget<>("Colaborators:", colaborator,
                new ColaboratorPrinter());
        selector.show();
        final Colaborator theColaborator = colabSelector.selectedElement();
        //-----------
        
        //Activity activity;
         try {
         this.theController.assignActivityToColabManually(theColaborator, theActivity.activityExecution);
            
        } catch (@SuppressWarnings("unused") final IntegrityViolationException e) {
            System.out.println("You tried to add an Activity to a Colab wich already exists in the database.");
            return true;
        }

        
      return false;
    
}
    
   
    @Override
    public String headline() {
        return "Assign Activity to Colaborator";
    }
    

}
