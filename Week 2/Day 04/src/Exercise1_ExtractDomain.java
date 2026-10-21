public class Exercise1_ExtractDomain {

    public static void main(String[] args) {
        System.out.println("richard@gmail.com -> " + extractDomain("richard@gmail.com"));
        System.out.println("test@yahoo.com -> " + extractDomain("test@yahoo.com"));
        System.out.println("user@example.org -> " + extractDomain("user@example.org"));
    }

    public static String extractDomain(String email) {
        int index = email.indexOf("@");

        return email.substring(index + 1);
    }
}
