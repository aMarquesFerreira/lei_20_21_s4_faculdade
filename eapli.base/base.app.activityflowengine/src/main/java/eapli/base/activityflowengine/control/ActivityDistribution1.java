/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.base.activityflowengine.control;

import eapli.base.activitymanagement.domain.Activity;
import eapli.base.activitymanagement.domain.ActivityExecution;
import eapli.base.activitymanagement.repositories.ActivityExecutionRepository;
import eapli.base.servicemanagement.domain.Service;
import eapli.base.ticketmanagement.domain.Ticket;
import eapli.base.workflowmanagement.domain.WorkFlow;
import eapli.base.workflowmanagement.domain.WorkFlowExecution;
import eapli.base.colaboratormanagement.application.RegisterColaboratorController;
import eapli.base.colaboratormanagement.domain.Colaborator;
import eapli.base.colaboratormanagement.repositories.ColaboratorRepository;
import eapli.base.infrastructure.persistence.PersistenceContext;
import java.util.ArrayList;
import java.util.List;
 
/**
 *
 * @author andre
 */
public class ActivityDistribution1 {
    
    private final ColaboratorRepository colabRepo = PersistenceContext.repositories().colaborators();
    private final ActivityExecutionRepository actExecRepo = PersistenceContext.repositories().activityExecutions();

   
    /**
     * Atribui o colaborador escolhido pelos algoritmos as atividades
     * @param colab
     * @param actExec
     * @return 
     */
    public ActivityExecution assignActivityToColab(Colaborator colab, ActivityExecution actExec){
        actExec.assignToColaborator(colab);
        
        return  actExecRepo.save(actExec);
    }
    
}
