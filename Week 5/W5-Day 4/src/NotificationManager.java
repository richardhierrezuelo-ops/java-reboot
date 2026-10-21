public class NotificationManager {

// Composition
// Your manager contains a reference to a NotificationService.
// This is composition in the broad has-a/uses-a sense: the manager delegates notification behavior
// to another object rather than inheriting that behavior.
//
// Because the manager receives its dependency through the constructor, and your design doesn't require changing that reference afterward.
// Using final prevents reassignment after construction, making the intended dependency relationship clearer.
// It doesn't make the referenced service object itself immutable.

//  Holds a NotificationService reference and delegates work to it
    private final NotificationService notificationService;

//    1. Constructor injection
//    That means NotificationManager depends on the interface contract, not a particular notification provider.
//    Receives NotificationService through its constructor
    public NotificationManager(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void notifyUser(String recipient, String message) {
        notificationService.send(recipient, message);
    }

}
