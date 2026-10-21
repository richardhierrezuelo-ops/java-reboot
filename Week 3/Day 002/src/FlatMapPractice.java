//Exercise 1: flatMap Practice
//Given a list of lists of strings, use flatMap to flatten it into
// a single list and convert all to uppercase.

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapPractice {
    public static void main(String[] args) {
        List<List<String>> nested = Arrays.asList(
                Arrays.asList("java", "stream"),
                Arrays.asList("lambda", "optional"),
                Arrays.asList("collector", "filter", "map")
        );

        List<String> flat = nested.stream()
                .flatMap(List::stream)
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(flat);
    }
}
