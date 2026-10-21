import java.io.*;
import java.util.*;
import java.util.stream.*;

public class W3_Day7_FinalProject {
    private static final String FILE_NAME = "students_final.txt";

    public static void main(String[] args) {
        List<Student> roster = new ArrayList<>();

        // 1. Load students from file (if exists) *
        loadStudents(roster);

        // 2. If no students loaded, add default ones *
        if (roster.isEmpty()) {
            addDefaultStudents(roster);
            System.out.println("Loaded 0 students from file (file not found).");
        } else {
            System.out.println("Loaded " + roster.size() + " students from file.");
        }

        // 3. Print current roster *
        printRoster(roster, "CURRENT ROSTER");

        // 4. Add a new student (hard-coded for demo) *
        addNewStudent(roster, "Zoe", GradeLevel.SENIOR, 95);

        // 5. Update one student's grade (find by name) *
        updateGrade(roster, "Charlie", 90);

        // 6. Remove one student (find by name) *
        removeStudent(roster, "Heidi");

        // 7. Print updated roster + stats *
        printRoster(roster, "UPDATED ROSTER");
        printStats(roster);

        // 8. Save final roster to file *
        saveStudents(roster);

        System.out.println("\n\n=== PROGRAM COMPLETE ===");
        System.out.println("Data saved to: " + FILE_NAME);
    }

    // 1. Load students from file
    private static void loadStudents(List<Student> roster) {
        // TODO: Read from FILE_NAME
        // Each line: "name:level:grade"
        // Use try-with-resources + BufferedReader or Scanner
        // Parse each line, create Student, add to roster
        // Handle FileNotFoundException gracefully
        // Handle invalid lines (skip or log)

        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if(line.contains(":")) {
                    String[] parts = line.split(":"); // Split only on the first colon
                    String name = parts[0].trim();       // Get key and trim whitespace
                    GradeLevel gradeLevel = GradeLevel.valueOf(parts[1].trim());
                    int grade = Integer.parseInt(parts[2].trim());     // Get value and trim whitespace

                    if (!name.isEmpty()) {
                        roster.add(new Student(name, gradeLevel, grade));
                    }
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("No file found — added default students. ");
        } catch (IOException e) {
            System.err.println("Error reading file: " + FILE_NAME);
            e.printStackTrace();
        }
    }

    // 2. Add default students if file not found
    private static void addDefaultStudents(List<Student> roster) {
        // TODO: Add 8+ default students
        // Use new Student("Name", GradeLevel.X, grade)
        // Example:
        // roster.add(new Student("Alice", GradeLevel.SOPHOMORE, 92));
        roster.add(new Student("Diana", GradeLevel.SENIOR, 96));
        roster.add(new Student("Charlie", GradeLevel.JUNIOR, 85));
        roster.add(new Student("Alice", GradeLevel.SOPHOMORE, 92));
        roster.add(new Student("Bob", GradeLevel.FRESHMAN, 78));
        roster.add(new Student("Grace", GradeLevel.SENIOR, 94));
        roster.add(new Student("Eve", GradeLevel.FRESHMAN, 71));
        roster.add(new Student("Heidi", GradeLevel.JUNIOR, 63));
        roster.add(new Student("Frank", GradeLevel.SOPHOMORE, 88));
    }

    // 3. Add a new student
    private static void addNewStudent(List<Student> roster, String name, GradeLevel level, int grade) {
        // TODO: Create and add new Student
        // Let record validation throw if invalid
        // Print confirmation message
        try {
            roster.add(new Student(name.trim(), level, grade));
            System.out.println("\nAdded new student: " + name + " (" + level + ") " + grade);
        } catch(IllegalArgumentException e) {
            System.out.println("Failed to add student: " + e.getMessage());
        }
    }

