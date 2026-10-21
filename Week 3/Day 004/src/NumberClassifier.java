public class NumberClassifier {
    public static void main(String[] args) {

        System.out.println("2 is " + classifyNumber(2));
        System.out.println("-1 is " + classifyNumber(-1));
        System.out.println("0 is " + classifyNumber(0));
    }

    public static String classifyNumber(int num) {
        if (num > 0) {
            return "Positive";
        } else if (num < 0) {
            return "Negative";
        } else {
            return "Zero";
        }
    }
}
