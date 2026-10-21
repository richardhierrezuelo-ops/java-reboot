// Student.java
public class StudentDemo {

    // Fields (instance variables)
    private String name;
    private int age;
    private String email;

    // Constructor
    public StudentDemo(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // toString() - very important in interviews
    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + ", email='" + email + "'}";
    }
}
