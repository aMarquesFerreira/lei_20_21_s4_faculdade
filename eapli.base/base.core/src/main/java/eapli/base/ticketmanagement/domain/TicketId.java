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
public class TicketId implements ValueObject, Comparable<TicketId>{
    
    private static final long serialVersionUID = 1L;

    private int year;
    private int number;
    
    public TicketId(final int year, int number) {
        // TODO validate invariants, i.e., mecanographic number regular
        // expression
        this.year = year;
        this.number = number;
    }
    
    protected TicketId() {
        // for ORM
    }
    
    public static TicketId valueOf(int year, int number) {
        return new TicketId(year,number);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TicketId)) {
            return false;
        }

        final TicketId that = (TicketId) o;
        return this.year==that.year && this.number==that.number;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + this.year;
        hash = 89 * hash + this.number;
        return hash;
    }
    
    
    @Override
    public int compareTo(final TicketId arg0) {
        if (year==arg0.year)
            return number - arg0.number;
        else
            return year - arg0.year;
    }

    @Override
    public String toString() {
        return year + "/" + number;
    }
    
    
    
}
