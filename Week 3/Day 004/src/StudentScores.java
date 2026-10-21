import java.util.HashMap;
import java.util.Map;

public class StudentScores {

    public static void main(String[] args) {
        Map<String, Integer> studentMap = new HashMap<String, Integer>();

        studentMap.put("Rick", 85);
        studentMap.put("John", 90);
        studentMap.put("Portia", 80);
        studentMap.put("Mike", 90);
        studentMap.put("Anna", 80);
    }

    public static void addScore(Map<String, Integer> studentMap, String name, int score) {
        if (studentMap.containsKey(name)) {
            studentMap.replace(name, score);
        }
    }

    public static Integer getScore(Map<String, Integer> studentMap, String name) {
        return studentMap.get(name);
    }

    public static Double getAverageScore(Map<String, Integer> studentMap) {
        Double score = 0.0;
        for (Map.Entry<String, Integer> entry : studentMap.entrySet()) {
            score += entry.getValue();
        }

        return score /  studentMap.size();
    }
}
