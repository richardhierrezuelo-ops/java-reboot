public class Exercise6_UsernameStatus {
    public static void main(String[] args) {

        System.out.println("\"\" -> " + getUsernameStatus(""));
        System.out.println("\"   \" -> " + getUsernameStatus("   "));
        System.out.println("Bob -> " + getUsernameStatus("Bob"));
        System.out.println("John -> " + getUsernameStatus("John"));
        System.out.println("Richard -> " + getUsernameStatus("Richard"));
        System.out.println("JavaDev -> " + getUsernameStatus("JavaDev"));
    }

    public static String getUsernameStatus(String username) {
        if (username.isBlank()) {
            return "Invalid";
        } else if (username.length() < 5) {
            return "Too Short";
        } else {
            return "Valid";
        }
    }
}
