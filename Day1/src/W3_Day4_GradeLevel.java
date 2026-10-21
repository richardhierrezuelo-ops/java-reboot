import java.util.*;

public class W3_Day4_GradeLevel {

    public static void main(String[] args) {
        // We will store students with their year level (FRESHMAN, SOPHOMORE, etc.)
        Map<String, GradeLevel_D4> classRoster = new TreeMap<>();

        // 1. Add at least 8 students with different grade levels
        //    Example: classRoster.put("Alice", GradeLevel.SOPHOMORE);
        classRoster.put("Frank", GradeLevel_D4.SOPHOMORE);
        classRoster.put("Bob", GradeLevel_D4.FRESHMAN);
        classRoster.put("Diana", GradeLevel_D4.SENIOR);
        classRoster.put("Charlie", GradeLevel_D4.JUNIOR);
        classRoster.put("Alice", GradeLevel_D4.SOPHOMORE);
        classRoster.put("Grace", GradeLevel_D4.SENIOR);
        classRoster.put("Eve", GradeLevel_D4.FRESHMAN);
        classRoster.put("Heidi", GradeLevel_D4.JUNIOR);

        // 2. Print the total number of students
        System.out.println("Total Number of Students: " + classRoster.size());

        // 3. Print the roster sorted by name (TreeMap helps!)
        //    Format: "Alice     : SOPHOMORE"
        System.out.println("\n=== CLASS ROSTER ===");
        for(Map.Entry<String, GradeLevel_D4> entry : classRoster.entrySet()) {
            String studentName = entry.getKey();
            GradeLevel_D4 grade = entry.getValue();

            System.out.printf("%-10s : %3s%n",
                    studentName,
                    grade.name());
        }

        // 4. Count and print how many students in each grade level
        //    Example: "Freshmen: 2"
        int freshmanCount = 0;
        int sophomoreCount = 0;
        int juniorCount = 0;
        int seniorCount = 0;

        for(Map.Entry<String, GradeLevel_D4> entry : classRoster.entrySet()) {
            GradeLevel_D4 grade = entry.getValue();
            switch (grade) {
                case FRESHMAN:
                    freshmanCount++;
                    break;
                case SOPHOMORE:
                    sophomoreCount++;
                    break;
                case JUNIOR:
                    juniorCount++;
                    break;
                case SENIOR:
                     seniorCount++;
                     break;
                default:
                    break;
            }
        }

        System.out.println("\n=== GRADE LEVEL COUNT ===");
        System.out.println("Freshmen: " + freshmanCount);
        System.out.println("Sophomore: " + sophomoreCount);
        System.out.println("Junior: " + juniorCount);
        System.out.println("Senior: " + seniorCount);

        // 5. Print students who are Seniors (extra credit ready for graduation!)
        System.out.println("\n=== SENIORS (Graduation Eligible) ===");
        // Print only SENIOR students
        for(Map.Entry<String, GradeLevel_D4> entry : classRoster.entrySet()) {
            String studentName = entry.getKey();
            GradeLevel_D4 grade = entry.getValue();

            if (grade.equals(GradeLevel_D4.SENIOR)) {
                System.out.printf("%-10s : %3s%n",
                        studentName,
                        grade.name());
            }
        }

        System.out.println("\n=== FINAL ROSTER ===");
        // Reprint full roster with nice formatting
        for(Map.Entry<String, GradeLevel_D4> entry : classRoster.entrySet()) {
            String studentName = entry.getKey();
            GradeLevel_D4 grade = entry.getValue();

            System.out.printf("%-10s : %3s%n",
                    studentName,
                    grade.name());
        }
    }
}

// YOUR TASK: Create the GradeLevel enum here
// It should have exactly these four values:
// FRESHMAN, SOPHOMORE, JUNIOR, SENIOR
// Bonus: Add a field for the numeric year (1,2,3,4) and a method getYear()
enum GradeLevel_D4 {
    FRESHMAN(1),
    SOPHOMORE(2),
    JUNIOR(3),
    SENIOR(4);

    private final int year;

    GradeLevel_D4(int year) {
        this.year = year;
    }
    public int getYear() {
        return year;
    }
}
