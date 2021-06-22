/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.base.infrastructure.bootstrapers;

import eapli.base.activitymanagement.domain.Activity;
import eapli.base.activitymanagement.domain.ActivityId;
import eapli.base.activitymanagement.repositories.ActivityRepository;
import eapli.base.formmanagement.application.RegisterFormController;
import eapli.base.formmanagement.domain.FormParameter;
import eapli.base.formmanagement.domain.FormParameterData;
import eapli.base.formmanagement.domain.FormParameterId;
import eapli.base.formmanagement.domain.Label;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.servicemanagement.domain.Service;
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
public class FormInActivityBootstrapper implements Action{
    
    private static final Logger LOGGER = LoggerFactory.getLogger(FormBootstrapper.class);

    private final RegisterFormController formController = new RegisterFormController();
    private final ServiceRepository servRepo = PersistenceContext.repositories().services();
    private final ActivityRepository actRepo = PersistenceContext.repositories().activities();
   
    private final List<Service> services = new ArrayList<Service>();
    private final List<FormParameter> formParameters = new ArrayList<FormParameter>();
    private final List<FormParameter> fpApprovAusencia = new ArrayList<FormParameter>();
    private final List<FormParameter> formParameters2 = new ArrayList<FormParameter>();

    

    @Override
    public boolean execute() {
        
        //SERVICE 1
        FormParameter fp1 = new FormParameter(FormParameterId.valueOf("FP5"),
                Designation.valueOf("Dias de férias já gozados no ano"),
                Label.valueOf("DF"),
                Description.valueOf("Dias de férias já gozados no ano"),
                FormParameterData.valueOf("String"));
        
        FormParameter fp2 = new FormParameter(FormParameterId.valueOf("FP6"),
                Designation.valueOf("Dias de férias gozados do período solicitado"),
                Label.valueOf("DFS"),
                Description.valueOf("Dias de férias gozados do período solicitado"),
                FormParameterData.valueOf("String"));
        
        FormParameter fp3 = new FormParameter(FormParameterId.valueOf("FP7"),
                Designation.valueOf("Dias de férias totais"),
                Label.valueOf("DFT"),
                Description.valueOf("Dias de férias totais"),
                FormParameterData.valueOf("String"));
        
        FormParameter fp4 = new FormParameter(FormParameterId.valueOf("FP8"),
                Designation.valueOf("Dias de falta justificadas já ocorridas no ano"),
                Label.valueOf("DF"),
                Description.valueOf("Dias de falta justificadas já ocorridas no ano"),
                FormParameterData.valueOf("String"));
        
        FormParameter fp5 = new FormParameter(FormParameterId.valueOf("FP9"),
                Designation.valueOf("Dias de faltas justificadas do período solicitado"),
                Label.valueOf("DF"),
                Description.valueOf("Dias de faltas justificadas do período solicitado"),
                FormParameterData.valueOf("String"));
        
        FormParameter fp6 = new FormParameter(FormParameterId.valueOf("FP10"),
                Designation.valueOf("Dias de faltas justificadas totais"),
                Label.valueOf("DF"),
                Description.valueOf("Dias de faltas justificadas totais"),
                FormParameterData.valueOf("String"));
        
        FormParameter fp7 = new FormParameter(FormParameterId.valueOf("FP11"),
                Designation.valueOf("Dias de falta não justificadas já ocorridas no ano"),
                Label.valueOf("DF"),
                Description.valueOf("Dias de falta não justificadas já ocorridas no ano"),
                FormParameterData.valueOf("String"));
        
        FormParameter fp8 = new FormParameter(FormParameterId.valueOf("FP12"),
                Designation.valueOf("Dias de faltas não justificadas do período solicitado"),
                Label.valueOf("DF"),
                Description.valueOf("Dias de faltas não justificadas do período solicitado"),
                FormParameterData.valueOf("String"));
        
        FormParameter fp9 = new FormParameter(FormParameterId.valueOf("FP13"),
                Designation.valueOf("Dias de faltas não justificadas totais e uma comentário"),
                Label.valueOf("DF"),
                Description.valueOf("Dias de faltas não justificadas totais e uma comentário"),
                FormParameterData.valueOf("String"));
        formParameters.add(fp1);
        formParameters.add(fp2);
        formParameters.add(fp3);
        formParameters.add(fp4);
        formParameters.add(fp5);
        formParameters.add(fp6);
        formParameters.add(fp7);
        formParameters.add(fp8);
        formParameters.add(fp9);
        
        Activity a1 = actRepo.findByActivityId(ActivityId.valueOf("A1")).get();
        registerFormInActivity("F2", "Formulario para aprovar servico de ausencia",a1, formParameters);
        
        
        Activity a2 = actRepo.findByActivityId(ActivityId.valueOf("A2")).get();
        FormParameter fp10 = new FormParameter(FormParameterId.valueOf("FP23"),
                Designation.valueOf("Decisao"),
                Label.valueOf("D"),
                Description.valueOf("Decisao"),
                FormParameterData.valueOf("String"));
        
        FormParameter fp11 = new FormParameter(FormParameterId.valueOf("FP24"),
                Designation.valueOf("Fundamentacao da decisao"),
                Label.valueOf("fd"),
                Description.valueOf("Fundamentacao da decisao"),
                FormParameterData.valueOf("String"));
        
        fpApprovAusencia.add(fp10);
        fpApprovAusencia.add(fp11);
        registerFormInActivity("F4", "Formulario para executar servico de ausencia",a2, fpApprovAusencia);
        //SERVICE 1
        
        
        //FOR SERVICE 2
        
        FormParameter fp12 = new FormParameter(FormParameterId.valueOf("FP25"),
                Designation.valueOf("Decisao"),
                Label.valueOf("D"),
                Description.valueOf("Decisao"),
                FormParameterData.valueOf("String"));
        
        FormParameter fp13 = new FormParameter(FormParameterId.valueOf("FP26"),
                Designation.valueOf("Motivo"),
                Label.valueOf("M"),
                Description.valueOf("Motivo da decisao"),
                FormParameterData.valueOf("String"));
        
        FormParameter fp14 = new FormParameter(FormParameterId.valueOf("FP27"),
                Designation.valueOf("Percentagem de desconto"),
                Label.valueOf("D"),
                Description.valueOf("Percentagem de desconto"),
                FormParameterData.valueOf("String"));// pode mudar
        
        FormParameter fp15 = new FormParameter(FormParameterId.valueOf("FP28"),
                Designation.valueOf("data limite (caso faça sentido)"),
                Label.valueOf("DL"),
                Description.valueOf("data limite (caso faça sentido)"),
                FormParameterData.valueOf("STRING"));
        
        formParameters2.add(fp12);
        formParameters2.add(fp13);
        formParameters2.add(fp14);
        formParameters2.add(fp15);
        
        
        Activity a3 = actRepo.findByActivityId(ActivityId.valueOf("A3")).get();
        registerFormInActivity("F6", "Formulario para aprovar servico de desconto",a3, formParameters2);
        // FOR SERVICE 2
        
        

        return true;
    }
        
    
    private void registerFormInActivity(String formId, String name, Activity activity, List<FormParameter> formParameters) {
        
        formController.registerFormInActivity(formId, name, activity, formParameters);
        LOGGER.debug("»»» Creating new Form %s", formId);
        
    }
    
    
}
