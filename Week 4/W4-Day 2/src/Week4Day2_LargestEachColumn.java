public class Week4Day2_LargestEachColumn {

    //    Nested loops + column-specific best-so-far value
    public static void main(String[] args) {
        int[][] numbers = {
                {2, 8, 4},
                {7, 1, 9},
                {6, 5, 3}
        };

        for (int col = 0; col < numbers.length; col++) {
            int largest = numbers[0][col];

            for (int row = 1; row < numbers[col].length; row++) {
                if (numbers[row][col] > largest) {
                    largest = numbers[row][col];
                }
            }
            System.out.println("Column: " + col + " largest: " + largest);
        }
    }


}
