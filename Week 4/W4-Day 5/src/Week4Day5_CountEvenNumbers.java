public class Week4Day5_CountEvenNumbers {

    public static void main(String[] args) {

        int[][] numbers = {
                {2, 5, 8, 10},
                {11, 14, 17, 20}
        };

        System.out.println("Even Numbers: " + countEvenNumbers(numbers));
    }

    public static int countEvenNumbers(int[][] numbers) {

        int count = 0;

        for (int row = 0; row < numbers.length; row++) {
            for (int col = 0; col < numbers[row].length; col++) {
                if (numbers[row][col] % 2 == 0) {
                    count++;
                }
            }
        }

        return count;
    }
}
