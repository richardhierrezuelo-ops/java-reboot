public class JavaRebootLoops {
    public static void main(String[] args) {

        printNumbers(5);
        System.out.println("-----------------");
        System.out.println("sumNumbers(5) → " + sumNumbers(5));
        System.out.println("sumNumbers(10) → " + sumNumbers(10));
        System.out.println("-----------------");
        System.out.println("countEvenNumbers(5) → " + countEvenNumbers(5));
        System.out.println("countEvenNumbers(10) → " + countEvenNumbers(10));
        System.out.println("-----------------");
        System.out.println("firstNumberDivisibleBySeven(10) -> " + firstNumberDivisibleBySeven(10));
        System.out.println("firstNumberDivisibleBySeven(20) -> " + firstNumberDivisibleBySeven(20));
        System.out.println("-----------------");
        fizzBuzz(15);
    }

    public static void printNumbers(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }

    public static int sumNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static int countEvenNumbers(int n) {
        int count = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                count++;
            }
        }

        return count;
    }

    public static int firstNumberDivisibleBySeven(int n) {

        while (n > 0) {
             if (n % 7 == 0) {
                 break;
             }
             n++;
         }
        return n;
    }

    public static void fizzBuzz(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
