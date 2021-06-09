package eapli.base.workflowmanagement.domain;

import eapli.base.servicemanagement.domain.Service;
import eapli.framework.domain.model.DomainFactory;

public class WorkflowBuilder implements DomainFactory<WorkFlow> {



    private WorkFlowId workFlow;
    private Service service;


    public WorkflowBuilder withAll(WorkFlowId workFlowID, Service service) {
        this.workFlow = workFlowID;
        this.service = service;
        return this;
    }

    public WorkFlowId withID(WorkFlowId workFlow) {

        return this.workFlow = workFlow;
    }

    public Service withService(Service service) {
        return this.service = service;

    }

    @Override
    public WorkFlow build() {
        // since the factory knows that all the parts are needed it could throw
        // an exception. however, we will leave that to the constructor
        return new WorkFlow(this.workFlow, this.service);
    }
}
