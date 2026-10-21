public class TwoDArraySum {
    public static void main(String[] args) {

        int[][] matrix = {
                {85, 90, 78},
                {92, 88, 95},
                {76, 82, 89}
        };
        System.out.println("Sum of the matrix: " + sumOfMatrix(matrix));  // 775 should be our answer
    }

    public static int sumOfMatrix(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return 0;
        }

        int sum = 0;

        for (int i=0; i<matrix.length; i++)  {
            for (int j=0; j<matrix[i].length; j++) {
                sum += matrix[i][j];
            }
        }
        return sum;
    }
}
