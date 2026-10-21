public class Week4Day4_AverageEachColumn {

   // Pattern: COLUMN OUTER LOOP + COLUMN-SPECIFIC RESULT
    public static void main(String[] args) {

        int[][] numbers = {
                {10, 20, 30},
                {40, 50, 60},
                {70, 80, 90}
        };

        printColumnAverages(numbers);
    }

    public static void printColumnAverages(int[][] numbers) {

        for (int col = 0; col < numbers.length; col++) {
            int sum = 0;
            int count = 0;
            for (int row = 0; row < numbers[col].length; row++) {
                sum += numbers[row][col];
                count++;
            }
            double average = (double) sum / count;
            System.out.println("Column " + col + " average: " + average);
        }
    }
}
