public record Product(String name, int price, String category) {
    public boolean isExpensive() {
        return price > 1000;
    }

    // Compact constructor for validation
    public Product {
        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be negative");
        }
    }

}
