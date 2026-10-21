public class BankAccountApp {

    public static void main(String[] args) {
        BankAccount ba = new BankAccount("123456", 500);
        BankAccount ba2 = new BankAccount("123457", 1000);
        ba.deposit(1000);
        ba.withdraw(200);
        System.out.println("Balance: " + ba.getBalance());
        System.out.println("Total Accounts: " + BankAccount.getTotalAccounts());
    }
}
