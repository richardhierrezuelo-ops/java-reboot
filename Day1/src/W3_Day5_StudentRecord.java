import java.text.DecimalFormat;
import java.util.*;

public class W3_Day5_StudentRecord {

//    public static void main(String[] args) {
//        // 1. Create a List<Student> instead of Map
//        //    Use ArrayList or List.of() for immutability
//        List<Student> roster = new ArrayList<Student>();
//
//        // 2. Add at least 8 students using the record
//        //    Example: new Student("Alice", GradeLevel.SOPHOMORE, 92)
//        roster.add(new Student("Charlie", GradeLevel.JUNIOR, 85));
//        roster.add(new Student("Alice", GradeLevel.SOPHOMORE, 92));
//        roster.add(new Student("Bob", GradeLevel.FRESHMAN, 78));
//        roster.add(new Student("Diana", GradeLevel.SENIOR, 96));
//        roster.add(new Student("Grace", GradeLevel.SENIOR, 94));
//        roster.add(new Student("Eve", GradeLevel.FRESHMAN, 71));
//        roster.add(new Student("Heidi", GradeLevel.JUNIOR, 63));
//        roster.add(new Student("Frank", GradeLevel.SOPHOMORE, 88));
//        roster.add(new Student("Alice", GradeLevel.SOPHOMORE, 92));
//
//        // 3. Print total number of students
//        System.out.println("Total students: " + roster.size());
//
//        // 4. Print the roster (sorted by name if you want bonus points)
//        System.out.println("\n=== STUDENT REPORT ===");
//        roster.sort(Comparator.comparing(Student::name));
//        for (Student student : roster) {
//            System.out.println(student.name() + " (" + student.level() + ") " + student.grade()) ;
//        }
//
//        // 5. Print average grade (as double, 2 decimals)
//        int totalScore = 0;
//        double averageScore = 0;
//        for (Student student : roster) {
//            totalScore += student.grade();
//        }
//        averageScore  = (double) totalScore / roster.size();
//        DecimalFormat df = new DecimalFormat("#.00");
//        String formattedValue = df.format(averageScore);
//        System.out.println("\nAverage grade: " + formattedValue);
//        System.out.printf("%nAverage grade: %.2f%n", averageScore);
//
//        // 6. Print all seniors with their grades
//        System.out.println("\n=== SENIORS ===");
//        for (Student student : roster) {
//            if (student.level() == GradeLevel.SENIOR) {
//                System.out.println(student.name() + " (" + student.level() + ") " + student.grade()) ;
//
//            }
//        }
//
//        // 7. Demonstrate record features:
//        //    - Use .toString() automatically
//        //    - Test equals() with two identical students
//        //    - Try to modify a field (should not compile)
//
//        System.out.println("\n=== FINAL STUDENT REPORT ===");
//        // Final pretty print
//        System.out.println(roster.get(0).toString());
//        boolean areEqual = roster.get(0).equals(roster.get(1));
//        System.out.println("Two identical students are equal:" + areEqual);
//    }
//}
//
//// Reuse your GradeLevel enum from Day 4 — copy it here!
// enum GradeLevel {
//    FRESHMAN(1),
//    SOPHOMORE(2),
//    JUNIOR(3),
//    SENIOR(4);
//
//    private final int year;
//
//    GradeLevel(int year) {
//        this.year = year;
//    }
//    public int getYear() {
//        return year;
//    }
//}
//
//// YOUR TASK: Create the Student record here
//// It should have three components:
//// - String name
//// - GradeLevel level
//// - int grade (0-100)
//record Student(String name, GradeLevel level, int grade) {
//
//    // Bonus: Add compact constructor with grade validation (0-100)
//    public Student {
//        if (grade < 0 || grade > 100) {
//            throw new IllegalArgumentException("Grade must be 0-100");
//        }
//        if (name == null || name.isBlank()) {
//            throw new IllegalArgumentException("Name required");
//        }
//    }
}

