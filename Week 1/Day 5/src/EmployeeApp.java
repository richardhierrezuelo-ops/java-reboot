public class EmployeeApp {
    public static void main(String[] args) {

        Employee e1 = new Employee("Portia", 500);
        Employee m1 = new Manager("Rick", 1000, "IT");

        e1.introduce();
        m1.introduce();
    }
}
