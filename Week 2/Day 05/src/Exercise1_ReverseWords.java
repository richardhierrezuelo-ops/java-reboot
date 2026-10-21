public class Exercise1_ReverseWords {

    public static void main(String[] args) {
        System.out.println("Java is fun -> " + reverseWords("Java is fun"));
        System.out.println("I love Java -> " + reverseWords("I love Java"));
        System.out.println("Hello World -> " + reverseWords("Hello World"));
    }

    public static String reverseWords(String text) {
        String[] words = text.split(" ");
        StringBuilder sb = new StringBuilder();

        for (int i = words.length - 1;  i >= 0; i--) {
           if (i == 0) {
               sb.append(words[i]);
           } else {
               sb.append(words[i] + " ");
           }
        }

        return sb.toString();
    }
}
