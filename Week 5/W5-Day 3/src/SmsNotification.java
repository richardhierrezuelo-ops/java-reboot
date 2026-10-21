public class SmsNotification implements NotificationSender{

    @Override
    public void send(String recipient, String message) {
        System.out.println("SMS to: " + recipient + " Message: " + message);
    }
}
