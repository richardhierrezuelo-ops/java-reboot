import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AnagramChecker {

    public static void main(String[] args) {
        System.out.println(isAnagram("listen", "silent"));
        System.out.println(isAnagram("Java", "avaJ"));
        System.out.println(isAnagram("hello", "world"));
        System.out.println(isAnagram("The Eyes", "They See"));
    }

    public static boolean isAnagram(String s1, String s2) {
        if (s1 == null || s2 == null) {
            return false;
        }

        if(s1.length() == s2.length()) {
           // 1. Split into letters and create a mutable ArrayList
            List<String> list1 = new ArrayList<>(Arrays.asList(s1.trim().toLowerCase().split("")));
            List<String> list2 = new ArrayList<>(Arrays.asList(s2.trim().toLowerCase().split("")));

            // 2. Sort alphabetically
            Collections.sort(list1);
            Collections.sort(list2);

            System.out.println(list1 + " " + list2);
            if (list1.equals(list2)) {
                return true;
            } else {
                return false;
            }

        } else {
            return false;
        }
    }
}
