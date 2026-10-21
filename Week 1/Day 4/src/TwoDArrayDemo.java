public class TwoDArrayDemo {
    public static void main(String[] args) {

        // Declaration & Initialization
        int[][] matrix = new int[3][4];           // 3 rows, 4 columns

        int[][] scores = {
                {85, 90, 78},
                {92, 88, 95},
                {76, 82, 89}
        };

        // Accessing elements
        System.out.println(scores[0][1]);   // 90 (row 0, column 1)

        // scores.length → number of rows
        System.out.println(scores.length);

        // scores[i].length → number of columns in row i
        // Jagged arrays are possible (rows with different lengths)
        // Printing 2D array
        for (int i = 0; i < scores.length; i++) {
            for (int j = 0; j < scores[i].length; j++) {
                System.out.print(scores[i][j] + " ");
            }
            System.out.println();
        }
    }
}
