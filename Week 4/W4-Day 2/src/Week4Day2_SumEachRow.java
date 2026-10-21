public class Week4Day2_SumEachRow {

//Nested loops + Row-specific accumulator
    public static void main(String[] args) {

        int[][] numbers = {
                {10, 20, 30},
                {40, 50, 60},
                {70, 80, 90}
        };

        for (int i = 0; i < numbers.length; i++) {
            int sum = 0;

            for (int j = 0; j < numbers[i].length; j++) {
                sum += numbers[i][j];
            }

            System.out.println( "Row " + i + " Sum: " + sum);
        }
    }


}
