public class FindThirdMax {

    public static void main(String[] args) {
        System.out.println("Third Max: " + findThirdMax(new int[]{12, 35, 1, 10, 34, 1}));
        System.out.println("Third Max: " + findThirdMax(new int[]{10, 5, 10}));
        System.out.println("Third Max: " + findThirdMax(new int[]{5, 5, 5}));
    }

    public static int findThirdMax(int[] arr) {
        if (arr == null || arr.length == 0) {
            return Integer.MIN_VALUE;
        }

        int first = Integer.MIN_VALUE;   // largest
        int second = Integer.MIN_VALUE;  // second largest
        int third = Integer.MIN_VALUE;   // third largest

        for (int num : arr) {
            // Skip duplicates of numbers we already recorded
            if (num == first || num == second || num == third) {
                continue;
            }

            if (num > first) {
                // New largest found
                third = second;
                second = first;
                first = num;
            } else if (num > second) {
                // New second largest found
                third = second;
                second = num;
            } else if (num > third) {
                // New third largest found
                third = num;
            }
        }

        // If third was never updated, we don’t have 3 distinct values
        return (third == Integer.MIN_VALUE) ? Integer.MIN_VALUE : third;
    }
}
