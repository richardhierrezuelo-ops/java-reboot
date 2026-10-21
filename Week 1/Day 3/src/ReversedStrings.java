public class ReversedStrings {

    public static void main(String[] args) {
        String sentence = "world";

        System.out.println("Original sentence: " + sentence);
        System.out.println("Reversed sentence: " + solution(sentence));

        System.out.println("Original sentence: " + "word");
        System.out.println("Reversed sentence: " + solution("word"));
    }

//    Complete the solution so that it reverses the string passed into it.
//
//'world'  =>  'dlrow'
//'word'   =>  'drow'

    public static String solution(String str) {
        if (str == null || str.isEmpty()) {
            return "";
        }

        StringBuilder sb = new StringBuilder();

        for (int i=str.length()-1; i>=0; i--) {
            char ch = str.charAt(i);
            sb.append(ch);
        }
        return sb.toString();
    }

}
