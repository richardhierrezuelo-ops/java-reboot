package fundamentals.methods;

public class OppositeNumber {
    public static void main(String[] args) {
        System.out.println("1: " + oppositeNumber(1));
        System.out.println("14: " + oppositeNumber(14));
        System.out.println("-34: " + oppositeNumber(-34));
        System.out.println("0: " + oppositeNumber(0));

        int x = -10;
        int y = -x;

        System.out.println("x: " + x);
        System.out.println("y: " + y);
    }

    public static int oppositeNumber(int number) {
        return -number;
    }
}
