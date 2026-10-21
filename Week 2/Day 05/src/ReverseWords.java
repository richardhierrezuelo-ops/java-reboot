public class ReverseWords {

    public static void main(String[] args) {
        String sentence = "Hello World Java";
        System.out.println(reverseWords(sentence));

    }

    public static String reverseWords(String sentence) {
        if (sentence == null || sentence.trim().isEmpty()) {
            return "";
        }

        String[] words = sentence.split(" ");
        StringBuilder sb = new StringBuilder();

       for (int i = words.length -1; i >= 0; i--) {
           sb.append(words[i]);

           if (i > 0) {
               sb.append(" ");
           }
       }

       return sb.toString();
    }
}
