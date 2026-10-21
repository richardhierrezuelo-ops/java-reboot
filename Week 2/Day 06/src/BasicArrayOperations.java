public class BasicArrayOperations {

    public static void main(String[] args) {
        System.out.println("Max Number: " + findMax(new int[] {}));
        System.out.println("Max Number: " + findMax(new int[] {1,2,3,4,2,5,2,1,4}));
        System.out.println("Max Number: " + findMax(new int[] {-14,-1,-5,-40,-20}));
        System.out.println("Max Number: " + findMax(new int[] {5,10,-15,-20,25,-30}));
    }

    public static int findMax(int[] arr) {
        if (arr  == null || arr.length == 0) {
            return Integer.MIN_VALUE;
        }

        int max = arr[0];

       //Use enhanced for-loop when index is not needed.
        for (int num: arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

}
