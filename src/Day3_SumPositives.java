public class Day3_SumPositives {
    public static int sumPositives(int[] numbers) {
        int sum = 0;
        for (int i=0; i<numbers.length; i++) {
            if (numbers[i] < 0)
                continue;
            sum += numbers[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumPositives(new int[]{1, -4, 7, 12, -10})); // 20
        System.out.println(sumPositives(new int[]{})); // 0
        System.out.println(sumPositives(new int[]{-1, -2})); // 0
    }
}