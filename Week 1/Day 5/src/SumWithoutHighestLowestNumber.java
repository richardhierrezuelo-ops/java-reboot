public class SumWithoutHighestLowestNumber {

//
//Sum without highest and lowest number:
//Task
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
//If an empty value ( null, None, Nothing, nil etc. ) is given instead of an array, or
// the given array is an empty list or a list with only 1 element, return 0.

    public static void main(String[] args) {

        System.out.println(sum(new int[] { 6, 2, 1, 8, 10 }));
        System.out.println(sum(new int[] { 1, 1, 11, 2, 3 }));
    }

    public static int sum(int[] numbers) {
        if (numbers == null || numbers.length == 0 || numbers.length == 1) {
            return 0;
        }
        int min = numbers[0];
        int max = numbers[0];
        int sum = 0;

        for (int num: numbers) {
            if ( num < min)
                min = num;

            if ( num > max)
                max = num;

            sum += num;
        }

        return sum - min - max;
    }

}
