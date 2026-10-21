import java.util.*;
import java.util.stream.*;

public class W3_Day6_Lambdas {
//    public static void main(String[] args) {
//        // Reuse your Student record and GradeLevel enum — copy them here
//
//        List<Student> roster = new ArrayList<>();
//
//        // 1. Add the same 8+ students as before
//        //    Use new Student("Name", GradeLevel.X, grade)
//        roster.add(new Student("Diana", GradeLevel.SENIOR, 96));
//        roster.add(new Student("Charlie", GradeLevel.JUNIOR, 85));
//        roster.add(new Student("Alice", GradeLevel.SOPHOMORE, 92));
//        roster.add(new Student("Bob", GradeLevel.FRESHMAN, 78));
//        roster.add(new Student("Grace", GradeLevel.SENIOR, 94));
//        roster.add(new Student("Eve", GradeLevel.FRESHMAN, 71));
//        roster.add(new Student("Heidi", GradeLevel.JUNIOR, 63));
//        roster.add(new Student("Frank", GradeLevel.SOPHOMORE, 88));
//
//        // 2. Print total students (simple)
//        System.out.println("Total students: " + roster.size());
//
//        // 3. Print all students using stream + forEach + method reference
//        System.out.println("\nAll students (method reference):");
//        roster.stream()
//                .forEach(System.out::println);
////        roster.stream().forEach(student -> System.out.printf("%-10s  %-10s %3d%n",
////                student.name(),
////                "(" +student.level() + ")",
////                student.grade()));
//
//
//        // 4. Print average grade using stream (mapToDouble + average)
//        double averageScore = roster.stream()
//                .mapToInt(Student::grade)
//                .average()
//                .orElse(0.0);
//
//        System.out.printf("%nAverage grade: %.2f%n", averageScore);
//
//        // 5. Print only seniors using filter
//        System.out.println("\nSeniors only:");
//        roster.stream()
//                .filter(s -> s.level() == GradeLevel.SENIOR)
//                .sorted(Comparator.comparing(Student::name))
//                .forEach(System.out::println);
////              .forEach(student -> System.out.printf("%-10s  %-10s %3d%n",
////                        student.name(),
////                        "(" +student.level() + ")",
////                        student.grade()));
//
//        // 6. Print students sorted by grade descending (highest first)
//        System.out.println("\nSorted by grade (descending):");
//        roster.stream()
//                .sorted(Comparator.comparing(Student::grade).reversed())
//                .forEach(System.out::println);
////              .forEach(student -> System.out.printf("%-10s  %-10s %3d%n",
////                        student.name(),
////                        "(" +student.level() + ")",
////                        student.grade()));
//
//        // 7. Print students sorted by name alphabetically
//        System.out.println("\nSorted by name:");
//        roster.stream()
//                .sorted(Comparator.comparing(Student::name))
//                .forEach(System.out::println);
////                .forEach(student -> System.out.printf("%-10s  %-10s %3d%n",
////                        student.name(),
////                        "(" +student.level() + ")",
////                        student.grade()));
//
//        // 8. Bonus: Print the top student (highest grade) using max
//        System.out.println("\n=== FINAL LAMBDA REPORT ===");
//        roster.stream()
//                .max(Comparator.comparing(Student::grade))
//                .ifPresent(student -> System.out.printf("%-10s %3d%n",
//                        "Top student: " + student.name() + " with",
//                         student.grade()));
//
//        System.out.println("\n=== FINAL LAMBDA REPORT ===");
//        // Final pretty print using stream
//    }
}

// Copy your GradeLevel enum here (from Day 4/5)
//enum GradeLevel {
//    FRESHMAN(1), SOPHOMORE(2), JUNIOR(3), SENIOR(4);
//    private final int year;
//    GradeLevel(int year) { this.year = year; }
//    public int getYear() { return year; }
//}
//
//// Copy your Student record here (from Day 5)
//record Student(String name, GradeLevel level, int grade) {
//    public Student {
//        if (grade < 0 || grade > 100) {
//            throw new IllegalArgumentException("Grade must be 0-100");
//        }
//        if (name == null || name.isBlank()) {
//            throw new IllegalArgumentException("Name required");
//        }
//    }
//
//    @Override
//    public String toString() {
//        return name + " (" + level + ") " + grade;
//    }
//}
