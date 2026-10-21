public class SumWithoutHighestLowestNumber {

    // Task
    //Sum all the numbers of a given array ( cq. list ), except the highest and the lowest element ( by value, not by index! ).
    //
    //The highest or lowest element respectively is a single element at each edge, even if there are more than one with the same value.
    //
    //Mind the input validation.
    //
    //Example
    //{ 6, 2, 1, 8, 10 } => 16
    //{ 1, 1, 11, 2, 3 } => 6
    //Input validation
    //If an empty value ( null, None, Nothing, nil etc. ) is given instead of an array, or the given array is an empty list or a list with only 1 element, return 0.

    public static void main(String[] args) {
        int[] n1 =  {6, 2, 1, 8, 10 };
        int[] n2 = {1, 1, 11, 2, 3 };
        int[] n3 = {1, 7, 10, 10};

        System.out.println(sum2(n1));  // 16
        System.out.println(sum2(n2));  // 6
        System.out.println(sum2(n3));  // 17
    }

    public static int sum(int[] numbers)
    {
        if (numbers == null || numbers.length == 0 || numbers.length == 1)
            return 0;

        int sum = 0;

        int lowest = numbers[0];
        int highest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < lowest) {
                lowest = numbers[i];
            } else if (numbers[i] > highest) {
                highest = numbers[i];
            }
        }

        boolean islowestRepeat = false;
        boolean ishighestRepeat = false;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == lowest) {
                if (!islowestRepeat) {
                    islowestRepeat = true;
                    continue;
                }
            } else if (numbers[i] == highest) {
                if (!ishighestRepeat) {
                    ishighestRepeat = true;
                    continue;
                }
            }
            sum += numbers[i];
        }

        System.out.print(lowest + " " + highest  + "\n");

        return sum;
    }

    public static int sum2(int[] numbers) {
        if (numbers == null || numbers.length <= 1) {
            return 0;
        }

        int min = numbers[0];
        int max = numbers[0];
        int totalSum = 0;

        for (int num : numbers) {
            totalSum += num;
            if (num < min) min = num;
            if (num > max) max = num;
        }

        return totalSum - min - max;
    }

}
