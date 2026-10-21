public class Employee {

    public double calculateBonus(double salary) {
        return salary * .05;
    }

    public double calculateBonus(double salary, double percentage) {
        return salary * (percentage / 100);
    }


}
