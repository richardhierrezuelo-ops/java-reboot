import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee e1 = new Employee("Rick", "IT", 5000);
        Employee e2 = new Employee("Portia", "Accounting", 5000);
        Employee e3 = new Employee("Mike", "IT", 15000);
        Employee e4 = new Employee("Anna", "HR", 2000);

        List<Employee> employees = new ArrayList<>();
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);

        employees.sort(Comparator.comparing(Employee::getDepartment).thenComparing(Employee::getSalary, Comparator.reverseOrder()).thenComparing(Employee::getName));

        for(Employee e: employees){
            System.out.println(e);
        }

    }
}
