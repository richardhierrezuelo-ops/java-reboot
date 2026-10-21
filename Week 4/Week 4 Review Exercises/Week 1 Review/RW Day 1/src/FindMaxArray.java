public class FindMaxArray {
    public static void main(String[] args) {

        System.out.println("Max Number: " + findMax(new int[]{1,2,3,4,5,6,7,8,9,10}));
        System.out.println("Max Number: " + findMax(new int[]{20,-4,30,-40,5}));
        System.out.println("Max Number: " + findMax(new int[]{-20,-4,-30,-40,-5}));
    }

    public static int findMax(int[] arr) {
        if (arr == null || arr.length == 0) {
            return Integer.MIN_VALUE;
        }
        int max = arr[0];

        for (int i= 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }


}
