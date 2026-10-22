package fundamentals.conditionals;

public class NumberType {
    public static void main(String[] args) {
        System.out.println("The number 10 is: " + getNumberType(10));
        System.out.println("The number -5 is: " + getNumberType(-5));
        System.out.println("The number 0 is: " + getNumberType(0));
    }

    public static String getNumberType(int number) {
        if (number > 0) {
            return "Positive";
        } else if (number < 0) {
            return "Negative";
        } else {
            return "Zero";
        }
    }
}
