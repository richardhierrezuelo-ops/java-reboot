public class ReverseWords {
    public static void main(String[] args) {
        String sentence = "Hello World Java";

        System.out.println("Original sentence: " + sentence);
        System.out.println("Reversed sentence: " + reverseWords(sentence));

    }

    private static String reverseWords(String sentence) {
        if (sentence == null || sentence.isEmpty()) {
            return "Invalid Input";
        }

        StringBuilder sb = new StringBuilder();
        String[] words = sentence.split(" ");
        for (int i=words.length-1; i>=0; i--) {
            if (i==0)
                sb.append(words[i]);
            else
             sb.append(words[i]+" ");
        }
        return sb.toString();
    }
}
