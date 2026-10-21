import java.util.Arrays;

public class WeekendReview_FilterGreaterThanTarget {
    public static void main(String[] args) {
        System.out.println("{-5, 2, 8, -1, 10, 3}, target 2 - > " + Arrays.toString(getNumbersGreaterThanTarget(new int[] {-5, 2, 8, -1, 10, 3}, 2)));
        System.out.println("{1, 2, 3, 4}, target 2 - > " + Arrays.toString(getNumbersGreaterThanTarget(new int[] {1, 2, 3, 4}, 2)));
        System.out.println("{-10, -5, -1}, target -6 - > " + Arrays.toString(getNumbersGreaterThanTarget(new int[] {-10, -5, -1}, -6)));
        System.out.println("{5, 5, 5}, target 5 - > " + Arrays.toString(getNumbersGreaterThanTarget(new int[] {5, 5, 5}, 5)));
    }

//   Pattern: Count → Allocate → Fill
    public static int[] getNumbersGreaterThanTarget(int[] numbers, int target) {
        int count = 0;

        for (int number : numbers) {
            if (number > target ) {
                count++;
            }
        }

        int[] results = new int[count];
        int resultIndex = 0;

        for (int number : numbers) {
            if (number > target ) {
                results[resultIndex] = number;
                resultIndex++;
            }
        }

        return results;
    }
}
