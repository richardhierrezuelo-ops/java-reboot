public class FindMax {
    public static void main(String[] args) {
        System.out.println(findMax(new int[]{1,2,9,2,1,4}));
        System.out.println(findMax(new int[]{}));
    }

    public static int findMax(int[] arr) {
        if (arr == null || arr.length == 0) {
            return Integer.MIN_VALUE;
        }

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }
}
