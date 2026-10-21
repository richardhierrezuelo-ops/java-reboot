public class Exercise1_CountVowels {
    public static void main(String[] args) {
        System.out.println("hello: " + countVowels("hello"));
        System.out.println("Java: " + countVowels("Java"));
        System.out.println("programming: " + countVowels("programming"));
        System.out.println("xyz: " + countVowels("xyz"));
    }

    public static int countVowels(String text) {
        String normalizedText = text.toLowerCase();
        int count = 0;

        for (int i = 0; i < normalizedText.length(); i++) {
            if (normalizedText.charAt(i) == 'a' || normalizedText.charAt(i) == 'e' || normalizedText.charAt(i) == 'i'
                || normalizedText.charAt(i) == 'o' || normalizedText.charAt(i) == 'u') {
                count++;
            }
        }

        return count;
    }
}
