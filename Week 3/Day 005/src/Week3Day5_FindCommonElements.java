import java.util.Arrays;

public class Week3Day5_FindCommonElements {

    public static void main(String[] args) {
        System.out.println("{1, 2, 3, 4, 5} + {3, 5, 7, 9} -> " + Arrays.toString(findCommonElements(new int[]{1, 2, 3, 4, 5}, new int[]{3, 5, 7, 9})));
        System.out.println("{10, 20, 30, 40, 50} + {3, 5, 7, 9} -> " + Arrays.toString(findCommonElements(new int[]{10, 20, 30, 40, 50}, new int[]{3, 5, 7, 9})));
        System.out.println("{1, 2, 2, 3} + {2, 2, 4} -> " + Arrays.toString(findCommonElements(new int[]{1, 2, 2, 3}, new int[]{2, 2, 4})));

    }

    public static int[] findCommonElements(int[] numbers1, int[] numbers2) {
        int count = 0;

        for (int number1 : numbers1) {
            int temp = 0;
            for (int number2 : numbers2) {
                if (number2 == temp) {
                    continue;
                }
                if (number1 == number2) {
                    count++;
                    temp = number1;
                }
            }
        }

        int resultIndex = 0;
        int[] result = new int[count];
        for (int number1 : numbers1) {
            int temp = 0;
            for (int number2 : numbers2) {
                if (number2 == temp) {
                    continue;
                }
                if (number1 == number2) {
                    result[resultIndex] = number1;
                    resultIndex++;
                    temp = number1;
                }
            }
        }

        return result;
    }
}
