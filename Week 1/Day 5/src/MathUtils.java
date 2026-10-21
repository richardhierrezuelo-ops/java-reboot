public class MathUtils {

    public static int  sum(int... numbers) {
        if (numbers.length == 0) {
            return 0;
        }

        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

    public static int max(int... numbers) {
        if (numbers.length == 0) {
            return Integer.MIN_VALUE;
        }
        int max = numbers[0];
        for (int num: numbers) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static int min(int... numbers) {
        if (numbers.length == 0) {
            return Integer.MAX_VALUE;
        }

        int min = numbers[0];
        for (int num: numbers) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

}
