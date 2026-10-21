//Abstract class and inheritance

public abstract class Employee {

    private final String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    abstract double calculatePay();
}
