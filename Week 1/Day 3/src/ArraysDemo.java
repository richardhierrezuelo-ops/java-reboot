public class ArraysDemo {
    public static void main(String[] args) {

        // Declaration and Initialization
        int[] numbers = new int[5];                    // Fixed size
        int[] primes = {2, 3, 5, 7, 11};               // Inline

        // Modern way with var (Java 10+)
        var scores = new int[]{85, 92, 78, 95};

        // Traversing arrays
        for (int i = 0; i < primes.length; i++) {
            System.out.print(primes[i] + " ");
        }
        System.out.println();

        // Enhanced for-each loop (preferred in most cases)
        for (int score : scores) {
            System.out.print(score + " ");
        }
    }
}
