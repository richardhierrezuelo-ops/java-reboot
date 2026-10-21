public class Exercise3_ContainsKeyword {
    public static void main(String[] args) {
        System.out.println("containsJava: " + containsJava("I am learning Java"));
        System.out.println("containsJava: " + containsJava("Java Reboot"));
        System.out.println("containsJava: " + containsJava("I am learning Python"));
        System.out.println("containsJava: " + containsJava("I love java"));
    }

    public static boolean containsJava(String text) {
        return text.contains("Java");
    }
}
