public class OrderProcessor {

    private final SenderService sender;

    public OrderProcessor(SenderService sender) {
        this.sender = sender;
    }
    public void processOrder(
            Order order,
            String recipient) {

        System.out.println("Processing order: " + order.getOrderId());

        sender.send(recipient, "Order processed");
    }
}

