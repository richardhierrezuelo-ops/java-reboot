import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class EmployeeTest {

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Rick", "IT", 5000));
        employees.add(new Employee("Portia", "Accounting", 5000));
        employees.add(new Employee("Mike", "Marketing", 1000));
        employees.add(new Employee("Anna", "Accoutning", 10000));

        employees.sort(Comparator.comparing(Employee::getDepartment)
                  .thenComparing(Employee::getSalary, Comparator.reverseOrder())
                  .thenComparing(Employee:: getName));

        for (Employee e : employees) {
            System.out.println(e);
        }
    }
}
