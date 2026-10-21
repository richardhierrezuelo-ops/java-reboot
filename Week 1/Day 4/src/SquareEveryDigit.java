public class SquareEveryDigit {

    //Welcome. In this kata, you are asked to square every digit of a number and concatenate them.
    //
    //For example, if we run 9119 through the function, 811181 will come out, because 92 is 81 and 12 is 1. (81-1-1-81)
    //
    //Example #2: An input of 765 will/should return 493625 because 72 is 49, 62 is 36, and 52 is 25. (49-36-25)
    //
    //Note: The function accepts an integer and returns an integer.

    public static void main(String[] args) {

        int n1 = 9119;
        int n2 = 765 ;
        int n3 = 0 ;

        System.out.println(squareDigits(n1));
        System.out.println(squareDigits(n2));
        System.out.println(squareDigits(n3));
    }

    public static int squareDigits(int n) {
        if (n == 0) {
            return 0;
        }

        // Convert the number to a String representation
        String numStr = Integer.toString(n);   // String.valueOf(n);

        StringBuilder sb = new StringBuilder();

        // Iterate through each character index
        for (int i = 0; i < numStr.length(); i++) {
            // Get the numeric value of the character at index i
            int digit = Character.getNumericValue(numStr.charAt(i));   //   int digit = ch - '0';  // Fast way to convert char to int

            int result = digit * digit;
            sb.append(result);
        }

        return Integer.parseInt(sb.toString());
    }

}
