//Task: Write a method that takes two List<Integer> and returns a Set<Integer> containing only the common elements (intersection).
//List<Integer> list1 = Arrays.asList(10, 20, 30, 40, 50, 60);
//List<Integer> list2 = Arrays.asList(15, 20, 25, 30, 35, 40);


import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindCommonElements {

    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> list2 = Arrays.asList(4, 5, 6, 7, 8, 9);

        System.out.println(findCommonElements(list1, list2));  // 4, 5, 6

        List<Integer> list3 = Arrays.asList(10, 20, 30, 40, 50, 60);
        List<Integer> list4 = Arrays.asList(15, 20, 25, 30, 35, 40);
        System.out.println(findCommonElements(list3, list4));  // 20, 30, 40
    }

    public static Set<Integer> findCommonElements(List<Integer> list1, List<Integer> list2) {
        Set<Integer> result = new HashSet<>();

        for (int l:  list1) {
            if (list2.contains(l))  {
                result.add(l);
            }
        }
        return result;
    }

}
