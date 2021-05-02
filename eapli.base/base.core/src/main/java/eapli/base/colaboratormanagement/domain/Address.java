package eapli.base.colaboratormanagement.domain;

import eapli.framework.domain.model.ValueObject;
import eapli.framework.strings.util.StringPredicates;

public class Address implements ValueObject, Comparable<Address> {


    private static final long serialVersionUID = 1L;

    private String street;
    private String city;

    public Address(final String street, final String city) {
        if (StringPredicates.isNullOrEmpty(street) && StringPredicates.isNullOrEmpty(city)) {
            throw new IllegalArgumentException(
                    "Address should neither be null or empty");
        }
        // TODO validate invariants, i.e., mecanographic number regular
        // expression
        this.street = street;
        this.city = city;
    }

    protected Address() {
        // for ORM
    }

    public static Address valueOf(final String street, final String city) {
        return new Address(street, city);
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Address)) {
            return false;
        }

        final Address that = (Address) o;
        return this.city.equals(that.city) && this.street.equals(that.city);
    }

    @Override
    public int hashCode() {
        return this.street.hashCode();
    }

    @Override
    public String toString() {
        return this.street + this.city;
    }

    @Override
    public int compareTo(final Address oAddress) {
        return street.compareTo(oAddress.street);
    }

}
