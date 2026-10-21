public class SmsSender implements SenderService {
    @Override
    public void send(String phone, String message) {
        System.out.println("SMS to " + phone + ": " + message);
    }
}

