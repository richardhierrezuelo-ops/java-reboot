import java.util.Arrays;

public class WeekendReview_TriplePositiveValues {
    public static void main(String[] args) {
        int[][] numbers = {
                {-2, 4, 0},
                {5, -3, 7},
                {0, -8, 6}
        };

        System.out.println(Arrays.deepToString(triplePositiveValues(numbers)));
    }

//    Allocate → Transform + Conditional Logic
    public static int[][] triplePositiveValues(int[][] numbers) {
        int[][] results = new int [numbers.length][numbers[0].length];

        for (int row = 0; row < numbers.length; row++) {
            for (int col = 0; col < numbers[row].length; col++) {
                if (numbers[row][col] > 0) {
                    results[row][col] = numbers[row][col] * 3;
                } else {
                    results[row][col] = numbers[row][col];
                }
            }
        }

        return results;
    }
}
