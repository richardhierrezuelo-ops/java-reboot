import java.util.Arrays;
import java.util.List;

public class AdvancedStream {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("rick", "portia", "anna", "mike");

        List<String> filteredList = names.stream()
                .filter(name -> name.length() > 4)
                .map(String::toUpperCase)
                .sorted()
                .toList();

        System.out.println(filteredList);
    }
}
