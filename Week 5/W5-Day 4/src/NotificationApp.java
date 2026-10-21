//NotificationApp sets up the polymorphic objects, but runtime method dispatch actually occurs
// when notificationService.send(...) executes inside NotificationManager.

public class NotificationApp {
    public static void main(String[] args) {

//        2. Polymorphism
//        Assigns different implementations to the interface reference;
//        the appropriate send() executes at runtime
        NotificationService notification = new EmailNotificationService();

        NotificationManager manager = new NotificationManager(notification);
        manager.notifyUser("Richard", "Hello");

//2. Polymorphism
//        Both concrete classes fulfill the same contract,
//        so the consuming code can interact with either implementation.
        notification = new SmsNotificationService();
        manager = new NotificationManager(notification);
        manager.notifyUser("123-456", "9874563210");


    }
}
