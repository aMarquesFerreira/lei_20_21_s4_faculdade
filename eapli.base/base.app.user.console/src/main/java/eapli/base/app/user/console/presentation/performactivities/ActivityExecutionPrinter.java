/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.base.app.user.console.presentation.performactivities;

import eapli.base.activitymanagement.domain.Activity;
import eapli.base.activitymanagement.domain.ActivityExecution;
import eapli.base.activitymanagement.dto.TicketActivityExecutionDto;
import eapli.base.cataloguemanagement.domain.Catalogue;
import eapli.framework.visitor.Visitor;

/**
 *
 * @author andre
 */
@SuppressWarnings("squid:S106")
public class ActivityExecutionPrinter implements Visitor<TicketActivityExecutionDto> {
    
    @Override
    public void visit(final TicketActivityExecutionDto visitee){
       System.out.printf("%s: %-10s - %s", visitee.ticket.ticketId(), visitee.activityExecution.identity(), visitee.activityExecution.getActivity().description());
    }
}
