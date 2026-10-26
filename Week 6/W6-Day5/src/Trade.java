public class Trade {

    private String symbol;
    private int quantity;

    public Trade(String symbol, int quantity) {
        this.symbol = symbol;
        this.quantity = quantity;
    }

    public String getSymbol() {
        return symbol;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return symbol + "(" + quantity + ")";
    }
}
