public class Day6_Car {
    // TYPE THESE YOURSELF
    private String make;
    private String model;
    private int year;

    public Day6_Car(String make, String model, int year) {
        // Constructor
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void startEngine() {
        // Instance method
        System.out.println("Engine started.");
    }

    public String getFullName() {
        // Return "make model (year)"
        return make + " " + model + " (" + year + ")";
    }

    public static void main(String[] args) {
        Day6_Car myCar = new Day6_Car("Toyota", "Camry", 2020);
        myCar.startEngine();
        System.out.println(myCar.getFullName());
    }

}
