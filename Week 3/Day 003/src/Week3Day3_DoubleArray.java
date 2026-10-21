import java.util.Arrays;

public class Week3Day3_DoubleArray {
    public static void main(String[] args) {
        System.out.println("{1, 2, 3, 4, 5} → " + Arrays.toString(doubleArray(new int[]{1, 2, 3, 4, 5})));
        System.out.println("{-2, 0, 5} → " + Arrays.toString(doubleArray(new int[]{-2, 0, 5})));
        System.out.println("{7} → " + Arrays.toString(doubleArray(new int[]{7})));
    }

    public static int[] doubleArray(int[] numbers) {
        int[] doubleArray = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            doubleArray[i] = numbers[i] * 2;
        }

        return doubleArray;
    }
}
