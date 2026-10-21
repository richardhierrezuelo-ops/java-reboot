//Exercise D (Medium)
//Create a Car class with model (String), year (int), and price (double).  Sort a list of cars by:Year descending (newest cars first)
//Price ascending (cheapest first) if years are equal

public class Car {
    private String model;
    private int year;
    private double price;

    public Car(String model, int year, double price) {
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Car{" + "model=" + model + ", year=" + year + ", price=$" + price + '}';
    }

}
