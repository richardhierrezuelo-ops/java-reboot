import java.util.Arrays;

public class WeekendExercise7_TransformArray {
    public static void main(String[] args) {
        System.out.println("{1, 2, 3, 4} -> " + Arrays.toString(squareArray(new int[] {1, 2, 3, 4})));
        System.out.println("{-2, 3, -4}  -> " + Arrays.toString(squareArray(new int[]{-2, 3, -4} )));
        System.out.println("{0, 5} -> " + Arrays.toString(squareArray(new int[] {0, 5})));
    }

    public static int[] squareArray(int[] numbers) {
        int[] results = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            results[i] = numbers[i] * numbers[i];
        }
        return results;
    }
}
