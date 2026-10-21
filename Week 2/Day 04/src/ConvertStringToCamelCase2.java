public class ConvertStringToCamelCase2 {

    public static void main(String[] args) {
        System.out.println(toCamelCase("the-stealth-warrior"));  // theStealthWarrior
        System.out.println(toCamelCase("The_stealth_Warrior"));  // TheStealthWarrior
        System.out.println(toCamelCase("The_Stealth-Warrior"));  // TheStealthWarrior
    }

    static String toCamelCase(String s) {
        if (s == null || s.isEmpty()) {
            return "";
        }

        // Replace all separators with space for easy splitting
        String cleaned = s.replaceAll("[-_]", " ");
        String[] words = cleaned.split("\\s+");

        StringBuilder result = new StringBuilder(words[0]);

        for (int i = 1; i < words.length; i++) {
            String word = words[i];
            if (!word.isEmpty()) {
                result.append(Character.toUpperCase(word.charAt(0)))
                        .append(word.substring(1));
            }
        }

        return result.toString();
    }
}
