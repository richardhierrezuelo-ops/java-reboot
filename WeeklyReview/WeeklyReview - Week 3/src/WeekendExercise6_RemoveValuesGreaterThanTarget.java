import java.util.Arrays;

public class WeekendExercise6_RemoveValuesGreaterThanTarget {
    public static void main(String[] args) {
        System.out.println("{5, 10, 15, 20, 25}, 15 -> " + Arrays.toString(getNumbersAtOrBelow(new int[] {5, 10, 15, 20, 25}, 15)));
        System.out.println("{1, 2, 3, 4}, 2  -> " + Arrays.toString(getNumbersAtOrBelow(new int[]{1, 2, 3, 4}, 2 )));
        System.out.println("{-5, 0, 5}, 0 -> " + Arrays.toString(getNumbersAtOrBelow(new int[] {-5, 0, 5}, 0)));
    }

    public static int[] getNumbersAtOrBelow(int[] numbers, int target) {
        int count = 0;

        for (int number : numbers) {
            if (number <= target) {
                count++;
            }
        }

        int resultIndex = 0;
        int[] results = new int[count];

        for (int number : numbers) {
            if (number <= target) {
                results[resultIndex] = number;
                resultIndex++;
            }
        }

        return results;
    }
}
