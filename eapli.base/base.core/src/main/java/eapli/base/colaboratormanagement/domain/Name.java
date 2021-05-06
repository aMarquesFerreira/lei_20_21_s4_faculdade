package eapli.base.colaboratormanagement.domain;

import eapli.framework.domain.model.ValueObject;
import eapli.framework.strings.util.StringPredicates;

public class Name implements ValueObject, Comparable<Name> {

    private static final long serialVersionUID = 1L;

    private String name;

    public Name(final String name) {
        if (StringPredicates.isNullOrEmpty(name)) {
            throw new IllegalArgumentException(
                    "Name should neither be null or empty");
        }
        // TODO validate invariants, i.e., mecanographic number regular
        // expression
        this.name = name;
    }

    protected Name() {
        // for ORM
    }

    public static Name valueOf(final String name) {
        return new Name(name);
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Address)) {
            return false;
        }

        final Name that = (Name) o;
        return this.name.equals(that.name);
    }

    @Override
    public int hashCode() {
        return this.name.hashCode();
    }

    @Override
    public String toString() {
        return this.name;
    }

    @Override
    public int compareTo(final Name oName) {
        return name.compareTo(oName.name);
    }

}
