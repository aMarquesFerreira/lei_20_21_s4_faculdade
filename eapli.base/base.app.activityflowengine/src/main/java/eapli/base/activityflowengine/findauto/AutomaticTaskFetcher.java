/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.base.activityflowengine.findauto;

import eapli.base.activitymanagement.domain.Activity;
import eapli.base.activitymanagement.domain.ActivityExecution;
import eapli.base.activitymanagement.dto.TicketActivityExecutionDto;
import eapli.base.activitymanagement.repositories.ActivityExecutionRepository;
import eapli.base.activitymanagement.repositories.ActivityRepository;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.ticketmanagement.domain.Ticket;
import eapli.base.ticketmanagement.repositories.TicketRepository;
import java.util.ArrayList;
import java.util.List;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 *
 * @author andre
 */
public class AutomaticTaskFetcher {
    
    private final ActivityRepository actRepo = PersistenceContext.repositories().activities();
    private final ActivityExecutionRepository actExecRepo = PersistenceContext.repositories().activityExecutions();
    private final TicketRepository ticketRepo = PersistenceContext.repositories().tickets();
    
  /* public List<Activity> findAutoActivities(){
        
        Iterable<Activity> list;
        
        list = actRepo.findByAutomaticType();

        List autoActs = new ArrayList<>();
        
        for (Activity activity : list) {
            autoActs.add(activity);
        }
        
        return autoActs;
    }*/
   
    
    
   /*
    *Method to find all auto activities in database
    */
   public List<ActivityExecution> findAutoActivitiesExecutions(){
        
        //Iterable<ActivityExecution> list;
        
        Iterable<TicketActivityExecutionDto> list;
        
        //list = actExecRepo.findByAutoActivy();
        list = ticketRepo.findAutomaticActivities();

        List autoActs = new ArrayList<>();
        
        for (TicketActivityExecutionDto activityExecution : list) {
            autoActs.add(activityExecution);
        }
        
        return autoActs;
    }
   
   
   /*public List<ActivityExecution> findAutoActivities(){
        
       //List<Ticket> list = new ArrayList<>();
       Iterable<Ticket> list;
       list = ticketRepo.findAll();
       
       List tickets = new ArrayList<>();
       
       for (Ticket ticket : list) {
            tickets.add(ticket);
        }
       
       
    }*/
    
    
}
