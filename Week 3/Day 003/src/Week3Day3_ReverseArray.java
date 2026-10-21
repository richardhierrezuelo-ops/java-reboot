import java.util.Arrays;

public class Week3Day3_ReverseArray {
    public static void main(String[] args) {
       reverseArray(new int[]{10, 20, 30, 40, 50});
       reverseArray(new int[]{1, 2, 3, 4});
       reverseArray(new int[]{7});
       reverseArray(new int[]{});
    }

    public static void reverseArray(int[] numbers) {
        int left = 0;
        int right = numbers.length - 1;  // 4

        while (left < right) {
            int temp = numbers[left];    // 1
            numbers[left] = numbers[right];
            numbers[right] = temp;
            left++;
            right--;
        }

        System.out.println(Arrays.toString(numbers));
    }

}
