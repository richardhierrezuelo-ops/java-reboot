public class BankAccount {

    private final long accountNumber;      // final = better for immutable ID
    private long balance;

    protected String ownerName;

    public  BankAccount(long accountNumber, long balance, String ownerName) {
        this.accountNumber = accountNumber;
        this.balance = Math.max(balance, 0);   // Prevent negative initial balance
        this.ownerName = ownerName;
    }

    public void deposit(long amount) {
        this.balance += amount;
    }

    public void withdraw(long amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount must be positive");
        }

        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient funds.");
        }
        this.balance -= amount;
    }

    public long getBalance() {
        return balance;
    }

    // Package-private (default) method
    boolean validateAccount() {
        if (balance < 0) {
            throw new IllegalArgumentException("Insufficient funds.");
        }
        return true;
    }
}
