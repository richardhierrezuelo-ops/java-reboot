import java.util.*;

public class Day2_Collections {
    public static void main(String[] args) {
        // PART 1: Collection Exploration (Quick Demo)

        // 1. HashSet — unique, no order
        Set<String> uniqueNames = new HashSet<>();
        uniqueNames.add("Alice");
        uniqueNames.add("Bob");
        uniqueNames.add("Alice");  // duplicate — ignored
        System.out.println("Unique names: " + uniqueNames);

        // 2. TreeSet — unique + sorted
        SortedSet<Integer> sortedScores = new TreeSet<>();
        sortedScores.add(85);
        sortedScores.add(92);
        sortedScores.add(78);
        System.out.println("Sorted scores: " + sortedScores);

        // 3. LinkedHashSet — unique + insertion order preserved
        Set<String> orderedNames = new LinkedHashSet<>();
        orderedNames.add("Charlie");
        orderedNames.add("Bob");
        orderedNames.add("Alice");
        System.out.println("Insertion order: " + orderedNames);

        // 4. PriorityQueue — min-heap (smallest first)
        Queue<Integer> priorityTasks = new PriorityQueue<>();
        priorityTasks.add(5);
        priorityTasks.add(1);
        priorityTasks.add(8);
        System.out.println("Priority queue (poll smallest): " + priorityTasks.poll());

        // 5. Deque — double-ended queue (stack + queue)
        Deque<String> history = new ArrayDeque<>();
        history.push("Page1");
        history.push("Page2");
        history.push("Page3");
        System.out.println("Back button: " + history.pop());

        System.out.println("\n=== COLLECTIONS DEMO COMPLETE ===");

        // PART 2: First LeetCode-Style Problem
        // "Contains Duplicate" (Easy — LeetCode #217)
        // Given an integer array nums, return true if any value appears at least twice
        // Return false if every element is distinct

        int[] nums1 = {1, 2, 3, 1};     // true
        int[] nums2 = {1, 2, 3, 4};     // false
        int[] nums3 = {1, 1, 1, 3, 3};  // true

        System.out.println("nums1 has duplicate: " + containsDuplicate(nums1));
        System.out.println("nums2 has duplicate: " + containsDuplicate(nums2));
        System.out.println("nums3 has duplicate: " + containsDuplicate(nums3));
    }

    // YOUR TASK: Implement containsDuplicate using a collection
    // Use HashSet or other appropriate collection
    // Aim for O(n) time complexity
    public static boolean containsDuplicate(int[] nums) {
        // TODO: Your solution here
        Set<Integer> uniqueNumbers = new HashSet<>();

        if (nums == null || nums.length == 0) return false;

        for (int element : nums) {
            if (!uniqueNumbers.add(element)) {
                return true;
            }
        }

        return false;

//     Alternative one-liner version (functional style – optional)
//     return Arrays.stream(nums).anyMatch(n -> !uniqueNumbers.add(n));
    }

}
