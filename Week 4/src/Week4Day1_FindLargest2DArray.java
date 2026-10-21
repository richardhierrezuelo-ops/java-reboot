public class Week4Day1_FindLargest2DArray {

    //Pattern: nested loops + best-so-far.
    public static void main(String[] args) {
        int[][] numbers = {
                {10, 25, 3},
                {8, 42, 17},
                {31, 6, 19}
        };

        int largest = numbers[0][0];

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (numbers[i][j] > largest) {
                    largest = numbers[i][j];
                }
            }
        }

        System.out.println("Largest: " + largest);
    }


}
