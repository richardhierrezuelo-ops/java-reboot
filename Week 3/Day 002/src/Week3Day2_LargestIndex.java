public class Week3Day2_LargestIndex {

    public static void main(String[] args) {
        System.out.println("{10, 25, 7, 42, 18} → " + findLargestIndex(new int[]{10, 25, 7, 42, 18}));
        System.out.println("{-10, -5, -20, -3} → " + findLargestIndex(new int[]{-10, -5, -20, -3}));
        System.out.println("{100, 50, 25} → " + findLargestIndex(new int[]{100, 50, 25}));
        System.out.println("{10, 25, 42, 42, 18} → " + findLargestIndex(new int[]{10, 25, 42, 42, 18}));
    }

    public static int findLargestIndex(int[] numbers) {
        int index = 0;
        int largest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                index = i;
                largest = numbers[i];
            }
        }

        return index;
    }
}
