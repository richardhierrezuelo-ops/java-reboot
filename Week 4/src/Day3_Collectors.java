import java.util.*;
import java.util.stream.*;

public class Day3_Collectors {
    public static void main(String[] args) {
        // Reuse your Student record & GradeLevel enum — copy them here

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

        // PART 1: Collectors Demo

        // 1. Group students by GradeLevel → Map<GradeLevel, List<Student>>
        Map<GradeLevel, List<Student>> byLevel = roster.stream()
                .collect(Collectors.groupingBy(Student::level));

        System.out.println("Students by level:");
        byLevel.forEach((level, students) ->
                System.out.println(level + ": " + students.size() + " students"));

        // 2. Count students per level
        Map<GradeLevel, Long> countByLevel = roster.stream()
                .collect(Collectors.groupingBy(Student::level, Collectors.counting()));

        System.out.println("\nCount by level:");
        countByLevel.forEach((level, count) ->
                System.out.println(level + ": " + count));

        // 3. Average grade per level
        Map<GradeLevel, Double> avgByLevel = roster.stream()
                .collect(Collectors.groupingBy(
                        Student::level,
                        Collectors.averagingInt(Student::grade)
                ));

        System.out.println("\nAverage grade by level:");
        avgByLevel.forEach((level, avg) ->
                System.out.printf("%s: %.2f%n", level, avg));

        // 4. Partition students: passing (>=70) vs failing
        Map<Boolean, List<Student>> passingFailing = roster.stream()
                .collect(Collectors.partitioningBy(s -> s.grade() >= 70));

        System.out.println("\nPassing (>=70): " + passingFailing.get(true).size());
        System.out.println("Failing: " + passingFailing.get(false).size());

        // 5. Join names into a comma-separated string
        String allNames = roster.stream()
                .map(Student::name)
                .collect(Collectors.joining(", "));

        System.out.println("\nAll names: " + allNames);

        System.out.println("\n=== COLLECTORS DEMO COMPLETE ===");

        // PART 2: LeetCode-Style Problem
        // "Group Anagrams" (Medium — LeetCode #49)
        // Given an array of strings strs, group the anagrams together
        // Return the groups in any order

        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};

        // Expected output:
        // [["eat","tea","ate"], ["tan","nat"], ["bat"]]

        List<List<String>> groups = groupAnagrams(strs);
        System.out.println("Anagram groups:");
        groups.forEach(System.out::println);
    }

    // YOUR TASK: Implement groupAnagrams using streams & collectors
    // Hint: sort each string's characters to create a key
    public static List<List<String>> groupAnagrams(String[] strs) {
        // TODO: Your solution here
        HashMap<String, List<String>> map = new HashMap<>();

        for(String str: strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);

//           map.computeIfAbsent(key, k -> new ArrayList<>()).add(str);

            if (!map.containsKey(key)) {
                List<String> list = new ArrayList<>();
                list.add(str);
                map.put(key, list);
            } else {
                map.get(key).add(str);
            }
        }

        return new ArrayList<>(map.values());

    }
}