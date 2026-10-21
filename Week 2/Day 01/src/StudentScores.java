//Exercise 3: Student Scores (HashMap)Create a class (e.g. StudentScores) with a HashMap<String, Integer> inside.
// Methods to implement:
//addScore(String studentName, int score)
//getScore(String studentName)
//getAverageScore() — returns the average of all students

import java.util.HashMap;

public class StudentScores {
    private static HashMap<String, Integer> scores = new HashMap<String, Integer>();

    public static void main(String[] args) {
        try {
            addScore("Rick", 95);
            addScore("Portia", 80);
            addScore("Mike", 75);
            addScore("Anna", 85);

            System.out.println("Mike's Score: " + getScore("Mike"));
            System.out.println("Average Score: " + getAverageScore());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void addScore(String studentName, int score) {
        if (studentName != null  && studentName.length() > 0 && score >0) {
            scores.put(studentName, score);
        } else {
            throw new IllegalArgumentException("Student Name or Score cannot be empty");
        }
    }

    public static int getScore(String studentName) {
        if (studentName != null && scores.containsKey(studentName))  {
            return scores.get(studentName);
        }
        return 0;
    }

    public static double getAverageScore() {
        int size = scores.size();
        int sum = 0;
        if (size > 0) {
            for (int score : scores.values()) {
                sum += score;
            }
            return (double) sum / size;
        }
        return 0;

    }

}
