import java.util.Arrays;

public class WeekendExercise8_ReverseSecondHalf {
    public static void main(String[] args) {
        reverseSecondHalf(new int[] {10, 20, 30, 40, 50, 60});
        System.out.println(" ");
        reverseSecondHalf(new int[] {10, 20, 30, 40, 50});

    }

    public static void reverseSecondHalf(int[] numbers) {
        int left = numbers.length / 2;
        int right = numbers.length - 1;

        if (numbers.length % 2 != 0) {
            left = left + 1;
        }


        System.out.println("Before: " + Arrays.toString(numbers));

        while (left < right) {
            int tmp = numbers[right];
            numbers[right] = numbers[left];
            numbers[left] = tmp;
            left++;
            right--;
        }

        System.out.println("After: " + Arrays.toString(numbers));
    }
}
