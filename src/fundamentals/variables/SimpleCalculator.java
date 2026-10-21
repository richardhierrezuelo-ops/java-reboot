package fundamentals.variables;

public class SimpleCalculator {
    public static void main(String[] args) {
        int a = 15;
        int b = 4;

        int sum = a + b;
        int difference = a - b;
        int product = a * b;
        int quotient = a / b;
        int remainder = a % b;

        System.out.println("Sum: " + sum);
        System.out.println("Sum Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);

        // Bonus: Using printf for better formatting
        System.out.printf("%n--- Formatted Output ---%n");
        System.out.printf("a = %d, b = %d%n", a, b);
        System.out.printf("Sum: %d%n", sum);
        System.out.printf("15 / 4 = %d (integer division)%n", quotient);

    }
}
