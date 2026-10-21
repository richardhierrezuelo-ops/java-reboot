public class Week4Day1_Sum2DArray {

//    Pattern: nested loops + accumulator.
    public static void main(String[] args) {
        int[][] numbers = {
                {1, 2, 3},
                {4, 5, 6}
        };

        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                sum += numbers[i][j];
            }
        }

        System.out.println("Total: " + sum);
    }
}
