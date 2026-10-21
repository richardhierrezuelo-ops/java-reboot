public class FindThirdMin {

    public static void main(String[] args) {
        System.out.println("Third Min: " + findThirdMin(new int[]{12, 35, 1, 10, 34, 1}));
        System.out.println("Third Min: " + findThirdMin(new int[]{10, 5, 10}));
        System.out.println("Third Min: " + findThirdMin(new int[]{5, 5, 5}));
    }

    public static int findThirdMin(int[] arr) {
        if (arr == null || arr.length == 0) {
            return Integer.MAX_VALUE;
        }

        int first = Integer.MAX_VALUE;   // smallest
        int second = Integer.MAX_VALUE;  // second smallest
        int third = Integer.MAX_VALUE;   // third smallest

        for (int num : arr) {
            if (num == first || num == second || num == third) {
                continue;   // skip duplicates
            }

            if (num < first) {
                third = second;
                second = first;
                first = num;
            } else if (num < second) {
                third = second;
                second = num;
            } else if (num < third) {
                third = num;
            }
        }

        return (third == Integer.MAX_VALUE) ? Integer.MAX_VALUE : third;
    }
}
