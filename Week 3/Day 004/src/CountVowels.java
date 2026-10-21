public class CountVowels {
    public static void main(String args[]) {
        String sentence = "java";

        System.out.println("java count: " + countVowels(sentence));
        System.out.println("Awesome count: " + countVowels("Awesome"));
    }

    public static int countVowels(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }

        int count = 0;
        for  (int i = 0; i < str.length(); i++) {
            Character ch = str.toLowerCase().charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }

        return count;
    }
}
