public class OrderApp {

    public static void main(String[] args) {

        SenderService sender = new EmailSender();
        OrderProcessor processor = new OrderProcessor(sender);
        processor.processOrder(
                new Order("ORD-101", 150.00),
                "customer@example.com"
        );

        sender = new SmsSender();
        processor = new OrderProcessor(sender);
        processor.processOrder(
                new Order("ORD-102", 75.00),
                "555-1234"
        );
    }
}

