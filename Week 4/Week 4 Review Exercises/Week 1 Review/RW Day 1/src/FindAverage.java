public class FindAverage {
    public static void main(String[] args) {
        System.out.println("Average: " + findAverage(new int[]{1,2,3,4,5,6,7,8,9,10}));
        System.out.println("Average: " + findAverage(new int[]{20,-4,30,-40,5}));
        System.out.println("Average: " + findAverage(new int[]{-20,-4,-30,-40,-5}));
        System.out.println("Average: " + findAverage(new int[]{10}));
        System.out.println("Average: " + findAverage(new int[]{}));
    }

    public static double findAverage(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0.0;
        }

        int size = arr.length;
        double sum = 0.0;

        for (int number: arr) {
            sum += number;
        }
        return sum/size;

    }
}
