public class Week4Day1_CountEvenNumbers2D {

    // Pattern: nested loops + counter.
    public static void main(String[] args) {
        int[][] numbers = {
                {2, 5, 8},
                {11, 14, 17},
                {20, 23, 26}
        };

        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (numbers[i][j] % 2 == 0) {
                    count++;
                }
            }
        }

        System.out.println("Count: " + count);
    }
}
