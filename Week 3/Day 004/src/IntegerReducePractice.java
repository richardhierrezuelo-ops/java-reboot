import java.util.List;

public class IntegerReducePractice {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4);

        int sum = numbers.stream()
                .reduce(0, Integer::sum);

        int product = numbers.stream()
                .reduce(1, (a, b) -> a * b);

        int maxNumber = numbers.stream()
                .reduce(Integer.MIN_VALUE, Integer::max);

        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
        System.out.println("Max Number: " + maxNumber);

    }
}
