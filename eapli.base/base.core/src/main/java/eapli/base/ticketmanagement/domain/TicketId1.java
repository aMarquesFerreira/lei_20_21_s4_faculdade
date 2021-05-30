/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.base.ticketmanagement.domain;

import eapli.framework.domain.model.ValueObject;
import eapli.framework.strings.util.StringPredicates;
import javax.persistence.Embeddable;

/**
 *
 * @author andre
 */
@Embeddable
public class TicketId1 implements ValueObject, Comparable<TicketId1>{
    
    private static final long serialVersionUID = 1L;

    private String number;
    
    public TicketId1(final String ticketId) {
        if (StringPredicates.isNullOrEmpty(ticketId)) {
            throw new IllegalArgumentException(
                    "Ticket ID should neither be null nor empty");
        }
        // TODO validate invariants, i.e., mecanographic number regular
        // expression
        this.number = ticketId;
    }
    
    protected TicketId1() {
        // for ORM
    }
    
    public static TicketId1 valueOf(final String ticketId) {
        return new TicketId1(ticketId);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TicketId1)) {
            return false;
        }

        final TicketId1 that = (TicketId1) o;
        return this.number.equals(that.number);
    }
    
    @Override
    public int hashCode() {
        return this.number.hashCode();
    }

    @Override
    public String toString() {
        return this.number;
    }
    
    @Override
    public int compareTo(final TicketId1 arg0) {
        return number.compareTo(arg0.number);
    }
    
}
