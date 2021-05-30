/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.base.backoffice.console.presentation.service;

import eapli.base.backoffice.console.presentation.form.RegisterFormUI;
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
public class FinishServiceUI extends AbstractUI{
 
    private final RegisterServiceController theController = new RegisterServiceController();
    private final RegisterFormUI formUI = new RegisterFormUI();
    
     @Override
    protected boolean doShow() {
        
        //qual o serviço a editar
        final Iterable<Service> services = this.theController.inactiveSservices();
        
        final SelectWidget<Service> selector = new SelectWidget<>("unfinished services:", services,
                new ServicePrinter());
        selector.show();
        final Service theService = selector.selectedElement();
        
       
        
        boolean createForm = Console.readBoolean("Create a Form for this Service?");
        
        if (createForm){
            boolean created = formUI.doShow(theService);
            
            if (created){
                boolean markActive = Console.readBoolean("Mark Service as Active ?");
                theController.markActive(theService);
            }
        }
        
        
      return false;
    
}
    
   
    @Override
    public String headline() {
        return "Finish Service";
    }
    
    
    
}
