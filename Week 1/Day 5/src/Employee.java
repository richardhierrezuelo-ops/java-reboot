public class Employee {
    protected String name;
    protected double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = Math.max(salary, 0);   // Prevent negative initial  salary;
    }

    public void introduce() {
        System.out.println("Hi, I'm " + name);
    }

}
