/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.base.backoffice.console.presentation.form;

import eapli.base.backoffice.console.presentation.service.ServicePrinter;
import eapli.base.formmanagement.application.RegisterFormController;
import eapli.base.formmanagement.domain.FormParameter;
import eapli.base.formmanagement.domain.FormParameterData;
import eapli.base.formmanagement.domain.FormParameterId;
import eapli.base.formmanagement.domain.Label;
import eapli.base.servicemanagement.domain.Service;
import eapli.framework.domain.repositories.IntegrityViolationException;
import eapli.framework.general.domain.model.Description;
import eapli.framework.general.domain.model.Designation;
import eapli.framework.io.util.Console;
import eapli.framework.presentation.console.AbstractUI;
import eapli.framework.presentation.console.SelectWidget;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author andre
 */
public class RegisterFormUI extends AbstractUI {
    
    private final RegisterFormController theController = new RegisterFormController();
    //final Iterable<FormParameters> formPar = this.theController.formParameters();

    //private final ListTeamService listTeamService = new ListTeamService();
    
    @Override
    public boolean doShow() {
        return doShow(null);
    }
    
    
    public boolean doShow(Service service) {
        
        final String formId = Console.readLine("formId");
        final String name = Console.readLine("name");

        
        List<FormParameter> theAttributes = new ArrayList<>();
        
        boolean moreAttributes = true;
        while(moreAttributes){
            final String parameterId = Console.readLine("parameterId");
            final String parameterData = Console.readLine("parameterData");
            final String variableName = Console.readLine("Form variable Name");
            final String label = Console.readLine("label");
            final String description = Console.readLine("description"); 

            final FormParameter theAttribute = new FormParameter(
                    FormParameterId.valueOf(parameterId), 
                    Designation.valueOf(variableName), Label.valueOf(label), 
                    Description.valueOf(description),
                    FormParameterData.valueOf(parameterData));
           
            theAttributes.add(theAttribute);
            
            moreAttributes = Console.readBoolean("Add more Attributes? (y/n)");
        }

        
        //select service if not already defined//
        if (service==null){
            final Iterable<Service> services = this.theController.inactiveServices();

            final SelectWidget<Service> selector = new SelectWidget<>("Associate this form to a Service:", services,
                    new ServicePrinter());
            selector.show();
        
            service = selector.selectedElement();
        }
        //---------//

        if (service==null){
            System.out.println("No service specified, not saving");
            return false;
        }
            
        try {
            this.theController.RegisterFormInService(formId, name, service, theAttributes);
            return true;
        } catch (@SuppressWarnings("unused") final IntegrityViolationException e) {
            System.out.println("You tried to enter a Form which already exists in the database.");
        }

        return false;
    }
    
    
    @Override
    public String headline() {
        return "Register Form";
    }

    
}
