public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        System.out.println("swiss -> " + findFirstNonRepeating("swiss"));
        System.out.println("leetcode -> " + findFirstNonRepeating("leetcode"));
        System.out.println("aabbcc -> " + findFirstNonRepeating("aabbcc"));
        System.out.println("abacabad -> " + findFirstNonRepeating("abacabad"));
        System.out.println("aA -> " + findFirstNonRepeating("aA"));
        System.out.println("\"\" -> " + findFirstNonRepeating(""));
        System.out.println("null -> " + findFirstNonRepeating(null));
    }

    public static char findFirstNonRepeating(String input) {

        if (input == null) {
            return '\0';
        }

       for (int i = 0; i < input.length(); i++) {
           int count = 0;
           char current = input.charAt(i);

           for (int j = 0; j < input.length(); j++) {
               if (input.charAt(j) == current) {
                   count++;
               }
           }

           if (count == 1) {
               return current;
           }
       }

       return  '\0';
    }
}
