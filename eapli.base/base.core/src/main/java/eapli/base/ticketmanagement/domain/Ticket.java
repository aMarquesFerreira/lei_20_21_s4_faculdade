/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.base.ticketmanagement.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import eapli.base.colaboratormanagement.domain.Colaborator;
import eapli.base.formmanagement.domain.FormAnswer;
import eapli.base.servicemanagement.domain.Service;
import eapli.base.workflowmanagement.domain.WorkFlowExecution;
import eapli.framework.domain.model.AggregateRoot;
import eapli.framework.domain.model.DomainEntities;
import javax.persistence.CascadeType;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Version;
import javax.xml.bind.annotation.XmlElement;

/**
 *
 * @author andre
 */
@Entity
public class Ticket implements AggregateRoot<TicketId>{
    
    
    @Version
    private Long version;

    @XmlElement
    @JsonProperty
    @EmbeddedId
    @GeneratedValue(strategy=GenerationType.AUTO)
    private TicketId ticketId;

    @XmlElement
    @JsonProperty
    private TicketStatus ticketStatus;


    /**
     * cascade = CascadeType.NONE as the systemUser is part of another aggregate
     */
    @OneToOne(cascade = CascadeType.ALL)
    private FormAnswer formAnswer;
    
    
    @ManyToOne()
    private Service service;
    
    @OneToOne(cascade = CascadeType.ALL)
    private WorkFlowExecution workFlowExecution;

    @ManyToOne()
    private Colaborator booker;
    
    

    /**
     * Constructor.
     *
     * @param ticketId
     * @param formAnswer
     * @param service
     * @param workFlowExecution
     */
    public Ticket( final TicketId ticketId, final Colaborator booker, final FormAnswer formAnswer, final Service service, final WorkFlowExecution workFlowExecution) {
        if (ticketId == null || formAnswer == null || service == null || workFlowExecution == null) {
            throw new IllegalArgumentException();
        }
        this.ticketId = ticketId;
        this.booker = booker;
        this.formAnswer = formAnswer;
        this.service = service;
        this.workFlowExecution = workFlowExecution;
        this.ticketStatus = TicketStatus.OPEN;

    }

    protected Ticket() {
        // for ORM only
    }


    public FormAnswer formAnswer() {
        return this.formAnswer;
    }

    
    public WorkFlowExecution getWorkFlowExecution() {
        return this.workFlowExecution;
    }


    @Override
    public boolean equals(final Object o) {
        return DomainEntities.areEqual(this, o);
    }

    @Override
    public int hashCode() {
        return DomainEntities.hashCode(this);
    }

    @Override
    public boolean sameAs(final Object other) {
        final Ticket catalogue = (Ticket) other;
        return DomainEntities.areEqual(this, other) ;
    }


    public TicketId ticketId() {
        return identity();
    }

    @Override
    public TicketId identity() {
        return this.ticketId;
    }

    public void close() {
        this.ticketStatus = TicketStatus.CLOSED;
    }
    
}
