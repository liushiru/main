package duke.model.commons;

import java.util.Objects;

import static duke.commons.util.AppUtil.checkEmpty;
import static java.util.Objects.requireNonNull;

public class Customer {
    public static final String MESSAGE_CONSTRAINTS = "Customer name and contact can take any values, "
            + "and should not be blank";

    public final String name;
    public final String contact;

    public Customer(String name, String contact) {
        requireNonNull(name);
        requireNonNull(contact);

        checkEmpty(name, MESSAGE_CONSTRAINTS);
        checkEmpty(contact, MESSAGE_CONSTRAINTS);

        this.name = name;
        this.contact = contact;
    }

    @Override
    public String toString() {
        return String.format("Name: %s Contact: %s",
                name,
                contact);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return name.equals(customer.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}