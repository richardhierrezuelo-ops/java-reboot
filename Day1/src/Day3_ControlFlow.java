public class Day3_ControlFlow {
    public static void main(String[] args) {
        // 1. Grade checker
        int score = 88;
        System.out.println("Score " + score + " → " + getGrade(score));

        // 2. Countdown with for loop
        System.out.print("Countdown: ");
        for (int i = 5; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println("Liftoff!");

        // 3. Login simulation with while
        int attempts = 3;
        boolean loggedIn = false;
        while (attempts > 0 && !loggedIn) {
            System.out.println("Attempts left: " + attempts);
            attempts--;
            if (attempts == 1) loggedIn = true; // success on 2nd try
        }
        System.out.println(loggedIn ? "Login success!" : "Locked out.");

        // 4. Leap-year check
        System.out.println("2024 is leap year: " + isLeapYear(2024));
        System.out.println("2023 is leap year: " + isLeapYear(2023));
    }

    // ---- TYPE THESE YOURSELF (no copy-paste) ----
    public static String getGrade(int score) {
        // if / else-if chain → return "A", "B", "C", "D", or "F"
        if (score >= 0 && score <= 100) {
            if (score >= 90)
                return "A";
            else if (score >= 80 && score < 90)
                return "B";
            else if (score >= 70 && score < 80)
                return "C";
            else if (score >= 60 && score < 70)
                return "D";
            else if (score < 60)
                return "F";

        }
        return "Invalid grade!";
    }

    public static boolean isLeapYear(int year) {
        // return true if year is divisible by 4 but not 100, OR divisible by 400
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
    // --------------------------------------------
}