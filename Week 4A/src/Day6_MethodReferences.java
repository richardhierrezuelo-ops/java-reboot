import java.util.*;
import java.util.function.*;

public class Day6_MethodReferences {
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

        // PART 1: Method References Demo

        // 1. Instance method reference (unbound – correct way)
        Student diana = roster.stream()
                .filter(s -> s.name().equals("Diana"))
                .findFirst()
                .orElseThrow();

        Consumer<Student> printStudent = Student::printInfo;
        printStudent.accept(diana);                    // prints Diana
        printStudent.accept(roster.get(0));            // prints Alice (works on any Student)

        // 2. Static method reference
        roster.forEach(Student::printStaticInfo);      // Class::staticMethod

        // 3. Instance method reference (on arbitrary object)
        Function<Student, String> getName = Student::name;
        roster.stream()
                .map(getName)
                .forEach(System.out::println);

        // 4. Constructor reference using static factory (cleanest for no-arg / default)
        Supplier<Student> newGuest = Student::defaultGuest;
        Student guest = newGuest.get();
        System.out.println("New guest: " + guest);

        // Bonus: Constructor with parameters (using TriFunction)
        @FunctionalInterface
        interface TriFunction<T, U, V, R> {
            R apply(T t, U u, V v);
        }

        TriFunction<String, GradeLevel, Integer, Student> newStudent = Student::new;
        Student custom = newStudent.apply("Test", GradeLevel.JUNIOR, 85);
        System.out.println("Custom student: " + custom);

        System.out.println("\n=== METHOD REFERENCES DEMO COMPLETE ===");

        // PART 2: LeetCode-Style Problem
        // "Sort Array By Parity" (Easy — LeetCode #905)
        int[] nums = {3, 1, 2, 4};
        int[] result = sortArrayByParity(nums);
        System.out.println("Sorted by parity: " + Arrays.toString(result));
    }

    // YOUR TASK: Implement sortArrayByParity using streams + method references
    //     parity in Java (all even numbers before all odd numbers),
    public static int[] sortArrayByParity(int[] nums) {
        if (nums == null || nums.length == 0) {
            return nums;
        }

        List<Integer> evens = new ArrayList<>();
        List<Integer> odds = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                evens.add(nums[i]);
            } else {
                odds.add(nums[i]);
            }
        }

        evens.addAll(odds);

        int[] result = new int[evens.size()];
        for (int i = 0; i < evens.size(); i++) {
            result[i] = evens.get(i);
        }

        return result; // placeholder
    }

}