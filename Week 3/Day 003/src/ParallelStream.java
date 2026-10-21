//Exercise 1: Parallel Stream
//Given a large list of numbers (1 to 1,000,000),
// use parallel stream to calculate the sum of squares of even numbers.

import java.util.ArrayList;
import java.util.List;

public class ParallelStream {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 1_000_000; i++) {
            numbers.add(i);
        }

        long sum = numbers.parallelStream()
                .filter(n -> n % 2 == 0)
                .mapToLong(n -> (long) n * n)
                .sum();

        System.out.println(sum);

    }
}
