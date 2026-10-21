import java.util.Scanner;

public class W3_Day2_CustomExceptions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");

        try {
            int age = Integer.parseInt(scanner.nextLine());

            // TODO: Call validateAge(age) here
            //     It should throw InvalidAgeException if age < 0 or > 150
            validateAge(age);
            System.out.println("Valid age: " + age);

        } catch (NumberFormatException e) {
            System.out.println("Please enter a valid number!");
        } catch (InvalidAgeException e) {
            // TODO: Print the exception message
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }

    // TODO: Create your own custom exception class
    //       It should extend Exception (checked) or RuntimeException (unchecked)
    //       Decide which one and why!

    // TODO: Create this method
    //       Throw your custom exception if age is invalid
    public static void validateAge(int age) throws InvalidAgeException {
        // Implement validation logic
        if (age < 0)  {
            throw new InvalidAgeException("Invalid age: Age cannot be negative!");
        }
        if (age > 150) {
            throw new InvalidAgeException("Invalid age: Age cannot exceed 150!");
        }
    }

}
