package fundamentals.methods;

public class MethodDemo {

    public static void main(String[] args) {
        greet("Rick");
        int result = add(10, 25);
        System.out.println("Sum: " + result);

        System.out.println("Sum of three numbers: " + add(10, 20, 30));
    }

    // Method with parameter
    public static void greet(String name) {
        System.out.println("Welcome back, " + name + "!");
    }

    // Method with return value
    public static int add(int a, int b) {
        return a + b;
    }

    // Method overloading (same name, different parameters)
    public static int add(int a, int b, int c) {
        return a + b + c;
    }
}
