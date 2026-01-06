public class Day7_Fleet {
    public static void main(String[] args) {
        Car1[] garage = new Car1[3];
        garage[0] = new Car1("Honda", "Civic", 2019);
        garage[1] = new Car1("Ford", "F-150", 2021);
        garage[2] = new Car1("Tesla", "Model 3", 2023);

        for (Car1 c : garage) {
            c.startEngine();
            System.out.println(c.getFullName());
        }
    }
}

class Car1 {
    // Add fields, constructor, and methods here
    private String name;
    private String model;
    private int year;

    public Car1(String name, String model, int year) {
        this.name = name;
        this.model = model;
        this.year = year;
    }

    public void startEngine() {
        System.out.println("Engine started.");
    }

    public String getFullName() {
        return name + " " + model + " (" + year + ")";
    }
}



