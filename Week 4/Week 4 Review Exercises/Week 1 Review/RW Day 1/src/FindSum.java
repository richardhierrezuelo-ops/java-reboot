public class FindSum {
    public static void main(String[] args) {
        System.out.println("Sum: " + findSum(new int[]{1,2,3,4,5,6,7,8,9,10}));
        System.out.println("Sum " + findSum(new int[]{20,-4,30,-40,5}));
        System.out.println("Sum: " + findSum(new int[]{-20,-4,-30,-40,-5}));
        System.out.println("Sum: " + findSum(new int[]{10}));
        System.out.println("Sum: " + findSum(new int[]{}));
    }

    public static int findSum(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {   //   for (int num : arr)  enhanced for-loop (cleaner)
            sum += arr[i];
        }

        return sum;
    }

}
