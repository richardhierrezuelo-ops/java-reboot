public class Exercise4_FirstDuplicate {

    public static void main(String[] args) {
       System.out.println("programming -> " + findFirstDuplicate("programming"));
       System.out.println("hello -> " + findFirstDuplicate("hello"));
       System.out.println("java -> " + findFirstDuplicate("java"));
       System.out.println("abcde -> " + findFirstDuplicate("abcde"));
    }

    public static char findFirstDuplicate(String text) {
        for (int i = 0; i < text.length(); i++) {
               char current  = text.charAt(i);

            for (int j = i + 1; j < text.length(); j++) {
                if  (current  == text.charAt(j)) {
                    return  current ;
                }
            }
        }

        return  '\u0000';
    }
}
