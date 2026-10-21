public class CheckingAccount extends Account {

    private final double overdraftLimit;

    public CheckingAccount(long accountNumber, double initialBalance, double overdraftLimit) {
        super(accountNumber, initialBalance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    protected void onDeposit(double amount) {

    }

    @Override
    protected boolean canWithdraw(double amount) {
        return balance + overdraftLimit >= amount;
    }

    @Override
    public String toString() {
        return "CheckingAccount[" + getAccountNumber() + ", balance=" + balance + "]";
    }

}
