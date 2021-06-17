package eapli.base.activitymanagement.domain;

import eapli.base.colaboratormanagement.domain.Colaborator;
import eapli.framework.domain.model.DomainFactory;
import eapli.framework.general.domain.model.Description;

public class ActivityBuilder implements DomainFactory<Activity> {



    private ActivityId activity;
    private Colaborator colaborator;
    private Description description;
    private ActivityType activityType;
    private ExecutionTime execTime;

    public ActivityBuilder withAll(ActivityId activityID, Description description, ActivityType activityType, ExecutionTime execTime/*, Colaborator colaborator*/) {
        this.activity = activityID;
        this.description = description;
        //this.colaborator = colaborator;
        this.activityType = activityType;
        this.execTime = execTime;
        return this;
    }

    public ActivityId withID(ActivityId activityID) {

        return this.activity = activityID;
    }

    public ActivityType withType(ActivityType activityType) {
        return this.activityType = activityType;
    }
    
    public Description withDescription(Description description) {
        return this.description = description;
    }
    
    public ExecutionTime withExecutionTime(ExecutionTime execTime) {
        return this.execTime = execTime;
    }

    /*public Colaborator withColaborator(Colaborator colaborator) {
        return this.colaborator = colaborator;

    }*/

    @Override
    public Activity build() {
        // since the factory knows that all the parts are needed it could throw
        // an exception. however, we will leave that to the constructor
        return new Activity(this.activity, this.description, this.activityType,this.execTime/*, this.colaborator*/);
    }
}
