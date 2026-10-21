public class PaymentDemo {

    public static void main(String[] args) {
        Payment payment  = new CreditCardPayment();
        payment.processPayment(150);

        payment = new BankTransferPayment();
        payment.processPayment(250);

        Payment payment2 = new Payment();
        payment2.processPayment(50);

    }


}
