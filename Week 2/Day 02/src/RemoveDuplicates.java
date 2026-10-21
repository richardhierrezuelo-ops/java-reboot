//Exercise 1: Remove Duplicates
//Write a method that takes a List<String> and returns a new List with duplicates removed while preserving order.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<String> originalString = Arrays.asList("Rick", "Mike", "Portia", "Anna", "Portia");
        System.out.println("Original string: " + originalString);
        System.out.println("Duplicate Removed: " + removeDuplicates(originalString));
    }

    public static List<String> removeDuplicates(List<String> lists) {
        if (lists == null || lists.isEmpty()) {
            return new ArrayList<>();
        }

        List<String> result = new ArrayList<>();
        for (String list : lists) {
            if (!result.contains(list)) {
                result.add(list);
            }
        }
        return result;
    }
}
