import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StudentSortingTest {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Rick", "A", "Section 1"));
        students.add(new Student("Portia", "B", "Section 2"));
        students.add(new Student("Mike", "A", "Section 1"));
        students.add(new Student("Anna", "A", "Section 3"));

        students.sort(Comparator.comparing(Student::getLetterGrade)
                .thenComparing(Student::getSection, Comparator.reverseOrder())
                .thenComparing(Student::getName));

        for (Student student : students) {
            System.out.println(student);
        }
    }
}
