public class FindSmallestIntegerArray {

    //Description:
    //Given an array of integers your solution should find the smallest integer.
    //
    //For example:
    //
    //Given [34, 15, 88, 2] your solution will return 2
    //Given [34, -345, -1, 100] your solution will return -345
    //You can assume, for the purpose of this kata, that the supplied array will not be empty.

    public static void main(String[] args) {

        int[] n1 = new int[] { 34, 15, 88, 2 };
        int[] n2 = new int[] { 34, -345, -1, 100 };

        System.out.println("N1 Smallest Number is: " + findSmallestInt(n1));    // return 2
        System.out.println("N2 Smallest Number is: " + findSmallestInt(n2));   // return -345

    }

    public static int findSmallestInt(int[] args) {
        int lowest = args[0];

        for (int i = 0; i< args.length; i++) {    //for (int num : args) {  // Enhanced for-loop (cleaner)
            if (args[i] < lowest)
                lowest = args[i];
        }
        return lowest;
    }

}
