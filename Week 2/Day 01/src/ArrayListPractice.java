import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Exercise 1: ArrayList Practice
//Create a method that takes a list of integers and returns a new list with only even numbers.

public class ArrayListPractice {

    public static void main(String[] args) {
        List<Integer> myNumbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println("Original : " + myNumbers);
        System.out.println("Even nums: " + getEvenNumbers(myNumbers));
    }

    public static List<Integer> getEvenNumbers(List<Integer> numbers) {
            List<Integer> result = new ArrayList<>();

            for (Integer i : numbers) {
                if (i % 2 == 0) {
                    result.add(i);
                }
            }
            return result;
    }
}
