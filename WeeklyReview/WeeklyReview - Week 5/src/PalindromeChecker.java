public class PalindromeChecker {
    public static void main(String[] args) {
        System.out.println("racecar -> " + isPalindrome("racecar"));
        System.out.println("RaceCar -> " + isPalindrome("RaceCar"));
        System.out.println("A man, a plan, a canal: Panama -> " + isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println("Never odd or even -> " + isPalindrome("Never odd or even"));
        System.out.println("hello -> " + isPalindrome("hello"));
        System.out.println("abca -> " + isPalindrome("abca"));
        System.out.println("\"\" -> " + isPalindrome(""));
        System.out.println("null -> " + isPalindrome(null));
        System.out.println("!!! -> " + isPalindrome("!!!"));
    }

    public static boolean isPalindrome(String input) {
        if (input == null) {
            return false;
        }

        String cleanString = input.replaceAll("[^a-zA-Z]", "").toLowerCase();

        int left = 0;
        int right = cleanString.length() - 1;

        while (left < right) {
            if (cleanString.charAt(left) != cleanString.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}
