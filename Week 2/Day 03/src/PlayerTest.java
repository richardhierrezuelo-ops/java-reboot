// Create a Player class with name, score, and level.
// Sort players by:
// Score descending (highest score first)
//Level descending (highest level first) if scores are equal
//Name alphabetically (ascending) if both score and level are equal

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class PlayerTest {

    public static void main(String[] args) {
        Player p1 = new Player("Rick", 100, 5);
        Player p2 = new Player("Portia", 90, 4);
        Player p3 = new Player("Mike", 100, 5);
        Player p4 = new Player("Anna", 95, 4);
        Player p5 = new Player("Angel ", 100, 3);

        List<Player> players = new ArrayList<Player>();
        players.add(p1);
        players.add(p2);
        players.add(p3);
        players.add(p4);
        players.add(p5);

        players.sort(Comparator.comparing(Player::getScore, Comparator.reverseOrder())
                .thenComparing(Player::getLevel, Comparator.reverseOrder())
                .thenComparing(Player::getName));

        for (Player p: players) {
            System.out.println(p);
        }
    }
}
