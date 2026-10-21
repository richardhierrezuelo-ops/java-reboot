public class VehicleDemo {
    public static void main(String[] args) {

        Car toyota = new Car("Toyota");
        System.out.println("Brand: " + toyota.getBrand());
        toyota.start();
        toyota.drive();

        Vehicle honda = new Car("Honda");
        honda.start();

    }
}
