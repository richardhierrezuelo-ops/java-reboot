public class Exercise2_FirstLastCharacter {

    public static void main(String[] args) {
        System.out.println("Java -> " + getFirstAndLastCharacter("Java"));
        System.out.println("Hello -> " + getFirstAndLastCharacter("Hello"));
        System.out.println("World -> " + getFirstAndLastCharacter("World"));
    }

    public static String getFirstAndLastCharacter(String text) {
        StringBuilder sb = new StringBuilder();

        sb.append(text.charAt(0));
        sb.append(text.charAt(text.length() - 1));

        return sb.toString();
    }

}
