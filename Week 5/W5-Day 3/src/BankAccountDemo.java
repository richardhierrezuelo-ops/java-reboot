public class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount savings = new SavingsAccount("S100", 1000);
        BankAccount checking = new CheckingAccount("C200", 500);

        savings.deposit(200);
        checking.deposit(100);

        System.out.println("Savings: Final Balance: $" + savings.getBalance() + " Interest: " + savings.calculateInterest());
        System.out.println("Checking: Final Balance: $" + checking.getBalance() + " Interest: " + checking.calculateInterest());

    }
}
