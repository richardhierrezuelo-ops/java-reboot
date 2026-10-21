import java.util.Arrays;

public class Week3Day5_MergeTwoArrays {
    public static void main(String[] args) {
        System.out.println("{1, 2, 3} + {4, 5, 6} -> " + Arrays.toString(mergeArrays(new int[]{1, 2, 3}, new int[]{4, 5, 6})));
        System.out.println("{10, 20} + {30, 40, 50} -> " + Arrays.toString(mergeArrays(new int[]{10, 20}, new int[]{30, 40, 50})));
        System.out.println("{} + {1, 2, 3} -> " + Arrays.toString(mergeArrays(new int[]{}, new int[]{1, 2, 3})));
        System.out.println("{} + {} -> " + Arrays.toString(mergeArrays(new int[]{}, new int[]{})));
    }

    public static int[] mergeArrays(int[] numbers1, int[] numbers2) {
        int[] mergedArray = new int[numbers1.length + numbers2.length];

        for (int i = 0; i < numbers1.length; i++) {
            mergedArray[i] = numbers1[i];
        }

        for (int i = 0; i < numbers2.length; i++) {
            mergedArray[numbers1.length + i] = numbers2[i];
        }

        return mergedArray;
    }
}
