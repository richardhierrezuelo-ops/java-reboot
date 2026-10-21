//Exercise 2: Stream Basics
//Given this list: List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10)
// Use streams to:
// Filter even numbers
//Square them
//Print the result

import java.util.Arrays;
import java.util.List;

public class StreamBasics {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        numbers.stream()
                .filter(x -> x % 2 == 0)  // Keep even numbers
                .map(x -> x * x)         // Square them
                .forEach(System.out::println);
    }
}
