public class BankAccountDemo {
    public static void main(String[] args) {

        BankAccount ba = new BankAccount("rick", 1000.00);

        try {
            ba.deposit(100);
            ba.withdraw(1200);
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        } catch(IllegalArgumentException e) {
            System.out.println("Invalid input: " + e.getMessage());
        } finally{
            System.out.println(ba);
        }
    }
}
