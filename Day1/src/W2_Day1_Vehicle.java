public class W2_Day1_Vehicle {
    public static void main(String[] args) {
        Car car = new Car("Toyota", 2023, 5);
        car.displayInfo();
    }
}

class Vehicle {
    protected String brand;
    protected int year;

    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public void displayInfo() {
        System.out.println(year + " " + brand);
    }
}

class Car extends Vehicle {
    private int doors;

    public Car(String brand, int year, int doors) {
        // TODO: call parent constructor
        super(brand, year);
        this.doors = doors;
    }

    @Override
    public void displayInfo() {
        // TODO: add "Car with X doors"
        System.out.println(year + " " + brand + " with " + doors + " doors");
    }
}

