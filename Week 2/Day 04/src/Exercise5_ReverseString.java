public class Exercise5_ReverseString {

    public static void main(String[] args) {
        System.out.println("Java -> " + reverseString("Java"));
        System.out.println("Hello -> " + reverseString("Hello"));
        System.out.println("Richard -> " + reverseString("Richard"));
    }

    public static String reverseString(String text) {
        StringBuilder sb = new StringBuilder();

        for (int i = text.length() - 1; i >= 0; i--) {
            sb.append(text.charAt(i));
        }

        return sb.toString();
    }
}
