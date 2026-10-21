import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderApp2 {
    public static void main(String[] args) {
      List<OrderComposite> orderList = new ArrayList<>();
        List<OrderComposite> orderList2 = new ArrayList<>();

        SenderService sender = new EmailSender();
        OrderComposite order = new OrderComposite( new Order("ORD-101", 150.00),
                "customer@example.com", sender);

        orderList.add(order);

        sender = new SmsSender();
        order = new OrderComposite( new Order("ORD-101", 75.00),
                "555-1234", sender);
        orderList.add(order);

        Map<String, List<OrderComposite>> map = new HashMap<>();
        map.put("ORD-101", orderList);

       sender = new EmailSender();
       order = new OrderComposite( new Order("ORD-102", 150.00),
                "customer2@example.com", sender);

        orderList2.add(order);
        sender = new SmsSender();
        order = new OrderComposite( new Order("ORD-102", 75.00),
                "566-9874", sender);
        orderList2.add(order);
        map.put("ORD-102", orderList2);

        OrderProcessor2 processor = new OrderProcessor2(map);
        processor.processOrder();

}

}
