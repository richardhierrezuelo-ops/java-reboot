import java.util.*;

public class CollectionsDemo {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();

        names.add("Rick");
        names.add("Portia");
        names.add("Anna");
        names.add("Rick");           // Allows duplicates

        System.out.println(names);
        System.out.println("Size: " + names.size());
        System.out.println("First: " + names.get(0));

        names.remove("Rick");        // Removes first occurrence
        names.remove(1);             // Remove by index

        System.out.println(names);
    }
}
