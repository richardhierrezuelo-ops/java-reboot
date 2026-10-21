public class MessageFormatterDemo {
    public static void main(String[] args) {
        MessageFormatter mf = new MessageFormatter();
        System.out.println(mf.formatMessage("Hello"));
        System.out.println(mf.formatMessage("Hello", 3));
        System.out.println(mf.formatMessage(3,"Hello"));

    }
}
