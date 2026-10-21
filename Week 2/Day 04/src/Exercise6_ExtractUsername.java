public class Exercise6_ExtractUsername {

    public static void main(String[] args) {
        System.out.println("richard@gmail.com -> " + extractUsername("richard@gmail.com"));
        System.out.println("john@yahoo.com -> " + extractUsername("john@yahoo.com"));
        System.out.println("admin@example.org -> " + extractUsername("admin@example.org"));
    }

    public static String extractUsername(String email) {
        int index = email.indexOf("@");

        return email.substring(0, index);
    }
}
