import java.util.*;
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

        Map<String, Optional<Employee>> highestPaidEmployees = employees.stream()
                .collect(Collectors.groupingBy(Employee:: getDepartment
                          , Collectors.maxBy(Comparator.comparingInt(Employee::getSalary))));

        for (Map.Entry<String, Optional<Employee>> entry : highestPaidEmployees.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue()
                    .map(Employee:: getName)
                    .orElse("UNKNOWN"));

        }
    }
}
