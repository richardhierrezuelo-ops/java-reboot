public record Student(String name, GradeLevel level, int grade) {
    // Bonus: Add compact constructor with grade validation (0-100)
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
