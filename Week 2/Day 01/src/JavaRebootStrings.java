public class JavaRebootStrings {
    public static void main(String[] args) {
        printStringInfo("Java");
    }

    public static void printStringInfo(String text) {
        System.out.println("String: " + text);
        System.out.println("Length: " + text.length());
        System.out.println("First Character: " + text.charAt(0));
        System.out.println("Last Character: " + text.charAt(text.length() -1));
        System.out.println("------------------------------");

        System.out.println("Count: " + countCharacter("Banana", 'a'));
        System.out.println("Count: " + countCharacter("Banana", 'n'));
        System.out.println("Count: " + countCharacter("Banana", 'B'));
        System.out.println("------------------------------");

        System.out.println("Count Vowels: " + countVowels("Hello World"));
        System.out.println("Count Vowels: " + countVowels("JAVA"));
        System.out.println("------------------------------");

        System.out.println("Reverse String: " + reverseString("Java"));
        System.out.println("Reverse String: " + reverseString("Hello"));
        System.out.println("------------------------------");


    }

    public static int countCharacter(String text, char target) {
        int count = 0;

        for (int i =0; i < text.length(); i++) {
            if (text.charAt(i) == target) {
                count++;
            }
        }
        return count;
    }

    public static int countVowels(String text) {
        int count = 0;

        String checkText = text.toLowerCase();
        for (int i = 0; i < checkText.length(); i++) {
            if (checkText.charAt(i) == 'a' || checkText.charAt(i) == 'e'
                    || checkText.charAt(i) == 'i' || checkText.charAt(i) == 'o'
                    || checkText.charAt(i) == 'u') {
                count++;
            }
        }

        return count;
    }

    public static String reverseString(String text) {
        StringBuilder sb = new StringBuilder();

        for (int i = (text.length() - 1); i >= 0; i--) {
            sb.append(text.charAt(i));
        }

        return sb.toString();
    }
}
