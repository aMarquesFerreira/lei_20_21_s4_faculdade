package eapli.base.colaboratormanagement.domain;

import eapli.framework.domain.model.ValueObject;

import java.util.Date;

public class BirthDate implements ValueObject, Comparable<BirthDate> {

    private static final long serialVersionUID = 1L;

    private Date date;

    public BirthDate(final Date date) {
        if (date==null) {
            throw new IllegalArgumentException(
                    "Birth date should neither be null or empty");
        }
        // TODO validate invariants, i.e., mecanographic number regular
        // expression
        this.date = date;
    }

    protected BirthDate() {
        // for ORM
    }

    public static BirthDate valueOf(final Date date) {
        return new BirthDate(date);
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BirthDate)) {
            return false;
        }

        final BirthDate that = (BirthDate) o;
        return this.date.equals(that.date);
    }

    @Override
    public int hashCode() {
        return this.date.hashCode();
    }

    @Override
    public String toString() {
        return this.date.toString();
    }

    @Override
    public int compareTo(final BirthDate oBirthDate) {
        return date.compareTo(oBirthDate.date);
    }

}
