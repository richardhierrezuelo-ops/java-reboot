public class Week4Day3_ContainsValue2D {

    // Pattern:  Nested loops + Search and Early Return
    public static void main(String[] args) {
        int[][] numbers = {
                {10, 20, 30},
                {40, 50, 60},
                {70, 80, 90}
        };

        System.out.println("50 -> " + containsValue(numbers, 50));
        System.out.println("99 -> " + containsValue(numbers, 99));
        System.out.println("10 -> " + containsValue(numbers, 10));
        System.out.println("90 -> " + containsValue(numbers, 90));
    }

    public static boolean containsValue(int[][] numbers, int target) {

        for (int row = 0; row < numbers.length; row++) {
            for (int col = 0; col < numbers[row].length; col++) {
                if (numbers[row][col] == target) {
                    return true;
                }
            }
        }
        return false;
    }
}
