public class Week3Day1_LastOccurrence {
    public static void main(String[] args) {
        System.out.println("{5, 2, 5, 8, 5, 10}, 5 → " + findLastOccurrence(new int[]{5, 2, 5, 8, 5, 10}, 5));
        System.out.println("{10, 20, 30}, 20 → " + findLastOccurrence(new int[]{10, 20, 30, 40}, 20));
        System.out.println("{1, 2, 3}, 9 → " + findLastOccurrence(new int[]{1, 2, 3}, 9));
    }

    public static int findLastOccurrence(int[] numbers, int target) {
        int index = -1;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                index = i;
            }
        }

        return index;
    }
}
