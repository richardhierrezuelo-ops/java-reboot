public class EmailNotificationService implements NotificationService {

    @Override
    public void send(String recipient, String message) {
        System.out.println("EMAIL to " + recipient + ": " +  message);
    }
}
