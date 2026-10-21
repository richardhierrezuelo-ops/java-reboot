public class SavingsAccount extends Account {
    private final double interestRate;

    public SavingsAccount(long accountNumber, double initialBalance, double interestRate) {
        super(accountNumber, initialBalance);
        this.interestRate = interestRate;
    }

    @Override
    protected void onDeposit(double amount) {
        // Optional: you can apply interest only on existing balance periodically
    }

    public void applyInterest() {
        balance += balance * interestRate;
    }

    @Override
    protected boolean canWithdraw(double amount) {
        return balance >= amount;
    }

    @Override
    public String toString() {
        return "SavingsAccount[" + getAccountNumber() + ", balance=" + balance + "]";
    }
}
