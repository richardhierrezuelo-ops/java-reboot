public class Week4Day3_FindFirstOccurrence {

//  Pattern: SEARCH + EARLY RETURN
    public static void main(String[] args) {

        int[][] numbers = {
                {4, 7, 2},
                {9, 7, 5},
                {1, 3, 7}
        };

        System.out.println("7 -> row " + findFirstOccurrence(numbers, 7));
        System.out.println("9 -> row " + findFirstOccurrence(numbers, 9));
        System.out.println("3 -> row " + findFirstOccurrence(numbers, 3));
        System.out.println("8 -> " + findFirstOccurrence(numbers, 8));
    }

    public static int findFirstOccurrence(int[][] numbers, int target) {

        for (int row = 0; row < numbers.length; row++) {
            for (int col = 0; col < numbers[row].length; col++) {
                if (numbers[row][col] == target) {
                    return row;
                }
            }
        }

        return -1;
    }


}
