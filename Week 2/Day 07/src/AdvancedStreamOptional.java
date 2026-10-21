import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class AdvancedStreamOptional {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student("Rick", 95));
        students.add(new Student("Portia", 80));
        students.add(new Student("Mike", 75));
        students.add(new Student("Anna", 100));

        Optional<Student>  topStudent = findStudent(students);

        topStudent.ifPresent(student ->
                System.out.println("Top Student: " + student.getName() + " with " + student.getGrade())
        );
    }

    public static Optional<Student> findStudent(List<Student> students) {
        if (students == null || students.isEmpty()) {
            return Optional.empty();
        }

        Optional<Student>  student = students.stream()
                                     .max(Comparator.comparingInt(Student::getGrade));

         return student;
    }
}
