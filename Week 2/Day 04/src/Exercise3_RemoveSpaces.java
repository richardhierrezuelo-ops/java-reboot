public class Exercise3_RemoveSpaces {

    public static void main(String[] args) {
        System.out.println("Java Reboot -> " + removeSpaces("Java Reboot"));
        System.out.println("Hello World -> " + removeSpaces("Hello World"));
        System.out.println(" I love Java  -> " + removeSpaces(" I love Java "));
    }

    public static String removeSpaces(String text) {
        return text.replace(" ", "");
    }
}
