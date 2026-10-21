public class Car extends Vehicle {

    public Car(String brand) {
        super(brand);
    }

    @Override
    public void start() {
        super.start();
        System.out.println("Car engine is starting");
    }

    public void drive() {
        System.out.println("Car is driving");
    }

}
