// Exercise 2: Optional Chaining
//Create a method Optional<String> getUserInitials(int id) that:Finds user name
//Takes first letter of each word
//Returns uppercase initials or "N/A"

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalChaining {
    public static void main(String[] args) {

        Optional<String> user1 = getUserInitials(3);
        System.out.println("User Initial: " + user1.orElse("Unknown User"));

        Optional<String> user2 = getUserInitials(-1);
        System.out.println("User Initial: " + user2.orElse("Unknown User"));
    }

    public static Optional<String> getUserInitials(int id) {
        if (id <= 0) {
            return Optional.empty();
        }

        List<User> users = new ArrayList<>();
        users.add(new User(1, "Rick", "Hierrezuelo"));
        users.add(new User(2, "Portia", "Lam"));
        users.add(new User(3, "Mike", "Dorn"));
        users.add(new User(4, "Anna", "DeJesus"));

        Optional<User> user = users.stream()
                .filter(u ->u.getId() == id).findFirst();

        String firstName = user.map(User::getFirstName)
                .orElse("Unknown");

        String lastname = user.map(User::getLastName)
                .orElse("Unknown");

        StringBuilder sb = new StringBuilder();
        sb.append(firstName.charAt(0));
        sb.append(lastname.charAt(0));

        return Optional.of(sb.toString().toUpperCase());

    }
}
