public class Week3Day2_FindSmallest {

    public static void main(String[] args) {
        System.out.println("{10, 25, 7, 42, 18} → " + findSmallest(new int[]{10, 25, 7, 42, 18}));
        System.out.println("{-10, -5, -20, -3} → " + findSmallest(new int[]{-10, -5, -20, -3}));
        System.out.println("{5} → " + findSmallest(new int[]{5}));
    }

    public static int findSmallest(int[] numbers) {
        int smallest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }
        return smallest;
    }
}
