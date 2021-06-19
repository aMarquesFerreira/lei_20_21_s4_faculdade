/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.base.activitymanagement.dto;

import eapli.base.activitymanagement.domain.ActivityExecution;
import eapli.base.ticketmanagement.domain.Ticket;

/**
 *
 * @author andre
 */
public class TicketActivityExecutionDto {
    
    public final Ticket ticket;
    public final ActivityExecution activityExecution;

    public TicketActivityExecutionDto(Ticket ticket, ActivityExecution activityExecution) {
        this.ticket = ticket;
        this.activityExecution = activityExecution;
    }
    
    
    
}
