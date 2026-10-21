import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeTest {
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Rick", "IT", 5000));
        employees.add(new Employee("Portia", "Accounting", 5000));
        employees.add(new Employee("Mike", "Marketing", 1000));
        employees.add(new Employee("Anna", "Accounting", 10000));
        employees.add(new Employee("Messi", "Marketing", 5000));
        employees.add(new Employee("Henry", "IT", 3000));

        List<Employee> filteredEmployees = employees.stream()
                .collect(Collectors.groupingBy(Employee:: getDepartment,
                        Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))))
                         // This results in a Map<String, Optional<Employee>>
                .values() // Get just the collection of Optional<Employee> values
                .stream() // Stream the map values
                .flatMap(Optional::stream)
                .toList();


        for  (Employee employee : filteredEmployees) {
            System.out.println(employee);
        }
    }
}
