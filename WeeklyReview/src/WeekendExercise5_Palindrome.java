public class WeekendExercise5_Palindrome {

    public static void main(String[] args) {
        System.out.println("level -> " + isPalindrome("level"));
        System.out.println("Java -> " + isPalindrome("Java"));
        System.out.println("madam -> " + isPalindrome("madam"));
        System.out.println("hello -> " + isPalindrome("hello"));
    }

    public static boolean isPalindrome(String text) {
        StringBuilder sb = new StringBuilder();

        for (int i = text.length() - 1; i >= 0; i--) {
            sb.append(text.charAt(i));
        }
        return text.equals(sb.toString());
    }
}
