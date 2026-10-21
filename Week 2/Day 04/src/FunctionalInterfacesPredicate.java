import java.util.function.Predicate;

public class FunctionalInterfacesPredicate {
    public static void main(String[] args) {
        Predicate<String> isLong = s -> s.length() > 5;
        Predicate<String> startsWithA = s -> {
            if (s.charAt(0) == 'a' || s.charAt(0) == 'A') {
                return true;
            }
            else  {
                return false;
            }
        };
        Predicate<String> isPalindrome = s -> {
            if (s == null || s.length() ==0)
                return false;

            String cleanString = s.replaceAll("\\s+", "").toLowerCase();

            StringBuilder reversed = new  StringBuilder(cleanString).reverse();

            return cleanString.equals(reversed.toString());
        };


        System.out.println("isLong: " + isLong.test("Portia"));
        System.out.println("isLong: " + isLong.test("Rick"));
        System.out.println("startsWithA: " + startsWithA.test("Portia"));
        System.out.println("startsWithA: " + startsWithA.test("Anna"));
        System.out.println("isPalindrome: " + isPalindrome.test("A man a plan a canal Panama"));
        System.out.println("isPalindrome: " + isPalindrome.test("amadmane"));
    }
}
