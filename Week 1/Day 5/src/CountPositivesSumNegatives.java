import java.util.Arrays;

public class CountPositivesSumNegatives {

//    Description:
//Given an array of integers.
//
//Return an array, where the first element is the count of positives numbers and the second element is sum of negative numbers.
// 0 is neither positive nor negative.
//
//If the input is an empty array or is null, return an empty array.
//
//Example
//For input [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15], you should return [10, -65].

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15};
        System.out.println(Arrays.toString(countPositivesSumNegatives(numbers)));

    }

    public static int[] countPositivesSumNegatives(int[] numbers) {
        int[] result = new int[2];

        if  (numbers == null || numbers.length == 0) {
            return new int[0];
        }

        int count = 0;
        int sum = 0;

        for (int num: numbers) {
            if (num > 0) {
                count++;
            } else if  (num < 0) {
                sum += num;
            }
        }

        result[0] = count;
        result[1] = sum;

        return result;
    }
}
