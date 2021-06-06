package eapli.base.ticketmanagement.domain;

import eapli.framework.domain.model.ValueObject;
import eapli.framework.strings.util.StringPredicates;

public class TicketStatus implements ValueObject, Comparable<TicketStatus> {

    private static final long serialVersionUID = 1L;
    public static TicketStatus OPEN = TicketStatus.valueOf("OPEN");
    public static TicketStatus CLOSED = TicketStatus.valueOf("CLOSED");

    private String status;

    public TicketStatus(final String status) {
        if (StringPredicates.isNullOrEmpty(status)) {
            throw new IllegalArgumentException("Name should neither be null or empty");
        }
        // TODO validate invariants, i.e., mecanographic number regular
        // expression
        this.status = status;
    }

    protected TicketStatus() {
        // for ORM
    }

    public static TicketStatus valueOf(final String status) {
        return new TicketStatus(status);
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TicketStatus)) {
            return false;
        }

        final TicketStatus that = (TicketStatus) o;
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
    public int compareTo(final TicketStatus oName) {
        return status.compareTo(oName.status);
    }

}
