package fundamentals.variables;

public class PersonalInfo {

    public static void main(String[] args) {
        String name = "Rick H";
        int age = 35;
        var previousRole = "Backend Java Dev";
        var motivationalMessage = "I'm back Stronger and Faster";

        System.out.printf(name + ", " + age + ", " + previousRole + ", " + motivationalMessage);

        // Option 1: Clean println (most readable)
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Previous Role: " + previousRole);
        System.out.println("Message: " + motivationalMessage);

        // Option 2: Using printf properly (good for formatted output)
        System.out.printf("%n--- Formatted Output ---%n");
        System.out.printf("Name: %s%n", name);
        System.out.printf("Age: %d%n", age);
        System.out.printf("Role: %s%n", previousRole);
        System.out.printf("Motivation: %s%n", motivationalMessage);

    }
}
