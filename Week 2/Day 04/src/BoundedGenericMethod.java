import java.util.Arrays;
import java.util.List;

public class BoundedGenericMethod {
    public static void main(String[] args) {
        System.out.println("Largest Number: " + findMax(Arrays.asList(10,99,14, 20)));
        System.out.println("Largest Number: " + findMax(null));
    }

    public static <T extends Number> T findMax(List<T> list) {
       if (list ==null || list.isEmpty()) {
           return null;
       }

       T max =  list.get(0);

        for(T item : list){
            if (item.intValue() > max.intValue()) {
                max = item;
            }
        }
       return max;
    }
}
