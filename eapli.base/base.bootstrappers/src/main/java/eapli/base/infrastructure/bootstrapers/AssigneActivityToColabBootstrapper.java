/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.base.infrastructure.bootstrapers;

import eapli.base.activitymanagement.application.RegisterActivityController;
import eapli.base.clientusermanagement.domain.MecanographicNumber;
import eapli.base.colaboratormanagement.domain.Colaborator;
import eapli.base.colaboratormanagement.repositories.ColaboratorRepository;
import eapli.base.formmanagement.repositories.FormRepository;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.ticketmanagement.application.RequestServiceController;
import eapli.framework.actions.Action;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//import eapli.base.activityflowengine.control.ActivityDistribution;
import eapli.base.activitymanagement.domain.Activity;
import eapli.base.activitymanagement.domain.ActivityExecution;
import eapli.base.activitymanagement.domain.ActivityId;
import eapli.base.activitymanagement.repositories.ActivityRepository;
import eapli.base.ticketmanagement.domain.Ticket;
import eapli.base.ticketmanagement.domain.TicketId;
import eapli.base.ticketmanagement.repositories.TicketRepository;
import eapli.base.workflowmanagement.domain.WorkFlowExecution;
import java.util.List;

/**
 *
 * @author andre
 */
public class AssigneActivityToColabBootstrapper implements Action {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(AssigneActivityToColabBootstrapper.class);

    private final RegisterActivityController activityController = new RegisterActivityController();
    private final ColaboratorRepository colabRepo = PersistenceContext.repositories().colaborators();
    private final FormRepository formRepo = PersistenceContext.repositories().forms();
    private final ActivityRepository actRepo = PersistenceContext.repositories().activities();
    private final RequestServiceController requestServController =  new RequestServiceController();
    private final TicketRepository ticketRepo = PersistenceContext.repositories().tickets();
    //private final ActivityDistribution actDistrib = new ActivityDistribution();

    //private final List<Catalogue> catalogues = new ArrayList<Catalogue>();

    //final String activityId, final String description, final Colaborator colaborator,final Form form) {

    @Override
    public boolean execute() {
        Colaborator c1 = colabRepo.findByMecanographicNumber(MecanographicNumber.valueOf("isep959")).get();
        
        /*Ticket ticket = ticketRepo.findByTicketId(TicketId.valueOf(2021,2)).get();
        WorkFlowExecution wfe = ticket.getWorkFlowExecution();
        ActivityExecution ae = ((List<ActivityExecution>)wfe.activityExecutions()).get(0); //	2021/1.A1
        assignActivityToColab(c1, ae);
        
        ticketRepo.save(ticket);*/
        
        

        return true;
    }
    private void assignActivityToColab(Colaborator colab, ActivityExecution actExc) {
        
        activityController.assignActivityToColabManually(colab, actExc);
        LOGGER.debug("»»» Creating new Activity %s", colab, actExc);
        
    }

    
}
