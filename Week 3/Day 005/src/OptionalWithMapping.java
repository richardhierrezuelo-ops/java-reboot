import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class OptionalWithMapping {
    public static void main(String[] args) {
        Optional<String> name1 =  getFormattedName(2);
        Optional<String> name2 =  getFormattedName(0);
        Optional<String> name3 =  getFormattedName(4);

        printName(name1);
        printName(name2);
        printName(name3);
    }

    public static void printName(Optional<String> name) {
        name.ifPresentOrElse(
                System.out::println,
                () -> System.out.println("User not found"));
    }

    public static Optional<String> getFormattedName(int id) {
        if (id <=0) {
            return Optional.empty();
        }

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Rick");
        map.put(2, "Portia");
        map.put(3, "Anna");
        map.put(4, "Mike");

        String name = map.get(id);

        return Optional.of("Name: [" +name + "]");

//        return Optional.ofNullable(map.get(id))
//            .map(name -> "Name: [" + name + "]");
    }


}
