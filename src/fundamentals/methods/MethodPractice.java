package fundamentals.methods;

public class MethodPractice {
    public static void main(String[] args) {
        System.out.println("26 -> " + isEven(26));
        System.out.println("0 -> " + isEven(0));
        System.out.println("-15 -> " + isEven(-15));
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
