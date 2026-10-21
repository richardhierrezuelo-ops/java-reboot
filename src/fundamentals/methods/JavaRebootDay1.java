package fundamentals.methods;

public class JavaRebootDay1 {
    public static void main(String[] args) {
        String name = "Richard";
        int age = 42;
        double height = 5.7;
        boolean isEmployed = false;

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("isEmployed: " + isEmployed);

        System.out.println("--------------");
        System.out.println("Age In 5 Years: " + calculateAgeInFiveYears(age));
        System.out.println("Age In 0, After 5 Years: " + calculateAgeInFiveYears(0));
        System.out.println("Age In 42, After 5 Years: " + calculateAgeInFiveYears(42));
        System.out.println("Age In -1, After 5 Years: " + calculateAgeInFiveYears(-1));
        System.out.println("--------------");
        System.out.println("Is 10 an Even Number: " + isEven(10));
        System.out.println("Is 7 an Even Number: " + isEven(7));
        System.out.println("Is 0 an Even Number: " + isEven(0));
    }

    public static int calculateAgeInFiveYears(int age) {
        if (age < 0) {
            return 0;
        }

        return age + 5;
    }

    public static boolean isEven(int number) {
        return  number % 2 == 0;
    }
}
