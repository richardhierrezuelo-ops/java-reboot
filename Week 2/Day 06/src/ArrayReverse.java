import java.util.Arrays;

public class ArrayReverse {

    public static void main(String[] args) {
          System.out.println(Arrays.toString(reverseArray(new int[]{})));
          System.out.println(Arrays.toString(reverseArray(new int[]{22, 23, 24, 25})));
          System.out.println(Arrays.toString(reverseArray(new int[]{11, 23, 15})));
    }

    public static int[] reverseArray(int[] arr) {
        if (arr == null || arr.length  == 0) {
            return new int[] {};
        }

        int[] result = new int[arr.length];
        int index = 0;

        for (int i = arr.length - 1; i >=0; i--) {
            result[index] = arr[i];
            index++;
        }

        return result;
    }
}
