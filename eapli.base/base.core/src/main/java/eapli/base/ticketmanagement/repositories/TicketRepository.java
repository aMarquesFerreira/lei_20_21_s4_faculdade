/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.base.ticketmanagement.repositories;

import eapli.base.ticketmanagement.domain.Ticket;
import eapli.base.ticketmanagement.domain.TicketId;
import eapli.framework.domain.repositories.DomainRepository;
import java.util.Optional;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author andre
 */
public interface TicketRepository extends DomainRepository<TicketId, Ticket> {
    
      /**
     * returns the Form with the given ID number
     *
     * @param ticketId
     * @return
     */
    default Optional<Ticket> findByTicketId(TicketId ticketId) {
        return ofIdentity(ticketId);
    }

    public Iterable<Ticket> findAllActive();

    
    public int getMaxNumber(int year);
    
    /*public int getMaxNumber();*/

    
}
