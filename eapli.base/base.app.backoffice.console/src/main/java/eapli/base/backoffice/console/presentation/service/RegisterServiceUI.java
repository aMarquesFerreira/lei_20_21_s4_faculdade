/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.base.backoffice.console.presentation.service;

import eapli.base.app.backoffice.console.presentation.catalogue.CataloguePrinter;
import eapli.base.app.backoffice.console.presentation.colaborator.ColaboratorPrinter;
import eapli.base.backoffice.console.presentation.form.RegisterFormUI;
import eapli.base.cataloguemanagement.domain.Catalogue;
import eapli.base.colaboratormanagement.domain.Colaborator;
import eapli.base.formmanagement.domain.Form;
import eapli.base.formmanagement.domain.FormParameters;
import eapli.base.servicemanagement.application.RegisterServiceController;
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
public class RegisterServiceUI extends AbstractUI{
    
    
    private final RegisterServiceController theController = new RegisterServiceController();
    private final RegisterFormUI formUI = new RegisterFormUI();

    //private final ListTeamService listTeamService = new ListTeamService();
    
    @Override
    protected boolean doShow() {
        
       /* //especificaçao do catálogo
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


        //------especificaco de formulario-----------//
        
        System.out.println("------especificaco de formulario-----------");
        System.out.println(" ");
        String formId = Console.readLine("formId");
        String name = Console.readLine("name");
        String parameterData = Console.readLine("parameterData");
        String variableName = Console.readLine("FormVariableName");
        String label = Console.readLine("label");
        String description = Console.readLine("description");
        
        List<FormParameters> theAttributes = new ArrayList<>();
        
        //ciclo para acrescentar mais campos de atributos ao formulario
        boolean moreAttributes = true;
        while(moreAttributes){
            formId = Console.readLine("formId");
            name = Console.readLine("name");
            parameterData = Console.readLine("parameterData");
            variableName = Console.readLine("FormVariableName");
            label = Console.readLine("label");
            description = Console.readLine("description");
            
            final FormParameters theAttribute = new FormParameters(parameterData, variableName, label, description);
           
           
            theAttributes.add(theAttribute);
            
            moreAttributes = Console.readBoolean("Add more Attributes? (y/n)");
        }        
       
       
        Service theService = this.theController.RegisterService(serviceCode, serviceDescription, serviceTitle, theCatalogue, theForm);  
        Form theForm = this.theController.RegisterForm(formId, name, theService, theAttributes);
        
        
        

        return false;
    

    }
    
    private Form registerForm(){
        
        System.out.println("------especificaco de formulario-----------");
        System.out.println(" ");
        String formId = Console.readLine("formId");
        String name = Console.readLine("name");
        String parameterData = Console.readLine("parameterData");
        String variableName = Console.readLine("FormVariableName");
        String label = Console.readLine("label");
        String description = Console.readLine("description");
        
        List<FormParameters> theAttributes = new ArrayList<>();
        
        //ciclo para acrescentar mais campos de atributos ao formulario
        boolean moreAttributes = true;
        while(moreAttributes){
            formId = Console.readLine("formId");
            name = Console.readLine("name");
            parameterData = Console.readLine("parameterData");
            variableName = Console.readLine("FormVariableName");
            label = Console.readLine("label");
            description = Console.readLine("description");
            
            final FormParameters theAttribute = new FormParameters(parameterData, variableName, label, description);
           
           
            theAttributes.add(theAttribute);
            
            moreAttributes = Console.readBoolean("Add more Attributes? (y/n)");
        }        
       
        try {
            Service theService;
            Form form = this.theController.RegisterForm(formId, name, theService, theAttributes);
        } catch (@SuppressWarnings("unused") final IntegrityViolationException e) {
            System.out.println("You tried to enter a Form which already exists in the database.");
        }
        
        return form;
    }

    
    private Service registerService(){
        
        System.out.println("------especificaco de formulario-----------");
        System.out.println(" ");
        String formId = Console.readLine("formId");
        String name = Console.readLine("name");
        String parameterData = Console.readLine("parameterData");
        String variableName = Console.readLine("FormVariableName");
        String label = Console.readLine("label");
        String description = Console.readLine("description");
        
        List<FormParameters> theAttributes = new ArrayList<>();
        
        //ciclo para acrescentar mais campos de atributos ao formulario
        boolean moreAttributes = true;
        while(moreAttributes){
            formId = Console.readLine("formId");
            name = Console.readLine("name");
            parameterData = Console.readLine("parameterData");
            variableName = Console.readLine("FormVariableName");
            label = Console.readLine("label");
            description = Console.readLine("description");
            
            final FormParameters theAttribute = new FormParameters(parameterData, variableName, label, description);
           
           
            theAttributes.add(theAttribute);
            
            moreAttributes = Console.readBoolean("Add more Attributes? (y/n)");
        }        
       
        try {
            Service theService;
            Form form = this.theController.RegisterForm(formId, name, theService, theAttributes);
        } catch (@SuppressWarnings("unused") final IntegrityViolationException e) {
            System.out.println("You tried to enter a Form which already exists in the database.");
        }
*/        
        return false;

    }
    
    @Override
    public String headline() {
        return "Register Service";
    }
    


    
}
