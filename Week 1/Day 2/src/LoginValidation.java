public class LoginValidation {
    public static void main(String[] args) {
        System.out.println("Can Login: " + canLogin(true, true));
        System.out.println("Can Login: " + canLogin(true, false));
        System.out.println("Can Login: " + canLogin(false, true));
        System.out.println("Can Login: " + canLogin(false, false));
    }

    public static boolean canLogin(boolean accountActive, boolean correctPassword) {
        return accountActive && correctPassword;
    }

}
