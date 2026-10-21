//Create a Product class with name (String) and price (double).
// Sort a list of products by price ascending (cheapest first).

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ProductPriceTest {

    public static void main(String[] args) {
        Product p1 = new Product("Playstation", 500);
        Product p2 = new Product("Xbox", 800);
        Product p3 = new Product("TV", 300);
        Product p4 = new Product("Dreamcast", 200);
        Product p5 = new Product("Nintendo", 300);

        List<Product> products = new ArrayList<>();
        products.add(p1);
        products.add(p2);
        products.add(p3);
        products.add(p4);
        products.add(p5);

        products.sort(Comparator.comparing(Product::getPrice).thenComparing(Product::getName));

        for(Product p: products) {
            System.out.println(p);
        }
    }
}
