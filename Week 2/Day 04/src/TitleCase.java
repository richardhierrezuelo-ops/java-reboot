public class TitleCase {
    public static void main(String[] args) {

        System.out.println(toTitleCase("the quick brown fox"));
        System.out.println(toTitleCase("java is awesome"));
        System.out.println(toTitleCase("hello   world"));
    }

    public static String toTitleCase(String sentence) {
        if (sentence == null || sentence.isEmpty()) {
            return "";
        }

        StringBuilder result = new StringBuilder();
        String[] words = sentence.split(" ");

        for (int i = 0; i < words.length; i++) {
            if (words[i].isEmpty()) {
                continue;
            }
            result.append(Character.toUpperCase(words[i].charAt(0)) + words[i].substring(1));

            if  (i < words.length - 1) {
                result.append(' ');
            }
        }

        return result.toString();
    }
}
