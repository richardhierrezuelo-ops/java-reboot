public class FindMinArray {
    public static void main(String[] args) {
        System.out.println("Min Number: " + findMin(new int[]{1,2,3,4,5,6,7,8,9,10}));
        System.out.println("Min Number: " + findMin(new int[]{20,-4,30,-40,5}));
        System.out.println("Min Number: " + findMin(new int[]{-20,-4,-30,-40,-5}));
        System.out.println("Min Number: " + findMin(new int[]{10}));
    }

    public static int findMin(int[] arr) {
        if (arr == null || arr.length == 0)
            return Integer.MAX_VALUE;

        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        return min;
    }
}
