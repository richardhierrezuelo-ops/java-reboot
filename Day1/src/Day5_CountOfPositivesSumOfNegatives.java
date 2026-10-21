//Given an array of integers.
//
//Return an array, where the first element is the count of positives numbers and the second element is sum of negative numbers.
// 0 is neither positive nor negative.
//
//If the input is an empty array or is null, return an empty array.
//
//Example
//For input [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15], you should return [10, -65].

import java.util.Arrays;

public class Day5_CountOfPositivesSumOfNegatives {

    public static void main(String[] args) {
      System.out.println("count " + Arrays.toString(countPositivesSumNegatives(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15})));
      System.out.println("count " + Arrays.toString(countPositivesSumNegatives(new int[] {0, 2, 3, 0, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14})));
    }

    public static int[] countPositivesSumNegatives(int[] input)
    {
        if (input == null || input.length == 0) return new int[0]; // Return Empty Array

        int positivesSum = 0;
        int negativesSum = 0;

        for (int i = 0; i< input.length; i++) {
            if (input[i] > 0)  {
                positivesSum ++;
            } else if (input[i] < 0)  {
                negativesSum += input[i];
            }
        }

        return new int[]{positivesSum, negativesSum};
    }
}
