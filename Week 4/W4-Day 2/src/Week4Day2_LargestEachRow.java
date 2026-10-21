public class Week4Day2_LargestEachRow {

//    Nested loops + row-specific best-so-far value
    public static void main(String[] args) {
        int[][] numbers = {
                {10, 25, 3},
                {8, 42, 17},
                {31, 6, 19}
        };

        for (int row = 0; row < numbers.length; row++) {
            int largest = numbers[row][0];

            for (int col = 1; col < numbers[row].length; col++) {
                if ( numbers[row][col] > largest) {
                    largest = numbers[row][col];
                }
            }

            System.out.println("Row: " + row + " largest: " + largest);
        }
    }

}
