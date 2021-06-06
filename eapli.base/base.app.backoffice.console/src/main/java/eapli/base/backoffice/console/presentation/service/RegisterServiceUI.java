/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.base.backoffice.console.presentation.service;

import eapli.base.app.backoffice.console.presentation.catalogue.CataloguePrinter;
import eapli.base.backoffice.console.presentation.form.RegisterFormUI;
import eapli.base.backoffice.console.presentation.workflow.RegisterWorkflowUI;
import eapli.base.cataloguemanagement.domain.Catalogue;
import eapli.base.formmanagement.application.RegisterFormController;
import eapli.base.servicemanagement.application.RegisterServiceController;
import eapli.base.servicemanagement.domain.Service;
import eapli.framework.domain.repositories.IntegrityViolationException;
import eapli.framework.io.util.Console;
import eapli.framework.presentation.console.AbstractUI;
import eapli.framework.presentation.console.SelectWidget;


/**
 *
 * @author andre
 */
public class RegisterServiceUI extends AbstractUI{
    
    
    private final RegisterServiceController theController = new RegisterServiceController();
    private final RegisterFormController formController =  new RegisterFormController();
    private final RegisterFormUI formUI = new RegisterFormUI();
    private final RegisterWorkflowUI workflowUI = new RegisterWorkflowUI();
    
    
    @Override
    protected boolean doShow() {
        
        //especificaçao do catálogo
        final Iterable<Catalogue> catalogues = this.theController.catalogues();
        
        final SelectWidget<Catalogue> selector = new SelectWidget<>("Catalogues:", catalogues,
                new CataloguePrinter());
        selector.show();
        final Catalogue theCatalogue = selector.selectedElement();
        //-----------

        //especificacao do servico
        final String serviceCode = Console.readLine("ServiceCode");

        final String serviceDescription = Console.readLine("Service Description");

        final String serviceTitle = Console.readLine("Service Title");
        //--------
        
        Service service;
         try {
            service = this.theController.RegisterService(serviceCode, serviceDescription, serviceTitle, theCatalogue);
            
        } catch (@SuppressWarnings("unused") final IntegrityViolationException e) {
            System.out.println("You tried to enter a Service which already exists in the database.");
            return true;
        }

        //especificacao de form
        boolean createForm = Console.readBoolean("Create a Form ?");
        
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
        }
        
        
      return false;
    
}
    
   
    @Override
    public String headline() {
        return "Register Service";
    }
    


    
}
