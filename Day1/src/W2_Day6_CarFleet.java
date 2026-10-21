import java.util.ArrayList;

public class W2_Day6_CarFleet {
    public static void main(String[] args) {

        // 1. Create an ArrayList that can only hold Car objects
        //    (Hint: ArrayList<Car> fleet = new ArrayList<>(); )
        ArrayList<Car3> fleet = new ArrayList<>();

        // 2. Add at least 5 cars (any brand you want)
        fleet.add(new Car3("Toyota", "Camry"));
        fleet.add(new Car3("Honda", "Accord"));
        fleet.add(new Car3("Ford", "Mustang"));
        fleet.add(new Car3("Tesla", "Model 3"));
        fleet.add(new Car3("BMW", "M4"));

        // 3. Print the total number of cars using .size()
        System.out.println("Total Cars: " + fleet.size());

        // 4. Print all cars using an enhanced for loop
        for(Car3 car : fleet) {
            System.out.println(car);
        }
        // 5. Remove the 2nd car (index 1) using .remove(1)
        System.out.println("\nRemoved one car...");
        fleet.remove(1);

        // 6. Print the new size and the updated list
        System.out.println("New Total: " + fleet.size());
        for(Car3 car : fleet) {
            System.out.println(car);
        }

        // 7. Try to add a String → it must NOT compile (type safety!)
        //     fleet.add("Hello");   // ← should cause compile error

        System.out.println("\n=== FINAL FLEET ===");
        // 8. Print all remaining cars with their position
        //    Expected format: "Car 1: Toyota Camry"

        for (int i=0; i<fleet.size(); i++) {
            Car3 car = fleet.get(i);
            System.out.println("Car" + (i + 1) + ": " + car);
        }
    }
}

// Simple Car class — DO NOT MODIFY
class Car3 {
    private String brand;
    private String model;

    public Car3(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    @Override
    public String toString() {
        return brand + " " + model;
    }
}
