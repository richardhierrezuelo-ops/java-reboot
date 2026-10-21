public class WeekendReview_LargestWithPosition {

    public static void main(String[] args) {

        int[][] numbers = {
                {-10, -4, -20},
                {-8, -1, -15},
                {-30, -6, -12}
        };

        printLargestPosition(numbers);
    }

    public static void printLargestPosition(int[][] numbers) {
        int largest = numbers[0][0];
        int largestRow = 0;
        int largestColumn = 0;

        for (int row = 0; row < numbers.length; row++) {
            for (int col = 0; col < numbers[row].length; col++) {

                if (numbers[row][col] > largest) {
                    largest = numbers[row][col];
                    largestRow = row;
                    largestColumn = col;
                }
            }
        }

        System.out.println("Largest: " + largest);
        System.out.println("Largest Row: " + largestRow);
        System.out.println("largest Column: " + largestColumn);


    }
}
