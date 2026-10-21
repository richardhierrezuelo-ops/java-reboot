import java.util.Arrays;
import java.util.List;

public class OrderFlatMapPractice {
    public static void main(String[] args) {
        List<Order> orders = Arrays.asList(
                new Order(Arrays.asList(new Item("apple", 3), new Item("banana", 1))),
                new Order(Arrays.asList(new Item("orange", 5), new Item("grape", 2)))
        );

        List<String> flatOrders = orders.stream()
                .flatMap(order -> order.getItems().stream())
                .filter(item -> item.getQuantity() > 1)
                .map(item -> item.getName().toUpperCase())
                .toList();

        System.out.println(flatOrders);
    }

}
