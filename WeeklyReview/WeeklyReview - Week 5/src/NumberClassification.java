public class NumberClassification {

    public static void main(String[] args) {
        analyzeNumbers(-2, 2);
        analyzeNumbers(0, 0);
        analyzeNumbers(1, 5);
    }

    public static void analyzeNumbers(int start, int end) {
        int countEven = 0;
        int countOdd = 0;
        int countPostitve = 0;
        int countNegative = 0;
        int countZero = 0;
        int totalCount = 0;

        for (int i = start; i <= end; i++) {

            if (i == 0) {
                countZero++;
            }
            if (i % 2 == 0) {
                countEven++;
            }

            if (i % 2 != 0) {
                countOdd++;
            }

            if (i > 0) {
                countPostitve++;
            }

            if (i < 0){
                countNegative++;
            }

            totalCount++;
        }

        System.out.println("Positive: " + countPostitve);
        System.out.println("Negative: " + countNegative);
        System.out.println("Zero: " + countZero);
        System.out.println("Even: " + countEven);
        System.out.println("Odd: " + countOdd);
        System.out.println("Total: " + totalCount);
    }
}
