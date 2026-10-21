public class Week4Day3_CountOccurrences2D {

// Pattern: Nested loops + Counter
    public static void main(String[] args) {
        int[][] numbers = {
                {5, 2, 8},
                {5, 5, 1},
                {7, 3, 5}
        };

        System.out.println("5 -> " + countOccurrences(numbers, 5));
        System.out.println("2 -> " + countOccurrences(numbers, 2));
        System.out.println("9 -> " + countOccurrences(numbers, 9));
    }

    public static int countOccurrences(int[][] numbers, int target) {
        int count = 0;

        for (int row = 0; row < numbers.length; row++) {
            for (int col = 0; col < numbers[row].length; col++) {
                if (numbers[row][col] == target) {
                    count++;
                }
            }
        }

        return count;
    }
}
