//There is an array with some numbers. All numbers are equal except for one. Try to find it!
//
//Kata.findUniq(new double[]{ 1, 1, 1, 2, 1, 1 }); // => 2
//Kata.findUniq(new double[]{ 0, 0, 0.55, 0, 0 }); // => 0.55
//It’s guaranteed that array contains at least 3 numbers.
//
//The tests contain some very huge arrays, so think about performance.
//
//This is the first kata in series:
//
//Find the unique number (this kata)
//Find the unique string
//Find The Unique

import java.util.HashSet;
import java.util.Set;

public class FindUniqueNumber {
    public static void main(String[] args) {
         System.out.println(findUniq(new double[]{ 1, 1, 1, 2, 1, 1 }));  // 2
        System.out.println(findUniq(new double[]{ 0, 0, 0.55, 0, 0 }));  // 0.55
        System.out.println(findUniq(new double[]{ 0, 1, 1}));   // 0
        System.out.println(findUniq(new double[]{ 71, 55,55}));   // 71
    }

    public static double findUniq(double arr[]) {
        // Do the magic
        if (arr == null || arr.length == 0) {
            return 0;
        }

        double duplicate = 0;
        Set<Double> uniqueValues =  new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (!uniqueValues.add(arr[i])) {
                duplicate = arr[i];
            }
        }

        uniqueValues.remove(duplicate);

        return uniqueValues.iterator().next();
    }
}
