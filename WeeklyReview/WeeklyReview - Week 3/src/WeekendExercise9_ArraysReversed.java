import java.util.Arrays;

public class WeekendExercise9_ArraysReversed {
    public static void main(String[] args) {
        System.out.println("{1, 2, 3} + {3, 2, 1} -> " + isReversed(new int[] {1, 2, 3}, new int[] {3, 2, 1}));
        System.out.println("{10, 20, 30} + {30, 20, 10} -> " + isReversed(new int[] {10, 20, 30}, new int[] {30, 20, 10}));
        System.out.println("{1, 2, 3} + {1, 2, 3} -> " + isReversed(new int[] {1, 2, 3}, new int[] {1, 2, 3}));
        System.out.println("{1, 2, 3} + {3, 1, 2} -> " + isReversed(new int[] {1, 2, 3}, new int[] {3, 1, 2}));
        System.out.println("{7} + {7} -> " + isReversed(new int[] {7}, new int[] {7}));
        System.out.println("{} + {} -> " + isReversed(new int[] {}, new int[] {}));

    }

    public static boolean isReversed(int[] numbers1, int[] numbers2) {
        if (numbers1.length == 0 && numbers2.length == 0) {
            return true;
        }

        if (numbers1.length == numbers2.length) {
            int left = 0;
            int right = numbers2.length - 1;

            while (left < right) {
                if (numbers1[left] != numbers2[right]) {
                    return false;
                }
                left++;
                right--;
            }
        } else {
            return false;
        }

        return true;
    }
}
