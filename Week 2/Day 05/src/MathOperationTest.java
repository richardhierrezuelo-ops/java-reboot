public class MathOperationTest {
    public static void main(String[] args) {
        MathOperation addition = (a, b) -> a + b;
        MathOperation subtraction = (a, b) -> a - b;
        MathOperation multiplication = (a, b) -> a * b;

        System.out.println("Addition (10 + 5): " + addition.operate(10, 5));
        System.out.println("Subtraction (10 - 5): " + subtraction.operate(10, 5));
        System.out.println("Multiplication (10 * 5): " + multiplication.operate(10, 5));
    }
}
