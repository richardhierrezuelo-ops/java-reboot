public class FindSecondMin {
    public static void main(String[] args) {

        System.out.println("Second Min: " + findSecondMin(new int[]{12, 35, 1, 10, 34, 1}));
        System.out.println("Second Min: " + findSecondMin(new int[]{10, 5, 10}));
        System.out.println("Second Min: " + findSecondMin(new int[]{5, 5, 5}));
    }

    public static int findSecondMin(int[] arr) {
        if (arr == null || arr.length < 2) {
            return Integer.MAX_VALUE;          // signal for “not found”
        }

        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for (int num : arr) {
            if (num < min) {
                secondMin = min;
                min = num;
            } else if (num < secondMin && num != min) {
                secondMin = num;
            }
        }

        return (secondMin == Integer.MAX_VALUE) ? Integer.MAX_VALUE : secondMin;
    }
}
