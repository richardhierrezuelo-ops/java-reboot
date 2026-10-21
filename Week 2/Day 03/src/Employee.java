// Exercise C (Good Challenge)
//Create a Employee class with name, department, and salary.
// Sort a list of employees by:Department alphabetically (primary)
//Salary descending (highest salary first) — secondary
//Name alphabetically (tertiary)

public class Employee {
    private String name;
    private String department;
    private int salary;

    public Employee(String name, String department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }
    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return name + " " + department + " $" + salary;
    }
}
