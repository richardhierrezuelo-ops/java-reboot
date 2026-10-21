//Given a random non-negative number, you have to return the digits of this number within an array in reverse order.
//
//Example (Input => Output):
//35231 => [1,3,2,5,3]
//0     => [0]

import java.util.Arrays;

public class ConvertNumberReverseArray {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(reverseArray(35231)));
        System.out.println(Arrays.toString(reverseArray(0)));
    }

    public static int[] reverseArray(int number) {
        String strNumbers = String.valueOf(number);
        int[] result = new int[strNumbers.length()];
        for (int i = 0; i < strNumbers.length(); i++) {
            result[i] = Character.getNumericValue(strNumbers.charAt(strNumbers.length() - i - 1));
        }

        return result;
    }

}
