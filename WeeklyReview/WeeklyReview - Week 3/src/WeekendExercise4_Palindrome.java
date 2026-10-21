public class WeekendExercise4_Palindrome {
    public static void main(String[] args) {
        System.out.println("racecar -> " + isPalindrome("racecar"));
        System.out.println("level -> " + isPalindrome("level"));
        System.out.println("hello -> " + isPalindrome("hello"));
        System.out.println("abba -> " + isPalindrome("abba"));
        System.out.println("abca -> " + isPalindrome("abca"));
        System.out.println("\"\" -> " + isPalindrome(""));

    }

    public static boolean isPalindrome(String text) {

        if (text.isBlank()) {
            return true;
        }

        int left = 0;
        int right = text.length() - 1;

        while (left < right) {
            if (text.charAt(left) != text.charAt(right)){
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
