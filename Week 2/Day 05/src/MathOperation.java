//Exercise 3: Custom Functional Interface
//Create a functional interface MathOperation with method int operate(int a, int b).
//Implement addition, subtraction, and multiplication using lambdas.

@FunctionalInterface
public interface MathOperation {
    int operate(int a, int b);

}
