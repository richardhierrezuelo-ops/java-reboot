import java.security.InvalidParameterException;

public class WeekendExercise1_FindSecondLargest {

    public static void main(String[] args) {
        System.out.println("{10, 5, 8, 10, 3} -> " + findSecondLargest(new int[]{10, 5, 8, 10, 3}));
        System.out.println("{-5, -10, -2, -8} -> " + findSecondLargest(new int[]{-5, -10, -2, -8}));
        System.out.println("{7, 7, 7} -> " + findSecondLargest(new int[]{7, 7, 7}));
        System.out.println("{10, 5, 20, 8, 15} -> " + findSecondLargest(new int[]{10, 5, 20, 8, 15}));

    }

    public static int findSecondLargest(int[] numbers) {
        if (numbers.length < 2) {
            throw new InvalidParameterException("Array needs at least 2 elements");
        }

        int largest = numbers[0]; // 10
        int secondLargest = numbers[0];

        boolean foundSecondLargest = false;

        for (int i = 1; i < numbers.length; i++) {
//            System.out.println (numbers[i] + " " + largest);
            if ( numbers[i] > largest) {//  5 > 10 - false, 20 > 10 - true;  8 > 20 - false; 15 > 20 - false;
                secondLargest = largest;
                largest = numbers[i];  // 20
                 // 10
//                System.out.println ("secondLargest " + secondLargest);

                foundSecondLargest = true;
            }
            else if (numbers[i] < largest  &&
                    (!foundSecondLargest ||  numbers[i] > secondLargest))  { // 8 > 10 &&  8 < 20 - false;
                secondLargest = numbers[i];    // 15 > 10 && 15  < 20
//                System.out.println ("secondLargest " + numbers[i] + " " + secondLargest);

                foundSecondLargest = true;
            }
        }

        if (!foundSecondLargest) {
            return -1;
        }

        return secondLargest;
    }
}
