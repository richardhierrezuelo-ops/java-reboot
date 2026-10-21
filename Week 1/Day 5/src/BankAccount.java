public class BankAccount {

    private String accountNumber;
    private double balance;

    private static int totalAccounts = 0;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = Math.max(balance, 0);   // Prevent negative initial balance
        totalAccounts++;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            this.balance -= amount;
        }  else {
            System.out.println("Insufficient funds or invalid amount!");
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public static int getTotalAccounts() {
        return totalAccounts;
    }

}
