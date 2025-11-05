public class Day3_EvenOrOdd {

    public static String evenOrOdd(int number) {
        if (number % 2 == 0)
            return "Even";
        else if (number % 1 == 0)
            return "Odd";
        return "No Match"; // Place code here;
    }

    public static void main(String[] args) {
        System.out.println(evenOrOdd(1));
        System.out.println(evenOrOdd(2));
        System.out.println(evenOrOdd(-1));
        System.out.println(evenOrOdd(-2));
        System.out.println(evenOrOdd(0));
    }
}
