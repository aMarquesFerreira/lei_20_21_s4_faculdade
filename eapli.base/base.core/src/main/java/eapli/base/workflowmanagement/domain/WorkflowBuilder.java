package eapli.base.workflowmanagement.domain;

import eapli.base.activitymanagement.domain.Activity;
import eapli.base.servicemanagement.domain.Service;
import eapli.framework.domain.model.DomainFactory;
import java.util.List;

public class WorkflowBuilder implements DomainFactory<WorkFlow> {



    private WorkFlowId workFlow;
    //private Service service;
    private List<Activity> activities;


    public WorkflowBuilder withAll(WorkFlowId workFlowID/*, Service service*/, List<Activity> activities) {
        this.workFlow = workFlowID;
        //this.service = service;
        this.activities = activities;
        return this;
    }

    public WorkFlowId withID(WorkFlowId workFlow) {

        return this.workFlow = workFlow;
    }


    @Override
    public WorkFlow build() {
        // since the factory knows that all the parts are needed it could throw
        // an exception. however, we will leave that to the constructor
        
        return new WorkFlow(this.workFlow);
    }
}
