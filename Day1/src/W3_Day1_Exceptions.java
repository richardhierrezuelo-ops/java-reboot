import java.util.InputMismatchException;
import java.util.Scanner;

public class W3_Day1_Exceptions {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");

        // TODO: Wrap in try-catch to handle bad input
        // If user enters text → catch InputMismatchException
        // Print friendly message
        // Always close scanner in finally

        try {
            int number = scanner.nextInt();
            System.out.println("You entered: " + number);
        } catch (InputMismatchException e) {
            System.out.println("Please enter a valid number");
        }

        scanner.close();
    }

}
