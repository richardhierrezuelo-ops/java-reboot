import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class W2_Day7_StudentRegistry {
    public static void main(String[] args) {

        // GOAL: Build a complete student grade registry using HashMap
        // Use PROPER style: Map<String, Integer> on the left!

        // 1. Create a HashMap: student name (String) → grade (Integer 0-100)
        Map<String, Integer> studentRegistry = new HashMap<>();

        // 2. Add at least 8 students with realistic grades
        //    Example: "Alice" → 92, "Bob" → 78, etc.
        studentRegistry.put("Alice", 92);
        studentRegistry.put("Bob", 78);
        studentRegistry.put("Charlie", 85);
        studentRegistry.put("Diana", 96);
        studentRegistry.put("Eve", 71);
        studentRegistry.put("Frank", 88);
        studentRegistry.put("Grace", 94);
        studentRegistry.put("Heidi", 63);

        // 3. Print the total number of students
        System.out.println("Total Students: " + studentRegistry.size());

        // 4. Print the entire registry neatly:
        //    "Alice     : 92 ★"
        //    "Bob       : 78"
        //    Use printf or String formatting

        System.out.println("\n=== STUDENT REGISTRY ===");
        for(Map.Entry<String, Integer> entry : studentRegistry.entrySet()) {
            String studentName = entry.getKey();
            int grade = entry.getValue();

            System.out.printf("%-10s : %3d%s%n",
                    studentName,
                    grade,
                    (grade >= 90 ? " ★" : ""));
        }

        // 5. Update one student's grade (e.g. "Charlie" got extra credit)
        System.out.println("\nUpdated Charlie's grade to 90 (Extra Credit)");
        if (studentRegistry.containsKey("Charlie")) {
            studentRegistry.replace("Charlie", 90);
        }

        // 6. Remove one student who dropped the course
        System.out.println("Removed Heidi from registry\n");
        if (studentRegistry.containsKey("Heidi"))
            studentRegistry.remove("Heidi");

        // 7. Find and print the highest score and name of the top student
        Map<String, Integer> highestScore = new HashMap<>();

        int topScore = 0;
        for(Map.Entry<String, Integer> entry : studentRegistry.entrySet()) {
            String studentName = entry.getKey();
            int grade = entry.getValue();
            if (grade > topScore) {
                topScore = grade;
                highestScore.clear();
                highestScore.put(studentName, grade);
            }
        }

        for(Map.Entry<String, Integer> topStudent : highestScore.entrySet()) {
            System.out.println("Top Student: " + topStudent.getKey() + " with " + topStudent.getValue());
        }

        // 8. Calculate and print the class average (as double, 1 decimal)
        int sizeTotal = studentRegistry.size();
        int gradeTotal = 0;

        for(Map.Entry<String, Integer> entry : studentRegistry.entrySet()) {
            int grade = entry.getValue();

            gradeTotal += grade;
        }

        double classAverage = (double) gradeTotal / sizeTotal;

        System.out.printf("Class Average: %.2f\n", classAverage);

        // 9. Print final registry with updated data

        System.out.println("\n=== FINAL REGISTRY ===");
        // Final pretty print (sorted by name optional – bonus points!)
        Map<String, Integer> sortedStudentRegistry = new TreeMap<>();

        for(Map.Entry<String, Integer> entry : studentRegistry.entrySet()) {
            String studentName = entry.getKey();
            int grade = entry.getValue();
            sortedStudentRegistry.put(studentName, grade);
        }
        for(Map.Entry<String, Integer> entry : sortedStudentRegistry.entrySet()) {
            String studentName = entry.getKey();
            int grade = entry.getValue();
            System.out.printf("%-10s : %3d%s%n",
                    studentName,
                    grade,
                    (grade >= 90 ? " ★" : ""));
        }

    }
}
