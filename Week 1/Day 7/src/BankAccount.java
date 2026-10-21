public class BankAccount {

    private String name;
    private double balance;

    public BankAccount(String name, double balance) {
        this.name = name;
        this.balance = Math.max(balance, 0);
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Amount cannot be negative");
        }
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient Funds");
        }
        this.balance -= amount;
    }

    @Override
    public String toString() {
        return "BankAccount{" + "name=" + name + ", balance=" + balance + '}';
    }

}
