public class Manager extends Employee {

    @Override
    public double calculateBonus(double salary) {
        return salary * .10;
    }

    @Override
    public double calculateBonus(double salary, double percentage) {
        return salary * ((percentage + 2)/ 100);
    }
}
