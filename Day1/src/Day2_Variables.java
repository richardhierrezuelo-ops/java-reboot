public class Day2_Variables {
    public static void main(String[] args) {
        // 1. Primitives
        int age = 35;
        double salary = 85_500.75;
        char grade = 'A';
        boolean isEmployed = true;

        // 2. String (reference type, but acts like primitive)
        String name = "Richard";
        String job = "Ops Engineer";

        // 3. String operations
        String full = name + " is " + age + " years old.";
        System.out.println(full);

        // 4. String methods (type these from memory!)
        System.out.println("Name length: " + name.length());
        System.out.println("Uppercase: " + job.toUpperCase());
        System.out.println("Contains 'Ops': " + job.contains("Ops"));
        System.out.println("Index of 'E': " + job.indexOf('E'));

        // 5. BONUS: Format with printf
        System.out.printf("Salary: $%,.2f%n", salary);
        System.out.printf("%s earns $%,.2f and got grade %c%n", name, salary, grade);

        // 6. Add on Homework
        System.out.println("Slack tag: " + makeTag("Richard"));
    }

    public static String makeTag(String username) {
        return "<@" + username.toLowerCase() + ">";
    }
}