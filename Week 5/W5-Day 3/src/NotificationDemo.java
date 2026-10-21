public class NotificationDemo {
    public static void main(String[] args) {
        NotificationSender notificationSender = new EmailNotification();
        notificationSender.send("alex@example.com", "Welcome!");

        notificationSender = new SmsNotification();
        notificationSender.send("555-1234", "Your code is 123456");
    }
}
