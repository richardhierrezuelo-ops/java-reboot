public class NumberClassifier {

    public static void main(String[] args) {
        System.out.println("10 -> " +  classifyNumber(10));
        System.out.println("0 -> " +  classifyNumber(0));
        System.out.println("-20 -> " +  classifyNumber(-20));
    }

    public static String classifyNumber(int number) {
        if (number > 0)
            return "Positive";
        else if (number < 0)
            return "Negative";
        else
            return "Zero";
    }
}
