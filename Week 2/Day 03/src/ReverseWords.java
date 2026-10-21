public class ReverseWords {

    public static void main (String[] args) {
        System.out.println(reverseWords("Hello World Java"));
    }

    public static String reverseWords(String s) {
        if (s == null || s.isEmpty()) {
            return s;
        }

        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder();

        for (int i = words.length - 1; i>=0; i--){
            sb.append(words[i]);

            if (i >0) {
                sb.append(" ");
            }
        }

        return sb.toString();
    }
}
