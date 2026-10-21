//Exercise 2: reduce Practice
//Given a list of integers, use reduce to calculate the sum and the product.

import java.util.List;

public class ReducePractice {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4);

        int sum = numbers.stream()
                .reduce(0, (a, b) -> a + b);

        int sum2 = numbers.stream()
                .reduce(0, Integer::sum);           // Method reference

        int product = numbers.stream()
                .reduce(1, (a, b) -> a * b);

        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
    }
}
