import java.security.InvalidParameterException;

public class Week3Day2_SecondLargest {

    public static void main(String[] args) {
        System.out.println("{10, 25, 7, 42, 18} → " + findSecondLargest(new int[]{10, 25, 7, 42, 18}));
        System.out.println("{-10, -5, -20, -3} → " + findSecondLargest(new int[]{-10, -5, -20, -3}));
        System.out.println("{5, 5, 8, 8, 10} → " + findSecondLargest(new int[]{5, 5, 8, 8, 10}));
        System.out.println("{10, 5, 20, 8, 15} → " + findSecondLargest(new int[]{10, 5, 20, 8, 15}));
        System.out.println("{5, 5, 5} → " + findSecondLargest(new int[]{5, 5, 5}));
        System.out.println("{5} → " + findSecondLargest(new int[]{5}));

    }

    public static int findSecondLargest(int[] numbers) {
        int largest = numbers[0];
        int secondLargest = numbers[0];

        if (numbers.length < 2) {
            throw new InvalidParameterException("Array Needs at least 2 elements");
        }

        int duplicateCounter = 0;
        for(int i = 0; i < numbers.length; i++) {
            if (largest == numbers[i]) {
                duplicateCounter++ ;
            }
        }
        if (duplicateCounter == numbers.length) {
           return -1;
        }

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                secondLargest = largest;
                largest = numbers[i];
            } else if (secondLargest < largest) {
                secondLargest = numbers[i];
            }
        }

        return secondLargest;
    }
}
