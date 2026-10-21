public class BankAccountTest {

    public static void main(String[] args) {
        BankAccount ba = new BankAccount(12345, 1000, "rick");
        ba.deposit(100);
        ba.deposit(200);
        ba.deposit(300);
        ba.withdraw(500);

        System.out.println(ba.getBalance());
        System.out.println(ba.validateAccount());

    }
}
