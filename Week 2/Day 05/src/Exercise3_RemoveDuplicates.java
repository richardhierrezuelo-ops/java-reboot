public class Exercise3_RemoveDuplicates {

    public static void main(String[] args) {
        System.out.println("banana -> " + removeDuplicates("banana"));
        System.out.println("hello -> " + removeDuplicates("hello"));
        System.out.println("java -> " + removeDuplicates("java"));

    }

    public static String removeDuplicates(String text) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char current = text.charAt(i);

            if (!sb.toString().contains(String.valueOf(current))) {
                sb.append(current);
            }

        }

        String rdh = "Richard";

        return rdh.substring(1);
//        System.out.println(newText);
//
//        return sb.toString();
    }
}
