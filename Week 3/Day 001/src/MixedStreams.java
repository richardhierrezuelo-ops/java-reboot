//Exercise 3: Mixed Stream + Optional
//Given a list of words, use stream to:
// Filter words longer than 4 characters
// Convert to uppercase
//Collect into a Set
//Return Optional<Set<String>>

import java.util.*;
import java.util.stream.Collectors;

public class MixedStreams {
    public static void main(String[] args) {

        List<String> words = Arrays.asList(
                "java", "stream", "api", "functional", "programming",
                "lambda", "optional", "collector", "filter", "map",
                "sorted", "reduce", "exercise", "practice"
        );

        System.out.println(filtered( words) );
    }


    public static Optional<Set<String>> filtered( List<String> words) {
        if (words == null || words.isEmpty()) {
            return Optional.empty();
        }

        Set<String> filteredList =  words.stream()
                .filter(word -> word.length() > 4)
                .map(String::toUpperCase)
                .collect(Collectors.toCollection(TreeSet::new));

        return Optional.of(filteredList);

    }
}
