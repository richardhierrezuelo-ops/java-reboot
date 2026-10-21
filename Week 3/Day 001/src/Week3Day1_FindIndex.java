public class Week3Day1_FindIndex {
    public static void main(String[] args) {
        System.out.println("{10, 20, 30, 40}, 30 → " + findIndex(new int[]{10, 20, 30, 40}, 30));
        System.out.println("{10, 20, 30, 40}, 50 → " + findIndex(new int[]{10, 20, 30, 40}, 50));
        System.out.println("{5, 8, 12}, 5 → " + findIndex(new int[]{5, 8, 12}, 5));
    }

    public static int findIndex(int[] numbers, int target) {
        int index = -1;
        for (int i = 0; i < numbers.length; i++) {
           if (numbers[i] == target) {
               return i;
           }
        }

        return index;
    }
}
