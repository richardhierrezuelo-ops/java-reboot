import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        System.out.println("ReversedArray: " + Arrays.toString(reverseArray(new int[]{1,2,3,4,5,6,7,8,9,10})));
        System.out.println("ReversedArray: " + Arrays.toString(reverseArray(new int[]{20,-4,30,-40,5})));
        System.out.println("ReversedArray: " + Arrays.toString(reverseArray(new int[]{-20,-4,-30,-40,-5})));
        System.out.println("ReversedArray: " + Arrays.toString(reverseArray(new int[]{10})));
        System.out.println("ReversedArray: " + Arrays.toString(reverseArray(new int[]{})));
    }

    public static int[] reverseArray(int[] arr) {
        if (arr == null){
            return null;
        }

        if (arr.length == 0) {
            return new int[0];
        }

        int[] reversedArray = new int[arr.length];
        int index = 0;

        for (int i = arr.length-1; i >= 0; i--) {
            reversedArray[index] = arr[i];
            index++;
        }
        return reversedArray;
    }
}
