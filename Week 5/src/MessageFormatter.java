public class MessageFormatter {

    public MessageFormatter() {}

    public String formatMessage(String text){
        return "Message: " + text;
    }

    public String formatMessage(String text, int number){
        return "Message: " + text + " (" + number + ")";
    }

    public String formatMessage(int number, String text){
        return number + ": " + text;
    }
}
