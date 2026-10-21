public class Week4Day4_SumPositiveEachRow {

//  Pattern: ROW OUTER LOOP + ROW-SPECIFIC RESULT
    public static void main(String[] args) {

        int[][] numbers = {
                {10, -5, 20},
                {-3, 15, -8},
                {25, 30, -10}
        };

        printPositiveSums(numbers);
    }

    public static void printPositiveSums(int[][] numbers) {
        for (int row = 0; row < numbers.length; row++) {
            int sum = 0;
            for (int col = 0; col < numbers[row].length; col++) {
                if (numbers[row][col] > 0) {
                    sum += numbers[row][col];
                }
            }

            System.out.println("Row: " + row + " positive sum: " + sum);
        }
    }
}
