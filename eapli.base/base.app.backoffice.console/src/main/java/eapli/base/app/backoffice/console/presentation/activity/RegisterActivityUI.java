/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.base.app.backoffice.console.presentation.activity;

import eapli.base.activitymanagement.application.RegisterActivityController;
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
public class RegisterActivityUI extends AbstractUI {
    
    //private final RegisterServiceController theController = new RegisterServiceController();
    private final RegisterActivityController theController = new RegisterActivityController();
    private final RegisterFormController formController =  new RegisterFormController();
   // private final RegisterFormUI formUI = new RegisterFormUI();
    private final RegisterWorkflowUI workflowUI = new RegisterWorkflowUI();
   
     
    @Override
    protected boolean doShow() {
        
        //especificacao do servico
        final String activityId = Console.readLine("Activity ID");

        final String description = Console.readLine("Description");

        //--------
        
        //especificaçao do colab
        final Iterable<Colaborator> colaborator = this.theController.colaborators();
        
        final SelectWidget<Colaborator> selector = new SelectWidget<>("Colaborators:", colaborator,
                new ColaboratorPrinter());
        selector.show();
        final Colaborator theColaborator = selector.selectedElement();
        //-----------
        
        //especificaçao do form
        final Iterable<Form> form = this.theController.forms();
        
        final SelectWidget<Form> FormSelector = new SelectWidget<>("Forms:", form,
                new FormPrinter());
        selector.show();
        
        final Form theForm = FormSelector.selectedElement();
        //-----------
        
        //Activity activity;
         try {
        /*activity=*/this.theController.RegisterActivity(activityId, description, theColaborator/*, theForm*/);
            
        } catch (@SuppressWarnings("unused") final IntegrityViolationException e) {
            System.out.println("You tried to enter a Activity which already exists in the database.");
            return true;
        }

        //especificacao de form
        /*boolean createForm = Console.readBoolean("Create a Form ?");
        
        if (createForm){
            boolean created = formUI.doShow(service);
            
            if (created){
                boolean markActive = Console.readBoolean("Mark Service as Active ?");
                theController.markActive(service);
            }
        }
        
        //especificacao de workflow
        boolean createWorkflow = Console.readBoolean("Create a Workflow ?");
        
        if (createWorkflow){
            boolean created = workflowUI.doShow(service);
            
            if (created){
                boolean markActive = Console.readBoolean("Mark Service as Active ?");
                theController.markActive(service);
            }
        }*/
        
        
      return false;
    
}
    
   
    @Override
    public String headline() {
        return "Register Activity";
    }
    

    
}
