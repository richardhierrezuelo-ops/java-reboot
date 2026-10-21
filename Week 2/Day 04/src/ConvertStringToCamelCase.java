//Description:
//Complete the method/function so that it converts dash/underscore delimited words into camel casing.
// The first word within the output should be capitalized only if the original word was capitalized
// (known as Upper Camel Case, also often referred to as Pascal case).
// The next words should be always capitalized.
//
//Examples
//"the-stealth-warrior" gets converted to "theStealthWarrior"
//
//"The_Stealth_Warrior" gets converted to "TheStealthWarrior"
//
//"The_Stealth-Warrior" gets converted to "TheStealthWarrior"

public class ConvertStringToCamelCase {
    public static void main(String[] args) {
        System.out.println(toCamelCase("the-stealth-warrior"));  // "theStealthWarrior"
        System.out.println(toCamelCase("The_stealth_Warrior"));  // "TheStealthWarrior"
        System.out.println(toCamelCase("The_Stealth-Warrior"));   // "TheStealthWarrior"
        System.out.println(toCamelCase("The-Stealth_Warrior"));   // "TheStealthWarrior"
    }

    static String toCamelCase(String s){
        if (s == null || s.isEmpty()) return "";

        if (s.contains("-") && !s.contains("_")) {
            String [] words = s.split("-");
            return camelBuilder(words);
        } else if (s.contains("_") && !s.contains("-")) {
            String[] words = s.split("_");
            return camelBuilder(words);
        } else if (s.contains("-") && s.contains("_")) {
            String[] words = s.split("[-_]");
            return camelBuilder(words);
        }
        return null;
    }

    static String camelBuilder(String[] words) {
        StringBuilder sb = new StringBuilder();
        int wordCount = 0;

        for (String word : words) {
            if (Character.isUpperCase(word.charAt(0))) {
                // 1. Convert the first character to uppercase
                sb.append(word);
            } else {
                if (wordCount > 0) {
                    char firstChar = Character.toUpperCase(word.charAt(0));
                    word = firstChar + word.substring(1);
                    sb.append(word);
                } else {
                    sb.append(word);
                }

            }
            wordCount++;
        }
        return sb.toString();
    }


}
