import java.util.*;

public class Day4_Optional {
    public static void main(String[] args) {
        // PART 1: Optional Demo with Student data

        List<Student> roster = new ArrayList<>();
        // Add students (use your previous list or fewer for simplicity)
        roster.add(new Student("Alice", GradeLevel.SOPHOMORE, 92));
        roster.add(new Student("Bob", GradeLevel.FRESHMAN, 78));
        roster.add(new Student("Charlie", GradeLevel.JUNIOR, 85));
        roster.add(new Student("Diana", GradeLevel.SENIOR, 96));

        // 1. Find student by name → return Optional<Student>
        Optional<Student> maybeAlice = findStudentByName(roster, "Alice");
        Optional<Student> maybeZoe = findStudentByName(roster, "Zoe");

        // 2. Print name if found, else "Not found"
        System.out.println("Alice: " + maybeAlice.map(Student::name).orElse("Not found"));
        System.out.println("Zoe: " + maybeZoe.map(Student::name).orElse("Not found"));

        // 3. Get grade if found, else default 0
        int aliceGrade = maybeAlice.map(Student::grade).orElse(0);
        System.out.println("Alice's grade (or 0): " + aliceGrade);

        // 4. Throw exception if not found
        try {
            Student diana = maybeAlice.orElseThrow(() -> new NoSuchElementException("Student not found"));
            System.out.println("Diana found: " + diana);
        } catch (NoSuchElementException e) {
            System.out.println(e.getMessage());
        }

        // 5. Chain operations: get level name if student exists and grade >= 90
        String highGradeLevel = maybeAlice
                .filter(s -> s.grade() >= 90)
                .map(s -> s.level().name())
                .orElse("No high-grade student");

        System.out.println("High-grade level: " + highGradeLevel);

        System.out.println("\n=== OPTIONAL DEMO COMPLETE ===");

        // PART 2: LeetCode-Style Problem
        // "Find First and Last Position of Element in Sorted Array" (Medium — LeetCode #34)
        // Given an array of integers nums sorted in non-decreasing order,
        // find the starting and ending position of a given target value.
        // If target is not found, return [-1, -1]

        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;

        // Expected output: [3, 4]

        int[] result = searchRange(nums, target);
        System.out.println("Target " + target + " found at: [" + result[0] + ", " + result[1] + "]");
    }

    // YOUR TASK: Implement findStudentByName
    // Return Optional<Student> — empty if not found
    private static Optional<Student> findStudentByName(List<Student> roster, String name) {
        // TODO: Your solution here
        if (name == null) return Optional.empty();

        Optional<Student>  student = roster.stream().filter(s -> s.name().equals(name)).findFirst();

        return student;
    }

    // YOUR TASK: Implement searchRange (binary search)
    // Return [start, end] or [-1, -1]
    public static int[] searchRange(int[] nums, int target) {
        // TODO: Your solution here
//         int[] nums = {5, 7, 7, 8, 8, 10};
//        int target = 8;

        if (nums == null || nums.length == 0)
            return new int[]{-1, -1};

        int[] result = new int[2];

        int firstOccurrence = findFirstOccurrence(nums, target);
        int lastOccurrence = findLastOccurrence(nums, target);

        if (firstOccurrence != -1 && lastOccurrence != -1) {
            result[0] = firstOccurrence;
            result[1] = lastOccurrence;
            return result;
        } else
            return new int[]{-1, -1};
    }

    public static int findFirstOccurrence(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                result = mid;           // record match
                right = mid - 1;        // keep looking left for earlier match
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return result;
    }

    public static int findLastOccurrence(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                result = mid;
                left = mid + 1;   // ← only difference: search right instead
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return result;
    }
}
