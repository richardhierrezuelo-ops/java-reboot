public class Week4Day2_SumEachColumn {

    //Nested loops + column-specific accumulator/
    public static void main(String[] args) {
        int[][] numbers = {
                {10, 20, 30},
                {40, 50, 60},
                {70, 80, 90}
        };

        for (int col = 0; col < numbers.length; col++) {
            int sum = 0;
            for (int row = 0; row < numbers[col].length; row++) {
                sum += numbers[row][col];
            }

            System.out.println("Column: " + col + " Sum: " + sum);
        }
    }
}
