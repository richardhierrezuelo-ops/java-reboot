import java.util.Arrays;

public class WeekendReview_ReverseSecondHalf {
    public static void main(String[] args) {
        reverseSecondHalf(new int[] {1, 2, 3, 4, 5, 6});
        reverseSecondHalf(new int[] {1, 2, 3, 4, 5});
        reverseSecondHalf(new int[] {1, 2});
        reverseSecondHalf(new int[] {1});
        reverseSecondHalf(new int[] {});

    }

    public static void reverseSecondHalf(int[] numbers) {

        int left = numbers.length / 2;
        int right = numbers.length - 1;

        if (numbers.length % 2 != 0) {
            left = left + 1;
        }

        while (left < right) {
            int temp = numbers[left];
            numbers[left] = numbers[right];
            numbers[right] = temp;
            left++;
            right--;
        }

        System.out.println(Arrays.toString(numbers));
    }
}
