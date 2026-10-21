public class ToTitleCase {
    public static void main(String[] args) {
        String sentence = "the quick brown fox";

        System.out.println(toTitleCase(sentence));
    }

    public static String toTitleCase(String sentence) {
        if  (sentence == null || sentence.isEmpty()) {
            return "";
        }

        StringBuilder sb = new StringBuilder();

        String[] words = sentence.split("\\s+");
        for (String word : words) {
            sb.append(word.substring(0,1).toUpperCase() + word.substring(1));
            sb.append(" ");

//        if (!word.isEmpty()) {
//            sb.append(Character.toUpperCase(word.charAt(0)))
//              .append(word.substring(1).toLowerCase())
//              .append(" ");
//        }

        }

        return sb.toString().trim();
    }
}
