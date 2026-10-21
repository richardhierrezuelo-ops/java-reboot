//Exercise 2: Unique Names
//Given a list of names (with possible duplicates), return a Set of unique names sorted alphabetically.

import java.util.*;

public class UniqueNames {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Rick", "Mike", "Portia", "Anna", "Portia");
        System.out.println("Original name: " + names);
        System.out.println("Unique & Sorted names: " + getUniqueNames(names));
    }

    public static Set<String> getUniqueNames(List<String> names) {
        if (names == null) {
            return new TreeSet<>();
        }

        Set<String> uniqueNames =  new TreeSet<>();

        for (String name: names ) {
            uniqueNames.add(name);
        }

        return uniqueNames;

//        return new TreeSet<>(names);   // Most idiomatic way
    }
}
