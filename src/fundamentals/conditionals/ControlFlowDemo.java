package fundamentals.conditionals;

public class ControlFlowDemo {

    public static void main(String[] args) {
        int score = 85;

        // Traditional if-else
        if (score >= 90) {
            System.out.println("Grade: A");
        } else if (score >= 80) {
            System.out.println("Grade: B");
        } else if (score >= 70) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: F");
        }

        // Modern Switch Expression (Java 14+)
        String grade = switch (score / 10) {
            case 10, 9 -> "A";
            case 8 -> "B";
            case 7 -> "C";
            default -> "F";
        };

        System.out.println("Grade using switch: " + grade);
    }
}
