import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class FindTopStudent {
    public static void main(String[] args) {

        List<Student> students = new ArrayList();
        students.add(new Student("Rick", 90, "IT"));
        students.add(new Student("Portia", 85, "IT"));
        students.add(new Student("Mike", 85, "Math"));
        students.add(new Student("Anna", 95, "Math"));
        students.add(new Student("Henry", 70, "Math"));

        Optional<Student> student = findTopStudent(students);

        String name = student.map(Student::getName)
                       .orElse("Unknown Student");

        int topGrade = student.map(Student::getGrade)
                        .orElse(0);

        System.out.printf("Top student: %s by Grade: %s%n", name, topGrade);
    }

    public static Optional<Student> findTopStudent(List<Student> students) {
        if (students == null || students.isEmpty())
            return Optional.empty();

        Optional<Student>  student = students.stream()
                .max(Comparator.comparingInt(Student::getGrade));

        return student;
    }


}
