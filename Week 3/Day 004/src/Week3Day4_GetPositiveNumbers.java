import java.util.Arrays;

public class Week3Day4_GetPositiveNumbers {

    public static void main(String[] args) {
        System.out.println("{-5, 10, -3, 7, 0, 12} -> " + Arrays.toString(getPositiveNumbers(new int[]{-5, 10, -3, 7, 0, 12})));

    }

    public static int[] getPositiveNumbers(int[] numbers) {

        int count = 0;
        for (int number : numbers) {
            if (number > 0) {
                count++;
            }
        }

        int resultIndex = 0;
        int[] result = new int[count];
        for (int number : numbers) {
            if (number > 0) {
                result[resultIndex] = number;
                resultIndex++;
            }

        }

        return result;
    }
}
