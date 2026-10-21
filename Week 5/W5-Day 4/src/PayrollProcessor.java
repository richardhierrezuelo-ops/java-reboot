import java.util.List;

public class PayrollProcessor {

//  Composition
//  Your PayrollProcessor also demonstrates composition in the broad has-a sense:
//    It maintains a reference to a collection of employees rather than inheriting from Employee.
    private final List<Employee> employeeList;

//    And because the list is supplied through the constructor, you're also practicing constructor injection.
    public PayrollProcessor(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

//    Runtime polymorphism
//    At runtime, Java dispatches calculatePay() to the appropriate subclass implementation.
//    Your processor doesn't need to know whether the employee is salaried, hourly, or commission-based.
//    That's precisely the benefit of polymorphism in this design.
    public void printPayroll() {
        for (Employee employee : employeeList) {
            System.out.println("Employee: " + employee.getName() + " Salary: " + employee.calculatePay());
        }
    }
}
