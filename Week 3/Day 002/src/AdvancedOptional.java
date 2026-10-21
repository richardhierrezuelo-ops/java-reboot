//Exercise 3: Advanced Optional
//Create a method Optional<String> findLongestName(List<String> names) that returns
// the longest name using Streams and Optional.

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class AdvancedOptional {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("rick", "portia", "anna", "mike", "sarah");

        Optional<String> longestName = findLongestName(names);

        String name = longestName.orElse("Unknown Name");

        System.out.println("Longest name: " + name);
    }

    public static Optional<String> findLongestName(List<String> names) {
        if (names == null || names.isEmpty())
            return Optional.empty();

        Optional<String> longestName = names.stream()
                .max(Comparator.comparing(String::length));

        return longestName;
    }
}
