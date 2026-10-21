public class WeekendReview_CountTargetEachRow {

    public static void main(String[] args) {
        int[][] numbers = {
                {5, 2, 5, 8},
                {1, 5, 7, 5},
                {9, 3, 4, 6}
        };

        printTargetCounts(numbers, 5);
    }

    public static void printTargetCounts(int[][] numbers, int target) {

        for (int row = 0; row < numbers.length; row++) {
            int count = 0;

            for (int col = 0; col < numbers[row].length; col++) {
                if (numbers[row][col] == target) {
                    count++;
                }
            }

            System.out.println("Row " + row + ": " + count);
        }

    }
}
