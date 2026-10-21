public class Week4Day5_LargestWithPosition {

    public static void main(String[] args) {
        int[][] numbers = {
                {3, 8, 2},
                {7, 1, 9},
                {4, 6, 5}
        };

        printLargestPosition(numbers);
    }

    public static void printLargestPosition(int[][] numbers) {
        int largest = numbers[0][0];
        int largestRow = 0;
        int largestCol = 0;

        for (int row = 0; row < numbers.length; row++) {
            for (int col = 0; col < numbers[row].length; col++) {
                if (numbers[row][col] > largest) {
                    largest = numbers[row][col];
                    largestRow = row;
                    largestCol = col;
                }
            }
        }
        System.out.println("Largest " + largest);
        System.out.println("Row: " + largestRow);
        System.out.println("Column: " + largestCol);
    }
}
