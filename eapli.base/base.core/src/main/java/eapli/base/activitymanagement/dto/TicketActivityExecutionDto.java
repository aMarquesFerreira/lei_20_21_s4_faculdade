/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.base.activitymanagement.dto;

import eapli.base.activitymanagement.domain.ActivityExecution;
import eapli.base.ticketmanagement.domain.Ticket;
import java.util.Objects;

/**
 *
 * @author andre
 */
public class TicketActivityExecutionDto {
    
    public final Ticket ticket;
    public final ActivityExecution activityExecution;
    public final ActivityExecution previousActivityExecution;

    public TicketActivityExecutionDto(Ticket ticket, ActivityExecution activityExecution) {
        this.ticket = ticket;
        this.activityExecution = activityExecution;
        previousActivityExecution=null;
    }
    
    public TicketActivityExecutionDto(Ticket ticket, ActivityExecution activityExecution, ActivityExecution previousActivityExecution) {
        this.ticket = ticket;
        this.activityExecution = activityExecution;
        this.previousActivityExecution = previousActivityExecution;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + Objects.hashCode(this.activityExecution);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final TicketActivityExecutionDto other = (TicketActivityExecutionDto) obj;
        if (!Objects.equals(this.activityExecution.activityId(), other.activityExecution.activityId())) {
            return false;
        }
        return true;
    }
    
    
}
