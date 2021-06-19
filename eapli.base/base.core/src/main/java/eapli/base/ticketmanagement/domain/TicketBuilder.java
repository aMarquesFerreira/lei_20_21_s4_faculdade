package eapli.base.ticketmanagement.domain;

import eapli.base.colaboratormanagement.domain.Colaborator;
import eapli.base.formmanagement.domain.FormAnswer;
import eapli.base.servicemanagement.domain.Service;
import eapli.base.workflowmanagement.domain.WorkFlowExecution;
import eapli.framework.domain.model.DomainFactory;

public class TicketBuilder implements DomainFactory<Ticket> {




    private TicketId ticketId;
    private Colaborator colaborator;
    private FormAnswer formAnswer;
    private Service service;
    private WorkFlowExecution workFlowExecution;


    public TicketBuilder withAll(TicketId ticketId, Colaborator colaborator, FormAnswer formAnswer, Service service, WorkFlowExecution workFlowExecution) {
        this.ticketId = ticketId;
        this.colaborator = colaborator;
        this.formAnswer = formAnswer;
        this.service = service;
        this.workFlowExecution = workFlowExecution;

        return this;
    }

    public TicketId withID(TicketId ticketId) {

        return this.ticketId = ticketId;
    }

    public Colaborator withColaborator(Colaborator colaborator) {

        return this.colaborator = colaborator;
    }

    public FormAnswer withFormAnswer(FormAnswer formAnswer) {

        return this.formAnswer = formAnswer;
    }

    public Service withService(Service service) {

        return this.service = service;
    }

    public WorkFlowExecution withWorkFlowExecution(WorkFlowExecution workFlowExecution) {

        return this.workFlowExecution = workFlowExecution;
    }



    @Override
    public Ticket build() {
        // since the factory knows that all the parts are needed it could throw
        // an exception. however, we will leave that to the constructor

        return new Ticket(this.ticketId, this.colaborator, this.formAnswer, this.service, this.workFlowExecution);
    }
}
