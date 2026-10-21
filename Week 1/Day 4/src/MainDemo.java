public class MainDemo {
    public static void main(String[] args) {
        StudentDemo s1 = new StudentDemo("Rick H", 35, "rick@example.com");
        StudentDemo s2 = new StudentDemo("Alice", 28, "alice@example.com");

        System.out.println(s1);
        System.out.println(s2.getName() + " is " + s2.getAge() + " years old.");
    }
}
