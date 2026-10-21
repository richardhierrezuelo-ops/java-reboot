public class FindSmallestIntegerArray {

// Find the smallest integer in the array
//Given an array of integers your solution should find the smallest integer.
//
//For example:
//
//Given [34, 15, 88, 2] your solution will return 2
//Given [34, -345, -1, 100] your solution will return -345
//You can assume, for the purpose of this kata, that the supplied array will not be empty.

    public static void main(String[] args) {
        System.out.println(findSmallestIntegerArray(new int[] {34, 15, 88, 2}));
        System.out.println(findSmallestIntegerArray(new int[] {34, -345, -1, 100}));
    }

    public static int findSmallestIntegerArray(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty");
        }
        int min = numbers[0];

        for (int num: numbers)  {
            if ( num < min)
                min = num;
        }
        return min;
    }
}
