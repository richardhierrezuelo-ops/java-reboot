import java.util.Arrays;

public class Week4Day4_Double2DArray {

    // Pattern:  ALLOCATE → TRANSFORM
    public static void main(String[] args) {
        int[][] numbers = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println(Arrays.deepToString(doubleArray(numbers)));
    }

    public static int[][] doubleArray(int[][] numbers) {
        int[][] result = new int[numbers.length][numbers[0].length];

        for (int row = 0; row < numbers.length; row++) {
            for (int col = 0; col < numbers[row].length; col++) {
                result[row][col] = numbers[row][col] * 2;
            }
        }
        return result;
    }
}
