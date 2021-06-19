/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.base.activitymanagement.application;

import eapli.base.activitymanagement.domain.Activity;
import eapli.base.activitymanagement.domain.ActivityExecution;
import eapli.base.activitymanagement.domain.ActivityExecutionId;
import eapli.base.activitymanagement.domain.ActivityExecutionStatus;
import eapli.base.activitymanagement.dto.TicketActivityExecutionDto;
import eapli.base.activitymanagement.repositories.ActivityExecutionRepository;
import eapli.base.catalogue.repositories.CatalogueRepository;
import eapli.base.cataloguemanagement.domain.Catalogue;
import eapli.base.colaboratormanagement.domain.Colaborator;
import eapli.base.colaboratormanagement.repositories.ColaboratorRepository;
import eapli.base.formmanagement.domain.Answer;
import eapli.base.formmanagement.domain.FormAnswer;
import eapli.base.formmanagement.domain.FormAnswerId;
import eapli.base.formmanagement.domain.FormParameter;
import eapli.base.formmanagement.domain.FormParameterAnswer;
import eapli.base.formmanagement.domain.FormParameterAnswerId;
import eapli.base.formmanagement.repositories.FormAnswerRepository;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.servicemanagement.domain.Service;
import eapli.base.servicemanagement.repositories.ServiceRepository;
import eapli.base.ticketmanagement.domain.Ticket;
import eapli.base.ticketmanagement.domain.TicketId;
import eapli.base.ticketmanagement.repositories.TicketRepository;
import eapli.base.workflowmanagement.domain.WorkFlow;
import eapli.base.workflowmanagement.domain.WorkFlowExecution;
import eapli.base.workflowmanagement.domain.WorkFlowExecutionId;
import eapli.framework.infrastructure.authz.application.AuthorizationService;
import eapli.framework.infrastructure.authz.application.AuthzRegistry;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author andre
 */
public class PerformActivityController {
    private final ServiceRepository servRepo = PersistenceContext.repositories().services();
    private final ActivityExecutionRepository actExctRepo = PersistenceContext.repositories().activityExecutions();
    private final CatalogueRepository catRepo = PersistenceContext.repositories().catalogues();
    private final FormAnswerRepository formAnswerRepo = PersistenceContext.repositories().formAnswers();
    private final ColaboratorRepository colabRepo = PersistenceContext.repositories().colaborators();
    private final AuthorizationService authz = AuthzRegistry.authorizationService();
    private final TicketRepository ticketRepo = PersistenceContext.repositories().tickets();
    
    
    
    /**
     *
     * @param catalogue
     * @param service
     * @return
     */
    public Iterable<Service> getServicesByCatalogue(final Catalogue catalogue) {
        return servRepo.findByCatalogue(catalogue);
    }


    /**
     *
     * @param service
     * @param params
     * @param values
     * @param booker
     * @return
     * @see MyBookingsController#bookMealForMe(Meal)
     */
    public FormAnswer performActivity(TicketActivityExecutionDto actExec, List<FormParameter> params, List<String> values) {
        
        String formAnswerId = actExec.activityExecution.getActivity().getForm().identity()+"/"+LocalDateTime.now().hashCode();//para ter um id unico
        
        FormAnswer formAnswer = new FormAnswer(FormAnswerId.valueOf(formAnswerId), actExec.activityExecution.getActivity().getForm(), currentUser().get());
        
        int n=0;
        for(FormParameter p: params){
            FormParameterAnswer fpa = new FormParameterAnswer(FormParameterAnswerId.valueOf(formAnswerId+"/"+n), p, Answer.valueOf(values.get(n)));
            formAnswer.addFormParameterAnswer(fpa);
            n++;
        }
       
        
        formAnswer = formAnswerRepo.save(formAnswer);
        
        actExec.activityExecution.setFormAnswer(formAnswer);
        actExec.activityExecution.statusDone();

        actExctRepo.save(actExec.activityExecution);
        
        //check if all done
        boolean allDone=true;
        for(ActivityExecution ae: actExec.ticket.getWorkFlowExecution().activityExecutions()){
            if (!ae.getStatus().equals(ActivityExecutionStatus.DONE)){
                allDone=false;
                break;
            }
        }
        
        if (allDone){
            actExec.ticket.close();
            ticketRepo.save(actExec.ticket);
        }
            
        return formAnswer;
    }
    
    
    /*public Ticket requestServiceOnlyForBootstrap(final Service service, List<FormParameter> params, List<String> values, Colaborator booker) {
        int year = LocalDate.now().getYear();
        
        int number = ticketRepo.getMaxNumber(year) + 1;

        TicketId ticketId = TicketId.valueOf(year,number);
        
        WorkFlow workFlow = service.getWorkFlow();
        
        WorkFlowExecution wfe = WorkFlowExecution.from(WorkFlowExecutionId.valueOf(ticketId.toString()), workFlow);
 
        String formAnswerId = service.getForm().identity()+"/"+LocalDateTime.now().hashCode();//para ter um id unico
        
        FormAnswer formAnswer = new FormAnswer(FormAnswerId.valueOf(formAnswerId), service.getForm(), booker);
    
        int n=0;
        for(FormParameter p: params){
            FormParameterAnswer fpa = new FormParameterAnswer(FormParameterAnswerId.valueOf(formAnswerId+"/"+n), p, Answer.valueOf(values.get(n)));
            formAnswer.addFormParameterAnswer(fpa);
            n++;
        }
        
        Ticket ticket = new Ticket(ticketId, booker, formAnswer, service, wfe);
        
        
        return ticketRepo.save(ticket);
    }*/
    
   /* public void assigneActivityToColaborator(final Activity activity, final Ticket ticket, final WorkFlowExecution wfe, WorkFlow workflow, Activity activity, Service service){
        
        workflow = service.getWorkFlow();
        
        Iterable<Activity> activities = workflow.activities();
        
        Colaborator colaborator = new Colaborator();
        
        activities.forEach(activity.assigneToColaborator(colaborator));
        
        WorkFlowExecution wfe = WorkFlowExecution.from(WorkFlowExecutionId.valueOf(ticketId.toString()), workFlow);
 
        String formAnswerId = service.getForm().identity()+"/"+LocalDateTime.now().hashCode();//para ter um id unico
        
        FormAnswer formAnswer = new FormAnswer(FormAnswerId.valueOf(formAnswerId), service.getForm(), currentUser().get());
    
        int n=0;
        for(FormParameter p: params){
            FormParameterAnswer fpa = new FormParameterAnswer(FormParameterAnswerId.valueOf(formAnswerId+"/"+n), p, Answer.valueOf(values.get(n)));
            formAnswer.addFormParameterAnswer(fpa);
            n++;
        }
        
        Ticket ticket = new Ticket(ticketId, currentUser().get(), formAnswer, service, wfe);
    }*/
    
    

    private Optional<Colaborator> currentUser() {
        return authz.session()
                .flatMap(s -> colabRepo.findByUsername(s.authenticatedUser().username()));
    }    

}
