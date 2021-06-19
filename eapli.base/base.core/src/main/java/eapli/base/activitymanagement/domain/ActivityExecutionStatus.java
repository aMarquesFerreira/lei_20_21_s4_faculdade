package eapli.base.activitymanagement.domain;

import eapli.framework.domain.model.ValueObject;
import eapli.framework.strings.util.StringPredicates;
import javax.persistence.Embeddable;

@Embeddable
public class ActivityExecutionStatus implements ValueObject, Comparable<ActivityExecutionStatus> {

    private static final long serialVersionUID = 1L;
    public static ActivityExecutionStatus PENDING = ActivityExecutionStatus.valueOf("PENDING");
    public static ActivityExecutionStatus DONE = ActivityExecutionStatus.valueOf("DONE");
    public static ActivityExecutionStatus UNASSIGNED = ActivityExecutionStatus.valueOf("UNASSIGNED");
    public static ActivityExecutionStatus DOING = ActivityExecutionStatus.valueOf("DOING");

    private String status;

    public ActivityExecutionStatus(final String status) {
        if (StringPredicates.isNullOrEmpty(status)) {
            throw new IllegalArgumentException("Name should neither be null or empty");
        }
        // TODO validate invariants, i.e., mecanographic number regular
        // expression
        this.status = status;
    }

    protected ActivityExecutionStatus() {
        // for ORM
    }

    public static ActivityExecutionStatus valueOf(final String status) {
        return new ActivityExecutionStatus(status);
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ActivityExecutionStatus)) {
            return false;
        }

        final ActivityExecutionStatus that = (ActivityExecutionStatus) o;
        return this.status.equals(that.status);
    }

    @Override
    public int hashCode() {
        return this.status.hashCode();
    }

    @Override
    public String toString() {
        return this.status;
    }

    @Override
    public int compareTo(final ActivityExecutionStatus oName) {
        return status.compareTo(oName.status);
    }


}
