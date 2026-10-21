import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Day5_FunctionalInterfaces {
    public static void main(String[] args) {
        List<Student> roster = new ArrayList<>();
        // Add students (use your previous list)
        roster.add(new Student("Alice", GradeLevel.SOPHOMORE, 92));
        roster.add(new Student("Bob", GradeLevel.FRESHMAN, 78));
        roster.add(new Student("Charlie", GradeLevel.JUNIOR, 85));
        roster.add(new Student("Diana", GradeLevel.SENIOR, 96));
        roster.add(new Student("Eve", GradeLevel.FRESHMAN, 71));
        roster.add(new Student("Frank", GradeLevel.SOPHOMORE, 88));
        roster.add(new Student("Grace", GradeLevel.SENIOR, 94));
        roster.add(new Student("Heidi", GradeLevel.JUNIOR, 63));

        // PART 1: Built-in Functional Interfaces Demo

        // 1. Predicate<Student> — test if student is senior
        Predicate<Student> isSenior = s -> s.level() == GradeLevel.SENIOR;
        System.out.println("Seniors count: " + countMatching(roster, isSenior));

        // 2. Function<Student, String> — get name + grade string
        Function<Student, String> toSummary = s -> s.name() + ": " + s.grade();
        System.out.println("\nSummaries:");
        roster.stream().map(toSummary).forEach(System.out::println);

        // 3. Consumer<Student> — print high-grade students
        Consumer<Student> printHigh = s -> {
            if (s.grade() >= 90) {
                System.out.println("High grade: " + s);
            }
        };
        System.out.println("\nHigh-grade students:");
        roster.forEach(printHigh);

        // 4. Supplier<Student> — create default student
        Supplier<Student> defaultStudent = () -> new Student("Guest", GradeLevel.FRESHMAN, 70);
        System.out.println("\nDefault student: " + defaultStudent.get());

        // PART 2: Custom Functional Interface
        // Define a custom interface for grading rules
        @FunctionalInterface
        interface GradeRule {
            boolean apply(Student student);
            default GradeRule and(GradeRule other) {
                return s -> this.apply(s) && other.apply(s);
            }
        }

        GradeRule highGrade = s -> s.grade() >= 90;
        GradeRule senior = s -> s.level() == GradeLevel.SENIOR;

        GradeRule highSenior = highGrade.and(senior);

        System.out.println("\nHigh-grade seniors:");
        roster.stream()
                .filter(highSenior::apply)
                .forEach(System.out::println);

        System.out.println("\n=== FUNCTIONAL INTERFACES DEMO COMPLETE ===");

        // PART 3: LeetCode-Style Problem
        // "Sort Characters By Frequency" (Medium — LeetCode #451)
        // Given a string s, sort it in decreasing order based on the frequency of characters.

        String s = "bbbddddd";
        // Expected: "eert" (e appears twice, r and t once)

        String result = frequencySort(s);
        System.out.println("Frequency sorted: " + result);
    }

    // YOUR TASK: Implement frequencySort using streams & collectors
    // Hint: group by char → count → sort by count descending → join
    public static String frequencySort(String s) {
        // TODO: Your solution here
        if (s == null || s.isEmpty()) {
            return "Cannot be null or empty";
        }

        // Step 1: Count frequency
        int[] count = new int[256];
        for (char c : s.toCharArray()) {
            count[c]++;
        }

        // Step 2: PriorityQueue (max-heap) sorted by frequency descending
        PriorityQueue<Character> pq = new PriorityQueue<>((a, b) -> count[b] - count[a]);

        // Add each unique char that appears
        for (int i = 0; i < 256; i++) {
            if (count[i] > 0) {
                pq.offer((char) i);
            }
        }

        // Step 3: Build result
        StringBuilder sb = new StringBuilder();
        while (!pq.isEmpty()) {
            char c = pq.poll();
            sb.append(String.valueOf(c).repeat(count[c]));
        }

        return sb.toString();
    }

    // Helper: count matching students with Predicate
    private static long countMatching(List<Student> roster, Predicate<Student> predicate) {
        return roster.stream().filter(predicate).count();
    }
}



