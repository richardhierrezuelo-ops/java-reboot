import java.util.Arrays;
import java.util.Collections;

public class FindSecondMax {

    public static void main(String[] args) {

        System.out.println("Second Max: " + findSecondMax(new int[]{12, 35, 1, 10, 34, 1}));
        System.out.println("Second Max: " + findSecondMax(new int[]{10, 5, 10}));
        System.out.println("Second Max: " + findSecondMax(new int[]{5, 5, 5}));
    }

    public static int findSecondMax(int[] arr) {
        if (arr == null || arr.length < 2) {
            return Integer.MIN_VALUE;
        }

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > max) {
                secondMax = max;
                max = num;
            } else if (num > secondMax && num != max) {
                secondMax = num;
            }
        }

        // If secondMax was never updated, it means there was no distinct second maximum
        return (secondMax == Integer.MIN_VALUE) ? Integer.MIN_VALUE : secondMax;
    }


}
