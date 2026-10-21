import java.util.ArrayList;
import java.util.List;

public class BankDemo {
    public static void main(String[] args) {

        List<Account> accounts = new ArrayList<>();

        SavingsAccount savings = new SavingsAccount(1001, 1000, 0.05);
        CheckingAccount checking = new CheckingAccount(1002, 500, 100);

        accounts.add(savings);
        accounts.add(checking);

        for (Account acc : accounts) {
            System.out.println(acc);
            acc.deposit(500);
            try {
                acc.withdraw(1200);
                System.out.println("Withdrawal successful. New balance: " + acc.getBalance());
            } catch (InsufficientFundsException e) {
                System.out.println(e.getMessage());
            }
            System.out.println("---");
        }
    }

}
