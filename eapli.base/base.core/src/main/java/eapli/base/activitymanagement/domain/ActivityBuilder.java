package eapli.base.activitymanagement.domain;

import eapli.base.colaboratormanagement.domain.Colaborator;
import eapli.framework.domain.model.DomainFactory;
import eapli.framework.general.domain.model.Description;

public class ActivityBuilder implements DomainFactory<Activity> {



    private ActivityId activity;
    private Colaborator colaborator;
    private Description description;


    public ActivityBuilder withAll(ActivityId activityID, Description description, Colaborator colaborator) {
        this.activity = activityID;
        this.description = description;
        this.colaborator = colaborator;
        return this;
    }

    public ActivityId withID(ActivityId activityID) {

        return this.activity = activityID;
    }

    public Description withDescription(Description description) {
        return this.description = description;
    }

    public Colaborator withDescription(Colaborator colaborator) {
        return this.colaborator = colaborator;

    }

    @Override
    public Activity build() {
        // since the factory knows that all the parts are needed it could throw
        // an exception. however, we will leave that to the constructor
        return new Activity(this.activity, this.description, this.colaborator);
    }
}
