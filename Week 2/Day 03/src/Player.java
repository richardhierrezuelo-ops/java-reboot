//Create a Player class with name, score, and level.
// Sort players by:
// Score descending (highest score first)
// Level descending (highest level first) if scores are equal
// Name alphabetically (ascending) if both score and level are equal

public class Player {
    private String name;
    private int score;
    private int level;

    public Player(String name, int score, int level) {
        this.name = name;
        this.score = score;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public int getLevel() {
        return level;
    }

    @Override
    public String toString() {
        return String.format("%s | Score: %d | Level: %d", name, score, level);
    }
}
