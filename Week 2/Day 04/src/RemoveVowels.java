//Write a method removeVowels(String str) that removes all vowels (a, e, i, o, u, A, E, I, O, U) from a string, while keeping consonants and other characters.Examples:"Java is fun" → "Jv s fn"
//"Hello World" → "Hll Wrld"
//"Why" → "Why" (y is not considered a vowel here)

public class RemoveVowels {
    public static void main(String[] args) {

        System.out.println(removeVowels("Java is fun"));
        System.out.println(removeVowels("Hello World"));
        System.out.println(removeVowels("Why"));
    }

    public static String removeVowels(String str) {
        if (str == null || str.isEmpty()) {
            return "";
        }

        String result = str.replaceAll("[aeiouAEIOU]", "");

        return result;
    }
}
