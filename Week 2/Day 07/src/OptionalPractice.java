// Exercise 2: Optional Practice
// Create a method Optional<String> findUserById(int id) that returns
// an Optional containing the username or empty if not found.

import java.util.HashMap;
import java.util.Optional;

public class OptionalPractice {

    public static void main(String[] args) {
        System.out.println("Name: " + findUserById(4).orElse("User not found"));
        System.out.println("Name: " + findUserById(99).orElse("User not found"));
    }

    public static Optional<String> findUserById(int id) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Rick");
        map.put(4, "Portia");
        map.put(9, "Mike");

        return Optional.ofNullable(map.get(id));

    }
}
