public class Exercise2_CaseInsensitiveComparison {

    public static void main(String[] args) {
        System.out.println("areNamesEqual: " + areNamesEqual("Richard", "richard"));
        System.out.println("areNamesEqual: " + areNamesEqual("JAVA", "java"));
        System.out.println("areNamesEqual: " + areNamesEqual("John", "Johnny"));
    }

    public static boolean areNamesEqual(String firstName, String secondName) {
        return firstName.equalsIgnoreCase(secondName);
    }
}
