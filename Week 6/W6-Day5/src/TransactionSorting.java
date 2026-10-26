import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TransactionSorting {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(75);
        list.add(20);
        list.add(100);
        list.add(45);
        list.add(10);

        System.out.println("Original: " + list);

        Collections.sort(list);
        System.out.println("Ascending: " + list);

        list.sort(Collections.reverseOrder());
        System.out.println("Descending: " + list);

        list.add(50);
        System.out.println("After adding 50: " + list);
    }


}
