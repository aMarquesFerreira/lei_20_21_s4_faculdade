/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.base.persistence.impl.jpa;

import eapli.base.Application;
import eapli.base.activitymanagement.domain.ActivityExecution;
import eapli.base.activitymanagement.domain.ActivityExecutionStatus;
import eapli.base.activitymanagement.domain.ActivityType;
import eapli.base.activitymanagement.dto.TicketActivityExecutionDto;
import eapli.base.colaboratormanagement.domain.Colaborator;
import eapli.base.ticketmanagement.domain.Ticket;
import eapli.base.ticketmanagement.domain.TicketId;
import eapli.base.ticketmanagement.repositories.TicketRepository;
import eapli.base.workflowmanagement.domain.WorkFlowExecution;
import eapli.framework.domain.repositories.TransactionalContext;
import eapli.framework.infrastructure.repositories.impl.jpa.JpaAutoTxRepository;
import java.util.ArrayList;

import javax.persistence.TypedQuery;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 *
 * @author andre
 */
public class JpaTicketRepository extends JpaAutoTxRepository<Ticket, TicketId, TicketId>
        implements TicketRepository{
    
     public JpaTicketRepository(TransactionalContext autoTx) {
        super(autoTx, "ticketId");
    }

    public JpaTicketRepository(String puname) {
        super(puname, Application.settings().getExtendedPersistenceProperties(),
                "ticketId");
    }

    @Override
    public Optional<Ticket> findByTicketId(TicketId ticketId) {
        final Map<String, Object> params = new HashMap<>();
        params.put("ticketId", ticketId);
        return matchOne("e.ticketId=:ticketId", params);
    }

    @Override
    public Iterable<Ticket> findAllActive() {
        //return match("e.catalogue.active = true");
        return match("e.active = true");
    }

    @Override
    public int getMaxNumber(int year){
         //TypedQuery<Integer> q = createQuery("select max(ticketId) FROM Ticket where number like ':year/*'", Integer.class);
         
         TypedQuery<Integer> q = createQuery("select max(ticketId.number) FROM Ticket where ticketId.year = " + year, Integer.class);
         
         
         /*String hql = "SELECT max(ticketId) FROM Ticket";
         //Query query = query.createQuery results = query.list();*/
         
         //Integer number = (Integer) entityManager.createQuery("SELECT max(ticketId) FROM Ticket").getSingleResult();
         
         
         /*EntityManager entityManager = null;*/
         
         //entityManager.createQuery("select max(t.number) from Ticket t", Integer.class).getSingleResult();*/
         
         Integer number = q.getSingleResult();
         
         return number==null ? 0 : number;
         
         /*return matchOne("e.ticketId=:ticketId", params);*/
    }
         
         
     /*public int getMaxNumber(int TicketId){
        
        final Map<String, Object> params = new HashMap<>();
        params.put("ticketId", ticketId);
        return matchOne("e.ticketId=:ticketId", params);
        
        
    }*/

    /*@Override
    public int getMaxNumber() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/

    @Override
    public Iterable<TicketActivityExecutionDto> findActivitiesAssignedTo(Colaborator colaborator) {
        List<TicketActivityExecutionDto> activities = new ArrayList<>();
        
        Iterable<Ticket> tickets = findAll();
        for (Ticket ticket : tickets) {
            WorkFlowExecution wfe = ticket.getWorkFlowExecution();
            
            //if two activities, the second is available only if the first is done
            boolean first=true;
            boolean firstDone=false;
            for(ActivityExecution ae: wfe.activityExecutions()){
                if (ae.getStatus().equals(ActivityExecutionStatus.DONE)){
                    if (first)
                        firstDone=true;
                }else{
                    if (colaborator.equals(ae.getColaborator())){
                        if (first || firstDone){//first allways allowed, second requires first to be done
                            activities.add(new TicketActivityExecutionDto(ticket,ae));                    
                        }
                    }
                }
                first=false;
            }            
        }
        
        return activities;
        /*TypedQuery q = 
                createQuery("select activityExecution from Ticket "
                          + "where workFlowExecution.activityExecution.colaborator=:colab", ActivityExecution.class);
        q.setParameter("colab", colaborator);
        
        List<ActivityExecution> result = q.getResultList();
        return result;*/
    }
 
    @Override
    public Iterable<TicketActivityExecutionDto> findManualActivities() {
        return findActivities("M");
    }
    
    @Override
    public Iterable<TicketActivityExecutionDto> findAutomaticActivities() {
        return findActivities("A");
    }
    
    private Iterable<TicketActivityExecutionDto> findActivities(String type) {
        List<TicketActivityExecutionDto> activities = new ArrayList<>();
        
        Iterable<Ticket> tickets = findAll();
        for (Ticket ticket : tickets) {
            WorkFlowExecution wfe = ticket.getWorkFlowExecution();
            ActivityExecution previous = null;
            boolean previousDone=false;
            boolean first=true;
            for(ActivityExecution ae: wfe.activityExecutions()){
                //if automatic and not yet done
                if (!ae.getStatus().equals(ActivityExecutionStatus.DONE) 
                     && ae.getActivity().type().equals(ActivityType.valueOf(type))){
                    if (first || previousDone){
                        activities.add(new TicketActivityExecutionDto(ticket,ae,previous));
                    }
                }
                previousDone = ae.getStatus().equals(ActivityExecutionStatus.DONE);
                first=false;
                previous=ae;
            }            
        }
        
        return activities;

    }    
    
}