    // 4. Update grade by name
    private static void updateGrade(List<Student> roster, String name, int newGrade) {
        // TODO: Find student by name
        // Update grade if found (records are immutable — need to remove old + add new)
        // Print success or "not found"
        Optional<Student> studentOpt = roster.stream()
                .filter(s -> s.name().equalsIgnoreCase(name.trim()))
                .findFirst();

        if (studentOpt.isPresent()) {
            Student old = studentOpt.get();
            roster.remove(old);
            roster.add(new Student(name, old.level(), newGrade));
            System.out.println("Updated " + name + "'s grade to " + newGrade);
        } else {
            System.out.println("Student not found.");
        }
    }

    // 5. Remove student by name
    private static void removeStudent(List<Student> roster, String name) {
        // TODO: Remove student if found
        // Print success or "not found"
        String trimmed = name.trim();

        // removeIf returns true if ANY element was removed
        boolean removed = roster.removeIf(s -> s.name().equalsIgnoreCase(trimmed));

        if (removed) {
            System.out.println("Removed " + trimmed + " from registry");
        } else {
            System.out.println("Student '" + trimmed + "' not found.");
        }

        // Uses ternary operator on the return value; One-liner (but still very readable)
        //  roster.removeIf(s -> s.name().equalsIgnoreCase(trimmed))
        //          ? System.out.println("Removed " + trimmed + " from registry")
        //          : System.out.println("Student '" + trimmed + "' not found.");
    }

    // 6. Print roster with title
    private static void printRoster(List<Student> roster, String title) {
        // TODO: Use stream + forEach + method reference
        // Print title + each student using toString()
        System.out.println("\n" + title);
        roster.stream()
                .sorted(Comparator.comparing(Student::name))
                .forEach(System.out::println);
    }

    // 7. Print stats: top student, average, seniors
    private static void printStats(List<Student> roster) {
        // TODO: Use streams to:
        // - Find top student (max by grade)
        // - Calculate average
        // - Print seniors only
        // Use ifPresent, orElse, etc.
        roster.stream()
                .max(Comparator.comparing(Student::grade))
                .ifPresent(student -> System.out.printf("%-2s %3d",
                        "\nTop student: " + student.name() + " with",
                        student.grade()));

        double averageScore = roster.stream()
                .mapToInt(Student::grade)
                .average()
                .orElse(0.0);

        System.out.printf("%nAverage grade: %.2f%n", averageScore);

//        System.out.println("Seniors:");
//        roster.stream()
//                .filter(s -> s.level() == GradeLevel.SENIOR)
//                .sorted(Comparator.comparing(Student::name))
//              .forEach(student -> System.out.printf("%-2s %3d,",
//                        student.name(),
//                        student.grade()));
// Trailing comma + no spaces after commasBetter (using StringJoiner or stream collector):

        String seniors = roster.stream()
                .filter(s -> s.level() == GradeLevel.SENIOR)
                .map(s -> s.name() + " " + s.grade())
                .collect(Collectors.joining(", "));

        System.out.println("Seniors: " + seniors);
    }

    // 8. Save roster to file
    private static void saveStudents(List<Student> roster) {
        // TODO: Use try-with-resources + PrintWriter
        // Write one line per student: "name:level:grade"
        // Handle IOException
        try (PrintWriter writer = new PrintWriter(FILE_NAME)) {
            roster.sort(Comparator.comparing(Student::name));
            for (Student student : roster) {
                writer.println(student.name() + ":" + student.level() + ":" + student.grade());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Could not save file!");
        }
    }
}

// Copy your GradeLevel enum here
enum GradeLevel {
    FRESHMAN(1), SOPHOMORE(2), JUNIOR(3), SENIOR(4);
    private final int year;
    GradeLevel(int year) { this.year = year; }
    public int getYear() { return year; }
}

// Copy your Student record here
record Student(String name, GradeLevel level, int grade) {
    public Student {
        if (grade < 0 || grade > 100) {
            throw new IllegalArgumentException("Grade must be 0-100");
        }
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name required");
        }
    }

    @Override
    public String toString() {
        return name + " (" + level + ") " + grade;
    }
}
