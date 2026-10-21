import java.util.Arrays;

public class Week4Day4_DoubleEvenNumbers2D {

//    Pattern: ALLOCATE → TRANSFORM + conditional logic
    public static void main(String[] args) {

        int[][] numbers = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println(Arrays.deepToString(doubleEvenNumbers(numbers)));
    }

    public static int[][] doubleEvenNumbers(int[][] numbers) {
        int[][] result = new int[numbers.length][numbers[0].length];

        for (int row = 0; row < numbers.length; row++) {
            for (int col = 0; col < numbers[row].length; col++) {
                if (numbers[row][col] % 2 == 0) {
                    result[row][col] = numbers[row][col] * 2;
                } else {
                    result[row][col] = numbers[row][col];
                }
            }
        }

        return result;
    }
}
