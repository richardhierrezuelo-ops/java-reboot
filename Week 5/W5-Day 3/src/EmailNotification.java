public class EmailNotification implements NotificationSender{
    @Override
    public void send(String recipient, String message) {
        System.out.println("Email to: " + recipient + " Message: " + message);
    }
}
