import java.util.Objects;

public class Customer {

    private final int customerId;
    private String name;

    public Customer(int customerId, String name) {
        this.customerId = customerId;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {

        // Step 1: Same object in memory?
        if (this == obj) {
            return true;
        }

        // Step 2: Null or wrong class?
        if (!(obj instanceof Customer)) {
            return false;
        }

        // Step 3: Convert Object to Customer
        Customer other = (Customer) obj;

        // Step 4: Compare customer IDs
        return this.customerId == other.customerId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerId);
    }
}