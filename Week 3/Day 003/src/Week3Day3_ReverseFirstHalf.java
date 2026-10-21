import java.util.Arrays;

public class Week3Day3_ReverseFirstHalf {

    public static void main(String[] args) {
        reverseFirstHalf(new int[]{10, 20, 30, 40, 50, 60});
    }

    public static void reverseFirstHalf(int[] numbers) {
        int left = 0;
        int right = (numbers.length / 2) - 1;

        while (left < right) { //0 < 2
            int temp = numbers[left];    // tmp = 10
            numbers[left] = numbers[right];// numleft = 30
            numbers[right] = temp; // numright  = 10
            left++; //1
            right--;  //1
        }

        System.out.println(Arrays.toString(numbers));
    }

}
