public abstract class Account {

    private final long accountNumber;
    protected  double balance;

    protected Account(long accountNumber, double initialBalance) {
        if (accountNumber <= 0) throw new IllegalArgumentException("Invalid account number");
        if (initialBalance < 0) throw new IllegalArgumentException("Initial balance cannot be negative");
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be positive");
        }
        balance += amount;               // common logic
        onDeposit(amount);               // hook for subclass-specific behavior
    }

    protected abstract void onDeposit(double amount); // optional hook

    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdraw amount must be positive");
        }
        if (!canWithdraw(amount)) {
            throw new InsufficientFundsException(balance, amount); // custom exception
        }
        balance -= amount;
    }

    protected abstract boolean canWithdraw(double amount);
}
