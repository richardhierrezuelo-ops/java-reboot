public class JavaRebootWeek1Review {

    public static void main(String[] args) {

        System.out.println("49 -> " + getTemperatureStatus(49));
        System.out.println("50 -> " + getTemperatureStatus(50));
        System.out.println("79 -> " + getTemperatureStatus(79));
        System.out.println("80 -> " + getTemperatureStatus(80));
        System.out.println("100 -> " + getTemperatureStatus(100));
        System.out.println("------------------------------");

        System.out.println("2024 -> " + isLeapYear(2024));
        System.out.println("2023 -> " + isLeapYear(2023));
        System.out.println("1900 -> " + isLeapYear(1900));
        System.out.println("2000 -> " + isLeapYear(2000));
        System.out.println("------------------------------");

        System.out.println("Count: " + countMultiples(1, 20, 5));
        System.out.println("Count: " + countMultiples(10, 30, 3));
        System.out.println("-----------------------------");

        System.out.println("Average: " + calculateAverage(new int[] {10, 20, 30, 40}));
        System.out.println("Average: " + calculateAverage(new int[] {5, 10, 15}));
        System.out.println("Average: " + calculateAverage(new int[] {1, 2}));
        System.out.println("-----------------------------");

        int[] numbers = {5, -2, 0, 7, -8, 0, 3};
        System.out.println("Positive: " + countPositive(numbers));
        System.out.println("Negative: " + countNegative(numbers));
        System.out.println("Zero: " + countZeros(numbers));
        System.out.println("-----------------------------");

        System.out.println("Smallest: " + findSmallest(new int[] {8, 3, 15, 2, 9}));
        System.out.println("Smallest: " + findSmallest(new int[] {-5, -20, 3, -1}));
        System.out.println("Smallest: " + findSmallest(new int[] {}));
        System.out.println("-----------------------------");

        printReverse(new int[] {10, 20, 30, 40, 50});
        System.out.println("-----------------------------");

        System.out.println("Second Largest: " + findSecondLargest(new int[] {10, 5, 20, 8, 15}));
        System.out.println("Second Largest: " + findSecondLargest(new int[] {3, 9, 1, 7, 5}));
        System.out.println("Second Largest: " + findSecondLargest(new int[] {-10, -5, -20}));
        System.out.println("Second Largest: " + findSecondLargest(new int[] {5, 5, 5}));
        System.out.println("Second Largest: " + findSecondLargest(new int[] {5}));
        System.out.println("-----------------------------");


        getNumberStatistics(new int[] {5, -2, 0, 10, -3, 7});
    }

    public static String getTemperatureStatus(int temperature) {
        if (temperature >= 80) {
            return "Hot";
        } else if (temperature >= 50) {
            return "Mild";
        } else {
            return "Cold";
        }
    }

    public static boolean isLeapYear(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100  != 0);
    }

    public static int countMultiples(int start, int end, int divisor) {
        int count = 0;
        for (int i = start; i <= end; i++) {
            if (i % divisor == 0) {
                count++;
            }
        }
        return count;
    }

    public static double calculateAverage(int[] numbers) {
        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }

        return (double) sum / numbers.length;
    }

    public static int countPositive(int[] numbers) {
        int count = 0;

        for (int number: numbers) {
            if (number > 0) {
                count++;
            }
        }
        return count;
    }

    public static int countNegative(int[] numbers) {
        int count = 0;
        for (int number: numbers) {
            if (number < 0) {
                count++;
            }
        }
        return count;
    }

    public static int countZeros(int[] numbers) {
        int count = 0;
        for (int number: numbers) {
            if (number == 0) {
                count++;
            }
        }
        return count;
    }

    public static int findSmallest(int[] numbers) {
        if  (numbers == null || numbers.length == 0) {
            return Integer.MIN_VALUE;
        }

        int smallest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }

        return smallest;
    }

    public static void printReverse(int[] numbers) {
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + "\n");
        }
    }

    public static int findSecondLargest(int[] numbers) {
        if (numbers == null || numbers.length == 0) {}

        int largest = numbers[0];
        int secondLargest = 0;

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                secondLargest = largest;
                largest = numbers[i];
            } else if  (numbers[i] > secondLargest) {
                secondLargest = numbers[i];
            }
        }
        return  secondLargest;
    }

    public static void getNumberStatistics(int[] numbers) {
        System.out.println("Positive: " + countPositive(numbers));
        System.out.println("Negative: " + countNegative(numbers));
        System.out.println("Zero: " + countZeros(numbers));
        System.out.println("Largest: " + findLargest(numbers));
        System.out.println("Smallest: " + findSmallest(numbers));
        System.out.println("Sum: " + sumArray(numbers));
    }

    public static int sumArray(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
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
}
