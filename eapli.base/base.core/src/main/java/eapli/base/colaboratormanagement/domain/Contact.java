package eapli.base.colaboratormanagement.domain;

import eapli.framework.domain.model.ValueObject;
import eapli.framework.strings.util.StringPredicates;

public class Contact implements ValueObject, Comparable<Contact> {

    private static final long serialVersionUID = 1L;

    private long phoneNumber;

    public Contact(final long phoneNumber) {
        if (StringPredicates.isNullOrEmpty(String.valueOf(phoneNumber))) {
            throw new IllegalArgumentException(
                    "Phone number should neither be null or empty");
        }
        // TODO validate invariants, i.e., mecanographic number regular
        // expression
        this.phoneNumber = phoneNumber;
    }

    protected Contact() {
        // for ORM
    }

    public static Contact valueOf(final long phoneNumber) {
        return new Contact(phoneNumber);
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Contact)) {
            return false;
        }

        final Contact that = (Contact) o;
        return (this.phoneNumber==that.phoneNumber);
    }

    @Override
    public int hashCode() {
        return Long.hashCode(phoneNumber);
    }

    @Override
    public String toString() {
        return String.valueOf(this.phoneNumber);
    }

    @Override
    public int compareTo(final Contact oContact) {
        return Float.compare(phoneNumber, oContact.phoneNumber);
    }

}
