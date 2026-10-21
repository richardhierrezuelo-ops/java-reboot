/**
 * Custom exception thrown when a withdrawal cannot be completed due to insufficient funds.
 */
public class InsufficientFundsException extends RuntimeException {

    private final double currentBalance;
    private final double attemptedAmount;

    public InsufficientFundsException(double currentBalance, double attemptedAmount) {
        super(String.format("Insufficient funds! Current balance: $%.2f, Attempted withdrawal: $%.2f",
                currentBalance, attemptedAmount));

        this.currentBalance = currentBalance;
        this.attemptedAmount = attemptedAmount;
    }

    // Optional: Additional constructors
    public InsufficientFundsException(String message) {
        super(message);
        this.currentBalance = 0.0;
        this.attemptedAmount = 0.0;
    }

    // Getters for more information
    public double getCurrentBalance() {
        return currentBalance;
    }

    public double getAttemptedAmount() {
        return attemptedAmount;
    }
}
