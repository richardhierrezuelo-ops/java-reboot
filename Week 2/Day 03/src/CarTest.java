//Exercise D (Medium)
//Create a Car class with model (String), year (int), and price (double).  Sort a list of cars by:Year descending (newest cars first)
//Price ascending (cheapest first) if years are equal

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CarTest {
    public static void main(String[] args) {
        Car c1 = new Car("Toyota", 2000, 500);
        Car c2 = new Car("Honda", 2003, 100);
        Car c3 = new Car("Hyundai", 2005, 200);
        Car c4 = new Car("Ford", 2001, 400);
        Car c5 = new Car("Mercedes", 2004, 500);
        Car c6 = new Car("BMW", 2005, 100);

      List<Car> cars = new ArrayList<>();
      cars.add(c1);
      cars.add(c2);
      cars.add(c3);
      cars.add(c4);
      cars.add(c5);
      cars.add(c6);

      cars.sort(Comparator.comparing(Car::getYear, Comparator.reverseOrder())
              .thenComparing(Car::getPrice));

      for(Car car : cars) {
          System.out.println(car);
      }

    }
}
