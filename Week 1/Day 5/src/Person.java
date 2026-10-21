public class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void introduce() {
        System.out.println("Hi, I'm " + name);
    }
}

// Child class
class Teacher extends Person {
    private String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);           // Call parent constructor
        this.subject = subject;
    }

    @Override
    public void introduce() {
        System.out.println("Hi, I'm " + name + ", I teach " + subject);
    }
}