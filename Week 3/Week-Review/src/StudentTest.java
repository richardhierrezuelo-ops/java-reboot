import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class StudentTest {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student("Rick", 76));
        students.add(new Student("Portia", 96));
        students.add(new Student("Mike", 55));
        students.add(new Student("Anna", 95));

        Predicate<Integer> isPassing = grade -> grade >= 60;

        Function<Student, String> formatStudent = student ->
                "Name: " + student.name() + ", Grade: " + student.grade();

        for (Student student : students) {
            System.out.println(formatStudent.apply(student));
            System.out.println("Passed: " + isPassing.test(student.grade()));
        }

    }
}
