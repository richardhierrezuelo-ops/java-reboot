public class RemoveVowels {
    public static void main(String[] args) {

        String sentence = "Java is fun";
        System.out.println("Before: " + sentence);
        System.out.println("After: " + removeVowels(sentence));
    }

    public static String removeVowels(String str) {
        if (str == null || str.isEmpty())
            return "";

        return str.replaceAll("[aeiouAEIOU]", "");
    }
}
