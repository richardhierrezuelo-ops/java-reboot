import java.util.ArrayList;
import java.util.List;

public class ParallelStreamSumSquares {
    public static void main(String[] arg) {
        List<Integer> numbers = new ArrayList<Integer>();

        for (int i = 1; i <= 500_000; i++) {
            numbers.add(i);
        }

        Long sum = numbers.parallelStream()
                .filter(n -> n % 2 ==0)
                .mapToLong(n -> (long) n * n)
                .sum();

        System.out.println(sum);
    }
}
