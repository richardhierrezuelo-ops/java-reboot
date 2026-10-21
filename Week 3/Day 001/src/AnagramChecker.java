import java.util.Arrays;

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

        String clean1 = s1.replaceAll("\\s+", "").toLowerCase();
        String clean2 = s2.replaceAll("\\s+", "").toLowerCase();

        if (clean1.length() != clean2.length()) {
            return false;
        }

        char[] chars1 = clean1.toCharArray();
        Arrays.sort(chars1);

        char[] chars2 = clean2.toCharArray();
        Arrays.sort(chars2);

        String sorted1 = new String(chars1);
        String sorted2 = new String(chars2);

        return  sorted1.equals(sorted2);
    }
}
