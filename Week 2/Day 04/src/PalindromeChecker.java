public class PalindromeChecker {
    public static void main(String[] args) {

        System.out.println("isPalindrome: " + isPalindrome("A man a plan a canal Panama"));
        System.out.println("isPalindrome: " + isPalindrome("racecar"));
        System.out.println("isPalindrome: " + isPalindrome("kayak"));
        System.out.println("isPalindrome: " + isPalindrome("madame"));
    }

    public static boolean isPalindrome(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }

        StringBuffer sb = new StringBuffer();

        String cleanOrigStr = str.toLowerCase().replaceAll(" ", "");

        String[] checkStr = cleanOrigStr.split("");

        for (int i = checkStr.length -1;  i >= 0; i--) {
            sb.append(checkStr[i]);
        }

        System.out.println("Original Clean: " + cleanOrigStr);
        System.out.println("Reversed: " + sb.toString());

        return cleanOrigStr.equals(sb.toString());
    }

}
