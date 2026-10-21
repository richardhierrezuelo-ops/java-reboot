import java.util.Arrays;

public class Week3Day4_GetEvenNumbers {
    public static void main(String[] args) {
       System.out.println("{1, 2, 3, 4, 5, 6} -> " + Arrays.toString(getEvenNumbers(new int[]{1, 2, 3, 4, 5, 6})));
       System.out.println("{7, 9, 11} -> " + Arrays.toString(getEvenNumbers(new int[]{7, 9, 11})));
       System.out.println("{2, 4, 6} -> " + Arrays.toString(getEvenNumbers(new int[]{2, 4, 6})));
       System.out.println("{} -> " + Arrays.toString(getEvenNumbers(new int[]{})));

    }

    public static int[] getEvenNumbers(int[] numbers) {
        if (numbers == null) {
            throw new ArrayIndexOutOfBoundsException("Array is null");
        }

        int count = 0;

        for (int number :numbers) {
            if (number % 2 == 0) {
                count++;
            }
        }

        int[] result = new int[count];
        int resultIndex = 0;

        for (int number : numbers) {
            if (number % 2 == 0) {
                result[resultIndex] = number;
                resultIndex++;
            }
        }

        return result;
    }
}
