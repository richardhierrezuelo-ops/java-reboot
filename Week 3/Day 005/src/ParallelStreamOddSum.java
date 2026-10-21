//Exercise 1: Parallel Stream Sum
//Given a large list of numbers (1 to 500,000), use parallel stream to
// calculate the sum of all odd numbers.
import java.util.ArrayList;
import java.util.List;

public class ParallelStreamOddSum {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        for (int i = 1; i<= 500_000; i++){
            numbers.add(i);
        }

        long sum = numbers.parallelStream()
                .filter(n -> n % 2 != 0)
                .mapToLong(n -> n)
                .sum();

        System.out.println("Sum of odds is " + sum);
    }
}
