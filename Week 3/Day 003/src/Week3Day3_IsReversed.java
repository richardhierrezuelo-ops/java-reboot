public class Week3Day3_IsReversed {

    public static void main(String[] args) {
       System.out.println(isReversed(new int[]{1, 2, 3}, new int[]{3, 2, 1}));
        System.out.println(isReversed(new int[]{10, 20, 30, 40}, new int[]{40, 30, 20, 10}));
        System.out.println(isReversed(new int[]{1, 2, 3}, new int[]{1, 2, 3}));
       System.out.println(isReversed(new int[]{1, 2, 3}, new int[]{3, 1, 2}));
        System.out.println(isReversed(new int[]{1, 2, 3, 4}, new int[]{4, 99, 2, 1}));
        System.out.println(isReversed(new int[]{}, new int[]{}));
    }

    public static boolean isReversed(int[] numbers1, int[] numbers2) {

        if (numbers1 == null || numbers2 == null) {
            throw new ArrayIndexOutOfBoundsException("Arrays are null");
        }

        if (numbers1.length == 0 && numbers2.length == 0) {
            return true;
        }

        if (numbers1.length != numbers2.length) {
            return false;
        }

        int left = 0;
        int right = numbers1.length - 1;  // 4

        boolean isReversed = false;
        while (!isReversed) {
            if (numbers1[left]  != numbers2[right]) {
                return false;
            }

            left++;
            right--;

            if (right < 0) {
                isReversed = true;
            }
        }
            return true;
    }
}
