public class Exercise4_EmailValidation {
    public static void main(String[] args) {
        System.out.println("richard@gmail.com -> " + isValidEmail("richard@gmail.com"));
        System.out.println("test@example.com -> " + isValidEmail("test@example.com"));
        System.out.println("richardgmail.com -> " + isValidEmail("richardgmail.com"));
        System.out.println("\"\" -> " + isValidEmail(""));
        System.out.println("\"   \" -> " + isValidEmail("   "));
    }

    public static boolean isValidEmail(String email) {
        return !email.isBlank() && email.contains("@");
    }
}
