package fundamentals.variables;

public class BasicsDemo {
    public static void main(String[] args) {
        //Primitives
        int age = 30;
        long bigNumber = 1_000_000_000L;   // underscore for readability (Java 7+)
        double salary = 75_000.50;
        boolean isRusty = true;

        // String (Immutable reference type)
        String name ="Rick H";

        //var example
        var city = "Bangalore";  //inferred as String

        System.out.println(name + " is " + age + " years old.");

        // Formatted output using printf
        System.out.printf("Salary: %.2f%n", salary);
    }

}
