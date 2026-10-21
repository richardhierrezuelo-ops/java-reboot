public class WeekendReview_AverageEachRow {
    public static void main(String[] args) {
        int[][] numbers = {
                {10, 20, 30},
                {5, 15, 25},
                {2, 4, 6, 8}
        };

        printRowAverages(numbers);
    }
    public static void printRowAverages(int[][] numbers) {

        for (int row = 0; row < numbers.length; row++) {
            int sum = 0;
            int count = 0;

            for (int col = 0; col < numbers[row].length; col++) {
                sum += numbers[row][col];
                count++;
            }
            double avg = (double) sum / count;
            System.out.println("Row " + row + " average: " + avg);
        }
    }


}
