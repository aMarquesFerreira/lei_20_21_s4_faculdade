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

    List<FormParameter> formParService1 = new ArrayList<>();
    List<FormParameter> formParService2 = new ArrayList<>();

    

    @Override
    public boolean execute() {
        
        //FOR SERVICE1
        FormParameter fp1 = new FormParameter(FormParameterId.valueOf("FP1"),
                Designation.valueOf("Período de ausência (data inicio)"),
                Label.valueOf("P.A"),
                Description.valueOf("Período de ausência (data inicio)"),
                FormParameterData.valueOf("STRING"));
        
        FormParameter fp2 = new FormParameter(FormParameterId.valueOf("FP2"),
                Designation.valueOf("Período de ausência (data fim)"),
                Label.valueOf("P.F"),
                Description.valueOf("Período de ausência (data fim)"),
                FormParameterData.valueOf("STRING"));
        
        FormParameter fp3 = new FormParameter(FormParameterId.valueOf("FP3"),
                Designation.valueOf("Tipo Ausência"),
                Label.valueOf("T.A"),
                Description.valueOf("Tipo Ausência"),
                FormParameterData.valueOf("STRING"));
        
        FormParameter fp4 = new FormParameter(FormParameterId.valueOf("FP4"),
                Designation.valueOf("Justificação"),
                Label.valueOf("J"),
                Description.valueOf("Justificação"),
                FormParameterData.valueOf("STRING"));
        
        formParService1.add(fp1);
        formParService1.add(fp2);
        formParService1.add(fp3);
        formParService1.add(fp4);
        
        Service svc1 = servRepo.findByServiceCode(ServiceCode.valueOf("S1")).get();
        registerNewFormInService("F1", "Formulario de pedido de ausencia",svc1, formParService1);
        //FOR SERVICE 1
        
        
        
        //FOR SERVICE 2
        FormParameter fp5 = new FormParameter(FormParameterId.valueOf("FP14"),
                Designation.valueOf("Código Interno Cliente"),
                Label.valueOf("CIC"),
                Description.valueOf("Código Interno Cliente"),
                FormParameterData.valueOf("STRING"));
        
        FormParameter fp6 = new FormParameter(FormParameterId.valueOf("FP15"),
                Designation.valueOf("Nome"),
                Label.valueOf("N"),
                Description.valueOf("Nome"),
                FormParameterData.valueOf("STRING"));
        
        FormParameter fp7 = new FormParameter(FormParameterId.valueOf("FP16"),
                Designation.valueOf("Tipo de Desconto"),
                Label.valueOf("TD"),
                Description.valueOf("Tipo de Desconto"),
                FormParameterData.valueOf("STRING"));
        
        FormParameter fp8 = new FormParameter(FormParameterId.valueOf("FP17"),
                Designation.valueOf("Recorrência"),
                Label.valueOf("R"),
                Description.valueOf("Recorrência"),
                FormParameterData.valueOf("STRING"));
        
         FormParameter fp9 = new FormParameter(FormParameterId.valueOf("FP18"),
                Designation.valueOf("Percentagem de Desconto"),
                Label.valueOf("PD"),
                Description.valueOf("Percentagem de Desconto"),
                FormParameterData.valueOf("INTEGER"));
        
        FormParameter fp10 = new FormParameter(FormParameterId.valueOf("FP19"),
                Designation.valueOf("Valor de Desconto"),
                Label.valueOf("VD"),
                Description.valueOf("Valor de Desconto"),
                FormParameterData.valueOf("INTEGER"));
        
        FormParameter fp11 = new FormParameter(FormParameterId.valueOf("FP20"),
                Designation.valueOf("Identificação da Fatura"),
                Label.valueOf("IF"),
                Description.valueOf(" Identificação da Fatura"),
                FormParameterData.valueOf("STRING"));
        
        FormParameter fp12 = new FormParameter(FormParameterId.valueOf("FP21"),
                Designation.valueOf("Data Limite"),
                Label.valueOf("DL"),
                Description.valueOf("Data Limite"),
                FormParameterData.valueOf("STRING"));
        
        FormParameter fp13 = new FormParameter(FormParameterId.valueOf("FP22"),
                Designation.valueOf("Fundamentação do pedido"),
                Label.valueOf("FP"),
                Description.valueOf("Fundamentação do pedido"),
                FormParameterData.valueOf("STRING"));
        
        formParService2.add(fp5);
        formParService2.add(fp6);
        formParService2.add(fp7);
        formParService2.add(fp8);
        formParService2.add(fp9);
        formParService2.add(fp10);
        formParService2.add(fp11);
        formParService2.add(fp12);
        formParService2.add(fp13);
        
        Service svc2 = servRepo.findByServiceCode(ServiceCode.valueOf("S2")).get();
        registerNewFormInService("F3", "Formulario de pedido de desconto",svc2, formParService2);
        //FOR SERVICE 2
        
        
        
        
        
        
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
