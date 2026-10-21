import java.util.Arrays;

public class ConvertNumberReversedArrayDigits {

//    Description:
//Given a random non-negative number, you have to return the digits of this number within an array in reverse order.
//
//Example (Input => Output):
//35231 => [1,3,2,5,3]
//0     => [0]

    public static void main(String[] args) {
        System.out.println(Arrays.toString(digitize(35231)));
        System.out.println(Arrays.toString(digitize(0)));
    }

    public static int[] digitize(long n) {
        String numStr = Long.toString(n);
        int[] result = new int[numStr.length()];

        for (int i=0; i< numStr.length(); i++) {
            result[i] = numStr.charAt(numStr.length() - i - 1) - '0' ;
        }
        return result;
    }
}
