import java.util.*;
import java.util.stream.Collectors;

public class EmployeeGroupingExercise {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Rick", "IT", 5000),
                new Employee("Portia", "IT", 6000),
                new Employee("Mike", "Marketing", 4000),
                new Employee("Anna", "Marketing", 7000),
                new Employee("Henry", "IT", 4500)
        );

        System.out.println(getDeptarmentAverage(employees));
    }

    public static Map<String, Double> getDeptarmentAverage(List<Employee> employees){
        if (employees == null || employees.isEmpty()) {
            return new HashMap<>();
        }

        return employees.stream()
                .collect(Collectors.groupingBy(Employee:: getDepartment,
                Collectors.averagingDouble(Employee::getSalary)));

    }

}
