import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Day4_ArraysAndLists {
    public static void main(String[] args) {
        // 1. Fixed-size array
        int[] scores = {85, 92, 78, 96, 88};
        System.out.println("Score at index 2: " + scores[2]);

        // 2. Loop through array
        System.out.print("All scores: ");
        for (int score : scores) {
            System.out.print(score + " ");
        }
        System.out.println();

        // 3. ArrayList (dynamic)
        ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        // 4. Insert, remove, size
        names.add(1, "Diana");
        System.out.println("After insert: " + names);
        names.remove("Bob");
        System.out.println("After remove: " + names);
        System.out.println("List size: " + names.size());

        // 5. Call findMax() — TYPE THIS LINE
        System.out.println("Max score: " + findMax(scores));
    }

    // using Stream
    public static int findMax2(int[] arr) {
        // Loop through arr, track largest value, return it
        List<Integer> list = Arrays.stream(arr)
                .boxed()
                .collect(Collectors.toList());
        return Collections.max(list);
    }

    // Loop Version
    public static int findMax(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }

        int maxArr = arr[0];
        for (int i=1; i<arr.length; i++) {
            if (arr[i] > maxArr) {
                maxArr = arr[i];
            }
        }
        return maxArr;
    }
}
