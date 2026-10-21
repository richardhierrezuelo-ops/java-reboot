import java.util.ArrayList;
import java.util.List;

public class PayrollApp {

    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();

        Employee employee = new HourlyEmployee("Richard", 25, 10);
        employeeList.add(employee);

        employee = new CommissionEmployee("Portia", 1000, 15, .07);
        employeeList.add(employee);

        employee = new SalariedEmployee("Anna", 10000);
        employeeList.add(employee);

        PayrollProcessor payrollProcessor = new PayrollProcessor(employeeList);
        payrollProcessor.printPayroll();
    }
}
