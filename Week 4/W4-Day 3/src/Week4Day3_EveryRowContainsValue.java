public class Week4Day3_EveryRowContainsValue {

//    Pattern: ROW-BY-ROW SEARCH
    public static void main(String[] args) {
        int[][] numbers = {
                {4, 7, 2},
                {9, 7, 5},
                {7, 3, 7}
        };

        System.out.println("7 -> " + everyRowContains(numbers, 7));
        System.out.println("9 -> " + everyRowContains(numbers, 9));
        System.out.println("2 -> " + everyRowContains(numbers, 2));
    }

    public static boolean everyRowContains(int[][] numbers, int target) {

        int foundCounter = 0;
        for (int row = 0; row < numbers.length; row++) {
            for (int col = 0; col < numbers[row].length; col++) {
                if (numbers[row][col] == target) {
                    foundCounter++;
                    break;
                }
            }
        }

         return foundCounter == numbers.length;
    }
}
