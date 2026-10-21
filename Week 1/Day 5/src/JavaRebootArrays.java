public class JavaRebootArrays {
    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};
        printArray(numbers);
        System.out.println("------------------------------");

        int[] numArray1 = {1, 2, 3, 4, 5};
        int[] numArray2 = {10, 20, 30};
        System.out.println(sumArray(numArray1));
        System.out.println(sumArray(numArray2));
        System.out.println("------------------------------");

        int[] countArray1 = {1, 2, 3, 4, 5,6};
        System.out.println(countEvenNumbers(countArray1));
        System.out.println("------------------------------");

        int[] largestArray = {4, 9, 2, 15, 7};
        System.out.println(findLargest(largestArray));
        System.out.println("------------------------------");

        int[] thresholdArray = {10, 25, 5, 40, 15};
        int threshold = 15;
        System.out.println(countNumbersAbove(thresholdArray, threshold));

    }

    public static void printArray(int[] numbers) {
        for (int number : numbers) {
            System.out.println(number);
        }
    }

    public static int sumArray(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    public static int countEvenNumbers(int[] numbers) {
        int count = 0;
        for (int number : numbers) {
            if (number % 2 ==0) {
                count++;
            }
        }
        return count;
    }

    public static int findLargest(int[] numbers) {
        int largest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }

        return largest;
    }

    public static int countNumbersAbove(int[] numbers, int threshold) {
        int count = 0;
        for (int number : numbers) {
            if (number > threshold) {
                count++;
            }
        }

        return count;
    }
}
