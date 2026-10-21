public class WeekendReview_FirstNonRepeating {

    public static void main(String[] args) {
        System.out.println("swiss -> " + findFirstNonRepeating("swiss"));
        System.out.println("leetcode -> " + findFirstNonRepeating("leetcode"));
        System.out.println("aabbcdde -> " + findFirstNonRepeating("aabbcdde"));
        System.out.println("abcabcx -> " + findFirstNonRepeating("abcabcx"));
    }

    public static char findFirstNonRepeating(String text) {

        for (int i = 0; i < text.length(); i++) {
            char current = text.charAt(i);
            int count = 0;

            for (int j = 0; j < text.length(); j++) {
                if (text.charAt(j) == current) {
                    count++;
                }
            }

            if (count == 1) {
                return current;
            }
        }

        return '\0';
    }

}
