import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4, 5};
        System.out.println("Original: " + Arrays.toString(original));
        System.out.println("Reversed: " + Arrays.toString(reverseArray(original)));
    }

    public static int[] reverseArray(int[] arr) {
        int result[] = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[arr.length - i - 1];
        }
        return result;
    }

}
