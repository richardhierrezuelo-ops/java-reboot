public class Week3Day1_ContainsNumber {
    public static void main(String[] args) {
        System.out.println("{10, 20, 30, 40}, 30 → " + containsNumber(new int[]{10, 20, 30, 40}, 30));
        System.out.println("{10, 20, 30, 40}, 50 → " + containsNumber(new int[]{10, 20, 30, 40}, 50));
        System.out.println("{5, 8, 12}, 5 → " + containsNumber(new int[]{5, 8, 12}, 5));
    }

    public static boolean containsNumber(int[] numbers, int target) {
        for (int number : numbers) {
            if (number == target) {
                return true;
            }
        }

        return false;
    }
}
