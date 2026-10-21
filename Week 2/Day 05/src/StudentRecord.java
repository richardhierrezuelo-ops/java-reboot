//Exercise 1: Record
//Create a StudentRecord record with name, age, and grade.
//Add a method isPassing() inside the record.

public record StudentRecord(String name, int age, int grade) {

    public boolean isPassing() {
         return grade >=60;
    }

    // You can add validation in compact constructor if needed
    public StudentRecord {
        if (grade < 0 || grade > 100) {
            throw new IllegalArgumentException("Grade must be between 0 and 100");
        }
    }
}
