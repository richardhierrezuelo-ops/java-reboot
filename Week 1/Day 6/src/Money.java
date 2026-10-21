import java.math.BigDecimal;
import java.util.Currency;

public final class Money {

    private final BigDecimal amount;
    private final Currency currency;

    public Money(BigDecimal amount, Currency currency) {
        if (amount == null || currency == null) {
            throw new IllegalArgumentException("Amount and currency cannot be null");
        }
        if (amount.scale() > 2) {
            throw new IllegalArgumentException("Amount can have maximum 2 decimal places");
        }
        this.amount = amount;
        this.currency = currency;
    }

    public Money add(Money other) {
        if (!this.currency.equals(other.currency)) {
            throw new IllegalArgumentException("Cannot add different currencies");
        }
        return new Money(this.amount.add(other.amount), this.currency);
    }

//    public Money subtract(Money other) { ... }

    // Getters only
    public BigDecimal getAmount() { return amount; }
    public Currency getCurrency() { return currency; }

    @Override
    public String toString() {
        return amount + " " + currency;
    }
}
