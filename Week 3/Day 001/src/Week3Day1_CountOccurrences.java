public class Week3Day1_CountOccurrences {

    public static void main(String[] args) {
        System.out.println("{5, 2, 5, 8, 5, 10}, 5 → " + countOccurrences(new int[]{5, 2, 5, 8, 5, 10}, 5));
        System.out.println("{1, 2, 3, 4}, 5 → " + countOccurrences(new int[]{1, 2, 3, 4}, 5));
        System.out.println("{7, 7, 7}, 7 → " + countOccurrences(new int[]{7, 7, 7}, 7));
    }

    public static int countOccurrences(int[] numbers, int target){
        int count = 0;

        for (int number : numbers) {
            if (number == target) {
                count++;
            }
        }
        return count;
    }
}
