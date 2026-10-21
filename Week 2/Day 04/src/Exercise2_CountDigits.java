public class Exercise2_CountDigits {
    public static void main(String[] args) {
        System.out.println("Java17: " + countDigits("Java17"));
        System.out.println("12345: " + countDigits("12345"));
        System.out.println("Hello World: " + countDigits("Hello World"));
        System.out.println("abc123xyz456: " + countDigits("abc123xyz456"));
    }

    public static int countDigits(String text) {
        int count = 0;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) >= '0' && text.charAt(i) <= '9') {
                count++;
            }
        }

        return count;
    }
}
