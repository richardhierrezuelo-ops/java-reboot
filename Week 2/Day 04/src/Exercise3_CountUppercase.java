public class Exercise3_CountUppercase {

    public static void main(String[] args) {
        System.out.println("Java -> " + countUppercase("Java"));
        System.out.println("JAVA -> " + countUppercase("JAVA"));
        System.out.println("Hello World -> " + countUppercase("Hello World"));
        System.out.println("java reboot -> " + countUppercase("java reboot"));
    }

    public static int countUppercase(String text) {
        int count = 0;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) >= 'A' && text.charAt(i) <= 'Z' )  {
                count++;
            }
        }

        return count;
    }
}
