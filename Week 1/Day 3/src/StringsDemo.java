public class StringsDemo {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "hello";

        System.out.println(s1.equals(s2));           // false
        System.out.println(s1.equalsIgnoreCase(s2)); // true
        System.out.println(s1.toUpperCase());        // HELLO (new string)

        // StringBuilder - mutable and efficient for modifications
        StringBuilder sb = new StringBuilder();
        sb.append("Hello");
        sb.append(" ");
        sb.append("Rick");
        System.out.println(sb.toString());

        // String formatting
        String message = String.format("Name: %s, Age: %d", "Rick", 35);
    }
}
