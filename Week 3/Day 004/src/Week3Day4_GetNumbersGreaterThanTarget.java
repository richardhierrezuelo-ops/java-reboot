import java.util.Arrays;

public class Week3Day4_GetNumbersGreaterThanTarget {
    public static void main(String[] args) {
        System.out.println("{5, 10, 15, 20, 25}, 15 -> " + Arrays.toString(getNumbersGreaterThan(new int[]{5, 10, 15, 20, 25}, 15)));

    }

    public static int[] getNumbersGreaterThan(int[] numbers, int target) {
        int count = 0;

        for (int number : numbers) {
            if (number > target) {
                count++;
            }
        }

        int[] result = new int[count];
        int resultIndex = 0;
        for (int number : numbers) {
            if (number > target) {
                result[resultIndex] = number;
                resultIndex++;
            }
        }
        return result;
    }
}
