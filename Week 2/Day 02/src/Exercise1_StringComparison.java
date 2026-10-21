public class Exercise1_StringComparison {
    public static void main(String[] args) {

        System.out.println("areStringsEqual: " + areStringsEqual("Java", "Java"));
        System.out.println("areStringsEqual: " + areStringsEqual("Java", "java"));
        System.out.println("areStringsEqual: " + areStringsEqual("Hello", "World"));
    }

    public static boolean areStringsEqual(String first, String second) {
        return first.equals(second);
    }
}
