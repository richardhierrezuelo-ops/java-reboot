import java.util.Arrays;

public class WeekendExercise5_RemoveAllNegativeNumbers {
    public static void main(String[] args) {
        System.out.println("{-5, 10, -3, 7, 0, 12} -> " + Arrays.toString(getNonNegativeNumbers(new int[] {-5, 10, -3, 7, 0, 12})));
        System.out.println("{-5, -2, -1}  -> " + Arrays.toString(getNonNegativeNumbers(new int[]{-5, -2, -1} )));
        System.out.println("{1, 2, 3} -> " + Arrays.toString(getNonNegativeNumbers(new int[] {1, 2, 3})));
        System.out.println("{}} -> " + Arrays.toString(getNonNegativeNumbers(new int[]{})));
    }

    public static int[] getNonNegativeNumbers(int[] numbers) {
        int count = 0;

        for (int number: numbers) {
            if (number >= 0) {
                count++;
            }
        }

        int resultIndex = 0;
        int[] result = new int[count];

        for (int number : numbers) {
            if (number >= 0) {
                result[resultIndex] = number;
                resultIndex++;
            }
        }
        return result;
    }
}
