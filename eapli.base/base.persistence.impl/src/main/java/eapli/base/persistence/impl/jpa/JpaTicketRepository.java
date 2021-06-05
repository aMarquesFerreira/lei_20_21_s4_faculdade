/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.base.persistence.impl.jpa;

import eapli.base.Application;
import eapli.base.ticketmanagement.domain.Ticket;
import eapli.base.ticketmanagement.domain.TicketId;
import eapli.base.ticketmanagement.repositories.TicketRepository;
import eapli.framework.domain.repositories.TransactionalContext;
import eapli.framework.infrastructure.repositories.impl.jpa.JpaAutoTxRepository;

import javax.persistence.TypedQuery;
import java.util.HashMap;
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
         TypedQuery<Integer> q = createQuery("SELECT max(number) FROM Ticket where number like ':year/*'", Integer.class);
         
         Integer number = q.getSingleResult();
         
         return number==null ? 0 : number;
    }
        
}
