public class WeekendReview_SecondLargestDistinct {
    public static void main(String[] args) {

        System.out.println("{10, 5, 8, 10, 3} -> " + findSecondLargest(new int[] {10, 5, 8, 10, 3}));
        System.out.println("{-5, -10, -3, -8} -> " + findSecondLargest(new int[] {-5, -10, -3, -8}));
        System.out.println("{4, 2, 9, 9, 7, 4} -> " + findSecondLargest(new int[] {4, 2, 9, 9, 7, 4}));
        System.out.println("{-10, -20, -5, -5, -30} -> " + findSecondLargest(new int[] {-10, -20, -5, -5, -30}));
        System.out.println("{7, 7, 7, 7} -> " + findSecondLargest(new int[] {7, 7, 7, 7}));

    }

    public static int findSecondLargest(int[] numbers) {
        int largest = numbers[0];
        int secondLargest = 0;

        boolean foundSecondLargest = false;

        for (int i = 1; i < numbers.length; i++) {

            if (numbers[i] > largest) {
                secondLargest = largest;
                largest = numbers[i];
                foundSecondLargest = true;
            } else if (( numbers[i] < largest)  && (!foundSecondLargest ||  numbers[i] > secondLargest)){
                secondLargest = numbers[i];
                foundSecondLargest = true;
            }
        }

        if (!foundSecondLargest) {
            return -1;
        }

        return secondLargest;
    }
}
