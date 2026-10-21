//Exercise 1: Stream with Collectors
//Given a list of names, use streams to:Filter names longer than 4 characters
//Convert to uppercase
//Group by first letter
//Return a Map<Character, List<String>>

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamWithCollectors {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("rick", "portia", "anna", "mike", "sarah");

        Map<Character, List<String>> groupedByFirstLetter  = names.stream()
                .filter(name ->name.length() > 4)
                .map(String::toUpperCase)
                .collect(Collectors.groupingBy(name -> name.charAt(0)));

        System.out.println(groupedByFirstLetter );
    }
}
