package fundamentals.loops;

public class LoopsDemo {
    public static void main(String[] args) {

        // 1. for loop
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // 2. Enhanced for loop (for-each) - very common in interviews
        int[] numbers = {10, 20, 30, 40, 50};
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        // 3. while loop
        int count = 0;
        while (count < 3) {
            System.out.println("While loop: " + count);
            count++;
        }
    }
}