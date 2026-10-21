public class EvenOrOdd {
    public static void main(String[] args) {
        System.out.println("2:" +evenOrOdd(2));
        System.out.println("13:" +evenOrOdd(13));
        System.out.println("-4:" +evenOrOdd(-4));
        System.out.println("0:" +evenOrOdd(0));
    }

    public static String evenOrOdd(int number) {
        if (number % 2 == 0) {
            return ("Even");
        } else {
            return ("Odd");
        }

        // return (number % 2 == 0) ? "Even" : "Odd";
    }
}
