import java.util.Arrays;

public class ConvertNumberReversedArray {

    // Given a random non-negative number, you have to return the digits of this number within an array in reverse order.
    //
    //Example (Input => Output):
    //35231 => [1,3,2,5,3]
    //0     => [0]

    public static void main(String[] args) {
         long n1  = 35231;
         long n2  = 0;

         System.out.println(Arrays.toString(digitize(n1)));
        System.out.println(Arrays.toString(digitize(n2)));
    }

    public static int[] digitize(long n) {
        // Code here
        String numStr = Long.toString(n);
        int[] result = new int[numStr.length()];

        for (int i = 0; i < numStr.length(); i++) {
            result[i] = Character.getNumericValue(numStr.charAt(numStr.length() - i - 1));
        }

        return result;
    }
}
