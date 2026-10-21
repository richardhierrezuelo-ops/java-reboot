public class CustomerTest {

    public static void main(String[] args) {

        Customer c1 = new Customer(101, "Alice");
        Customer c2 = new Customer(101, "Bob");
        Customer c3 = new Customer(202, "Charlie");
        Customer c4 = c1;


        System.out.println("Same Reference (c4 == c1): " + (c4 == c1));

        System.out.println("Same Reference (c1 == c2): " + (c1 == c2));
        System.out.println("Logical Equality (c1.equals(c2)): " + c1.equals(c2));
        System.out.println("Different IDs (c1.equals(c3)): " + c1.equals(c3));
        System.out.println("Hash Codes Equal: " + (c1.hashCode() == c2.hashCode()));
        System.out.println("Null Comparison: " + c1.equals(null));
        System.out.println("Wrong Type Comparison: " + c1.equals("Alice"));
    }
}