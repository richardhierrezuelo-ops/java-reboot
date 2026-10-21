public class Exercise2_CountWords {

    public static void main(String[] args) {
        System.out.println("Java is fun -> " + countWords("Java is fun"));
        System.out.println("I love Java -> " + countWords("I love Java"));
        System.out.println("Hello -> " + countWords("Hello"));
        System.out.println("Java Reboot -> " + countWords("Java Reboot"));
    }

    public static int countWords(String text) {
        String[] words =  text.split(" ");
        return words.length;
    }
}
