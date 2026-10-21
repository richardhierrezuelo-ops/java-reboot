public class OrderComposite {

    private final Order order;
    private final String recipient;
    private final SenderService sender;

    public OrderComposite(Order order, String recipient, SenderService sender) {
        this.order = order;
        this.recipient = recipient;
        this.sender = sender;
    }

    public Order getOrder() {
        return order;
    }
    public String getRecipient() {
        return recipient;
    }

    public SenderService getSender() {
        return sender;
    }

}
