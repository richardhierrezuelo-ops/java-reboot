import java.util.Arrays;

public class CountPositivesSumNegatives {

    //Description:
    //Given an array of integers.
    //
    //Return an array, where the first element is the count of positives numbers and the second element is sum of negative numbers. 0 is neither positive nor negative.
    //
    //If the input is an empty array or is null, return an empty array.
    //
    //Example
    //For input [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15], you should return [10, -65].

    public static void main(String[] args) {

        var numbers = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15};
        var emptyNumbers = new int[] {};
        int[] nullArray = null;

        System.out.println(Arrays.toString(getCountPositivesSumNegatives(numbers)));
        System.out.println(Arrays.toString(getCountPositivesSumNegatives(emptyNumbers)));
        System.out.println(Arrays.toString(getCountPositivesSumNegatives(nullArray)));
    }

    public static int[] getCountPositivesSumNegatives(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return new int[0];
        }

        int sum = 0;
        int count = 0;
        int[] result = new int[2];

        for (int i = 0; i < numbers.length; i++) {   // (int num : numbers)  --> Enhanced
            if ( numbers[i] == 0)
                continue;

            if (numbers[i] > 0) {
                count += 1;
            } else {
                sum += numbers[i];
            }
        }

        result[0] = count;
        result[1] = sum;

        return result;
    }
}
