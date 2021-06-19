/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.base.infrastructure.bootstrapers;

import eapli.base.formmanagement.application.RegisterFormController;
import eapli.base.formmanagement.domain.FormParameter;
import eapli.base.formmanagement.domain.FormParameterData;
import eapli.base.formmanagement.domain.FormParameterId;
import eapli.base.formmanagement.domain.Label;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.servicemanagement.domain.Service;
import eapli.base.servicemanagement.domain.ServiceCode;
import eapli.base.servicemanagement.repositories.ServiceRepository;
import eapli.framework.actions.Action;
import eapli.framework.general.domain.model.Description;
import eapli.framework.general.domain.model.Designation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author andre
 */


/*FormId formId, final Designation name, List<FormParameter> formParameters*/
public class FormBootstrapper implements Action{
    
    private static final Logger LOGGER = LoggerFactory.getLogger(FormBootstrapper.class);

    private final RegisterFormController formController = new RegisterFormController();
    private final ServiceRepository servRepo = PersistenceContext.repositories().services();
   
    private final List<Service> services = new ArrayList<Service>();
    List<FormParameter> formParameters = new ArrayList<>();

    List<FormParameter> formParameters2 = new ArrayList<>();
    List<FormParameter> formParameters3 = new ArrayList<>();

    

    @Override
    public boolean execute() {
        FormParameter fp1 = new FormParameter(FormParameterId.valueOf("2"),
                Designation.valueOf("test Name"),
                Label.valueOf("test"),
                Description.valueOf("test"),
                FormParameterData.valueOf("Boolean"));
        formParameters.add(fp1);

        /*FormParameter fp2 = new FormParameter(FormParameterId.valueOf("3"),
                Designation.valueOf("Internal Code"),
                Label.valueOf("IC"),
                Description.valueOf("internal code of the client"),
                FormParameterData.valueOf("String"));
        
        FormParameter fp3 = new FormParameter(FormParameterId.valueOf("4"),
                Designation.valueOf("Nome"),
                Label.valueOf("N"),
                Description.valueOf("Name of the requester"),
                FormParameterData.valueOf("String"));
        
        FormParameter fp4 = new FormParameter(FormParameterId.valueOf("5"),
                Designation.valueOf("Tipo de desconto"),
                Label.valueOf("TD"),
                Description.valueOf("Tipo de desconto"),
                FormParameterData.valueOf("String"));
        
        FormParameter fp5 = new FormParameter(FormParameterId.valueOf("6"),
                Designation.valueOf("Recorrência"),
                Label.valueOf("R"),
                Description.valueOf("Recorrência"),
                FormParameterData.valueOf("Integer"));
        
        FormParameter fp6 = new FormParameter(FormParameterId.valueOf("7"),
                Designation.valueOf("Percentagem de Desconto"),
                Label.valueOf("PD"),
                Description.valueOf("Percentagem de Desconto"),
                FormParameterData.valueOf("Integer"));
        
        FormParameter fp7 = new FormParameter(FormParameterId.valueOf("8"),
                Designation.valueOf("Valor de Desconto"),
                Label.valueOf("VD"),
                Description.valueOf("Valor de Desconto"),
                FormParameterData.valueOf("Integer"));
        
        FormParameter fp8 = new FormParameter(FormParameterId.valueOf("9"),
                Designation.valueOf("Identificação da Fatura"),
                Label.valueOf("IF"),
                Description.valueOf("Identificação da Fatura"),
                FormParameterData.valueOf("String"));
        
        FormParameter fp9 = new FormParameter(FormParameterId.valueOf("10"),
                Designation.valueOf("Data Limite"),
                Label.valueOf("DL"),
                Description.valueOf("Data Limite"),
                FormParameterData.valueOf("String"));// pode mudar
        
        FormParameter fp10 = new FormParameter(FormParameterId.valueOf("11"),
                Designation.valueOf("Fundamentação do pedido"),
                Label.valueOf("FP"),
                Description.valueOf("Fundamentação do pedido"),
                FormParameterData.valueOf("String"));*/
        
        ///////////////// FOR SERVICE 2//
 //Código Interno Cliente, Nome, Tipo de Desconto, Recorrência, Percentagem de Desconto, Valor de Desconto, Identificação da Fatura, Data Limite, Fundamentação do pedido      
        FormParameter fp11 = new FormParameter(FormParameterId.valueOf("12"),
                Designation.valueOf("Codigo Interno Cliente"),
                Label.valueOf("CI"),
                Description.valueOf("Codigo Interno Cliente"),
                FormParameterData.valueOf("String"));
        
        FormParameter fp12 = new FormParameter(FormParameterId.valueOf("13"),
                Designation.valueOf("Nome"),
                Label.valueOf("NM"),
                Description.valueOf("Nome"),
                FormParameterData.valueOf("String"));
        
        FormParameter fp13 = new FormParameter(FormParameterId.valueOf("14"),
                Designation.valueOf("Tipo de Desconto"),
                Label.valueOf("TD"),
                Description.valueOf("Tipo de Desconto"),
                FormParameterData.valueOf("String"));// pode mudar
        
        FormParameter fp14 = new FormParameter(FormParameterId.valueOf("15"),
                Designation.valueOf("Recorrência"),
                Label.valueOf("RC"),
                Description.valueOf("Recorrência"),
                FormParameterData.valueOf("STRING"));
        
         FormParameter fp15 = new FormParameter(FormParameterId.valueOf("15"),
                Designation.valueOf("Percentagem de Desconto"),
                Label.valueOf("PD"),
                Description.valueOf("Percentagem de Desconto"),
                FormParameterData.valueOf("STRING"));
         
          FormParameter fp16 = new FormParameter(FormParameterId.valueOf("15"),
                Designation.valueOf("Valor de Desconto"),
                Label.valueOf("VD"),
                Description.valueOf("Valor de Desconto"),
                FormParameterData.valueOf("STRING"));
          
           FormParameter fp17 = new FormParameter(FormParameterId.valueOf("15"),
                Designation.valueOf("Identificação da Fatura,"),
                Label.valueOf("IF"),
                Description.valueOf("Identificação da Fatura,"),
                FormParameterData.valueOf("STRING"));
           
            FormParameter fp18 = new FormParameter(FormParameterId.valueOf("15"),
                Designation.valueOf("Data Limite"),
                Label.valueOf("DL"),
                Description.valueOf("Data Limite"),
                FormParameterData.valueOf("STRING"));
            
             FormParameter fp19 = new FormParameter(FormParameterId.valueOf("15"),
                Designation.valueOf("Fundamentação do pedido"),
                Label.valueOf("FP"),
                Description.valueOf("Fundamentação do pedido"),
                FormParameterData.valueOf("STRING"));
        
        
        ///////////////////// FOR SERVICE 2
        
        
       /* //SERVICE 1
        formParameters2.add(fp2);
        formParameters2.add(fp3);
        formParameters2.add(fp4);
        formParameters2.add(fp5);
        formParameters2.add(fp6);
        formParameters2.add(fp7);
        formParameters2.add(fp8);
        formParameters2.add(fp9);
        formParameters2.add(fp10);
        //SERVICE 1*/
        
        //SERVICE 2
        formParameters3.add(fp11);
        formParameters3.add(fp12);
        formParameters3.add(fp13);
        formParameters3.add(fp14);
        formParameters3.add(fp15);
        formParameters3.add(fp16);
        formParameters3.add(fp17);
        formParameters3.add(fp18);
        formParameters3.add(fp19);
        Service svc2 = servRepo.findByServiceCode(ServiceCode.valueOf("S5")).get();
        registerNewFormInService("F4", "Formulario de Descontos",svc2, formParameters3);
        //SERVICE 2
    
        
        Service svc1 = servRepo.findByServiceCode(ServiceCode.valueOf("S1")).get();
       

        
            
        registerNewFormInService("F1", "Form1",svc1, formParameters);
        
        
        
        return true;
    }
    private void registerNewFormInService(String formId, String name, Service service, List<FormParameter> formParameters) {
        
        formController.RegisterFormInService(formId, name, service, formParameters);
        LOGGER.debug("»»» Creating new Form %s", formId);
        
    }
    
    
    /*private void registerFormInActivity(String formId, String name, Activity activity, List<FormParameter> formParameters) {
        
        formController.registerFormInActivity(formId, name, activity, formParameters);
        LOGGER.debug("»»» Creating new Form %s", formId);
        
    }*/
    
    
}
