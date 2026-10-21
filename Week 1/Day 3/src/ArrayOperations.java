import java.util.Arrays;

public class ArrayOperations {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 9};

        // Sort
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        // Copy
        int[] copy = Arrays.copyOf(arr, arr.length);

        // Search (binary search on sorted array)
        int index = Arrays.binarySearch(arr, 8);
    }
}
