import java.util.List;
import java.util.Map;

public class OrderProcessor2 {
    private List<OrderComposite> orderList;
    private final Map<String, List<OrderComposite>> map;

    public OrderProcessor2(Map<String, List<OrderComposite>> map) {
        this.map = map;
    }
    public void processOrder() {

        for (Map.Entry<String, List<OrderComposite>> entry : map.entrySet()) {
            System.out.println("Processing order: " + entry.getKey());

            orderList =  entry.getValue();

            for (OrderComposite order : orderList) {
                order.getSender().send(order.getRecipient(), "Order processed");
            }
        }


    }
}
