import java.util.Arrays;

public class ArrayMaxFinder {
    public static void main(String[] args) {
        var scores = new int[]{85, 92, 101, 78, 95};
        System.out.println("Maximum Value: " + findMax(scores));
    }

    public static int findMax(int[] arr) {
        if (arr.length == 0)
            return Integer.MIN_VALUE;

        var index = 0;
        for (int j : arr) {
            if (j > index) {
                index = j;
            }
        }
        return index;
    }

}
