//Exercise 2: Functional Interfaces
//Use Predicate<String> to check if a string is a palindrome.
//Use Function<String, Integer> to return the length of a string.

import java.util.function.Function;
import java.util.function.Predicate;

public class Palindrome {
    public static void main(String[] args) {

        Predicate<String> isPalindrome = str -> {
            if (str == null || str.trim().isEmpty()) return false;
            // Clean the string: remove spaces and convert to lowercase
            String cleaned = str.replaceAll("\\s+", "").toLowerCase();

            // Reverse using StringBuilder (most efficient)
            String reversed = new StringBuilder(cleaned).reverse().toString();

           return cleaned.equals(reversed);
        };

        Function<String, Integer> stringLength = str-> str.length();

        System.out.println("isPalindrome: " + isPalindrome.test("A man a plan a canal Panama"));
        System.out.println("isPalindrome: " + isPalindrome.test("racecar"));
        System.out.println("isPalindrome: " + isPalindrome.test("kayak"));
        System.out.println("isPalindrome: " + isPalindrome.test("madame"));

        System.out.println("Palindrome Length: " + stringLength.apply("A man a plan a canal Panama"));
        System.out.println("Palindrome Length: " + stringLength.apply("racecar"));
        System.out.println("Palindrome Length: " + stringLength.apply("kayak"));
        System.out.println("Not Palindrome Length: " + stringLength.apply("madame"));
    }

}
