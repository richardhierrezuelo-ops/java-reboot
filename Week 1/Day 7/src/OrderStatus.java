public enum OrderStatus {
    PENDING("Waiting for payment"),
    PAID("Payment received"),
    SHIPPED("Order has been shipped"),
    DELIVERED("Order delivered"),
    CANCELLED("Order cancelled");

    private final String description;

    OrderStatus(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
