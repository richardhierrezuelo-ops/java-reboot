public class EmployeeDemo {
    public static void main(String[] args) {
        Employee manager = new Manager();

        System.out.println(manager.calculateBonus(100000));
        System.out.println(manager.calculateBonus(100000,5));

    }
}
