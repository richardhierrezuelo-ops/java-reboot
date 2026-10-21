public class Person {

    private String name;                    // Only this class
    protected int age;                      // Subclasses + same package
    String email;                           // Package-private (default)
    public String getName() {               // Public API
        return name;
    }
}