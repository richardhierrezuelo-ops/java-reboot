public class Day5_Methods {
    public static void main(String[] args) {
        greet("Richard", 35);
        System.out.println("Score 88 → Grade: " + calculateGrade(88));
        System.out.println("2024 even: " + isEven(2024));
        System.out.println("2^3 = " + power(2, 3));
    }

    // TYPE THESE YOURSELF:
    public static void greet(String name, int age) {
        System.out.println("Hello " + name + ", you are " + age + " years old.");
    }

    public static char calculateGrade(int score) {
        if (score >= 90) {
            return 'A';
        } else if (score >= 80) {
            return 'B';
        } else if (score >= 70) {
            return 'C';
        } else if (score >= 60) {
            return 'D';
        } else return 'F';
    }

    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static int power(int base, int exp) {
        int result = 1;

        for (int i = 0; i < exp; i++) {
            result = result * base;
        }
        return result;
    }
}
