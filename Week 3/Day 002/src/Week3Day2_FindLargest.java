public class Week3Day2_FindLargest {

    public static void main(String[] args) {
        System.out.println("{10, 25, 7, 42, 18} → " + findLargest(new int[]{10, 25, 7, 42, 18}));
        System.out.println("{-10, -5, -20, -3} → " + findLargest(new int[]{-10, -5, -20, -3}));
        System.out.println("{5} → " + findLargest(new int[]{5}));
    }

    public static int findLargest(int[] numbers) {
        int largest = numbers[0];

        for (int i =1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }
        return largest;
    }
}
