import java.util.*;
import java.util.stream.Collectors;

public class ProductTest {
    public static void main(String[] args) {

        List<Product> productList = new ArrayList<>();
        productList.add(new Product("Playstation 5", 800, "Game Console"));
        productList.add(new Product("SteamCube", 1300, "Game Console"));
        productList.add(new Product("Xbox Series X", 900, "Game Console"));

        productList.add(new Product("Samsung TV", 800, "TV"));
        productList.add(new Product("Sony TV", 1500, "TV"));
        productList.add(new Product("Pansonic", 900, "TV"));

        productList.add(new Product("Samsung Galaxy", 1800, "Cell Phone"));
        productList.add(new Product("Apple", 1500, "Cell Phone"));
        productList.add(new Product("Galaxy", 900, "Cell Phone"));

        Map<String, Optional<Product>> expensiveProducts = getExpensiveProducts(productList);

        for  (Map.Entry<String, Optional<Product>> entry : expensiveProducts.entrySet()) {
            String productName = entry.getValue()
                                .map(Product::getName)
                                .map(String::toUpperCase)
                                .orElse("UNKNOWN");
            System.out.println(entry.getKey() + " : " + productName);
        }
    }

    public static Map<String, Optional<Product>> getExpensiveProducts(List<Product> productList) {
        if (productList == null || productList.isEmpty()) {
            return null;
        }

        Map<String, Optional<Product>> expensiveProducts =  productList.stream()
                                   .collect(Collectors.groupingBy(Product:: getCategory,
                                    Collectors.maxBy(Comparator.comparingDouble(Product:: getPrice))));


        return expensiveProducts;
    }
}
