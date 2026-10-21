 public class Student {

  //1. Static vs Instance Members

    // Instance variables (each object has its own copy)
    private String name;
    private int age;

    // Static variable (shared across all objects)
    public static int totalStudents = 0;
    public static final String SCHOOL_NAME = "Greenwood Academy"; // constant

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        totalStudents++;               // Increment shared counter
    }

    // Instance method
    public String getInfo() {
        return name + " (" + age + " years old)";
    }

    // Static method
    public static int getTotalStudents() {
        return totalStudents;
    }

    public static void printSchoolInfo() {
        System.out.println("School: " + SCHOOL_NAME);
    }
}