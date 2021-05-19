/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.base.backoffice.console.presentation.form;

import eapli.base.backoffice.console.presentation.service.ServicePrinter;
import eapli.base.formmanagement.application.RegisterFormController;
import eapli.base.formmanagement.domain.FormParameters;
import eapli.base.servicemanagement.domain.Service;
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
public class RegisterFormUI extends AbstractUI {
    
    private final RegisterFormController theController = new RegisterFormController();
    //final Iterable<FormParameters> formPar = this.theController.formParameters();

    //private final ListTeamService listTeamService = new ListTeamService();
    
    @Override
    public boolean doShow() {
        
        final String formId = Console.readLine("formId");
        final String name = Console.readLine("name");
        final String parameterData = Console.readLine("parameterData");
        final String variableName = Console.readLine("FormvariableNameId");
        final String label = Console.readLine("label");
        final String description = Console.readLine("description");
        
        List<FormParameters> theAttributes = new ArrayList<>();
        
        boolean moreAttributes = true;
        while(moreAttributes){
            final FormParameters theAttribute = new FormParameters(parameterData, variableName, label, description);
           
            theAttributes.add(theAttribute);
            
            moreAttributes = Console.readBoolean("Add more Attributes? (y/n)");
        }

        //select service//
        final Iterable<Service> services = this.theController.services();

        final SelectWidget<Service> selector = new SelectWidget<>("Associate this form to a  Service:", services,
                new ServicePrinter());
        selector.show();

        final Service theService = selector.selectedElement();
        //---------//

        try {
            this.theController.RegisterForm(formId, name, theService, theAttributes);
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
