import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentTest {
    public static void main(String[] args) {
        List<Student> students = new ArrayList();
        students.add(new Student("Rick", 90, "IT"));
        students.add(new Student("Portia", 85, "IT"));
        students.add(new Student("Mike", 85, "Math"));
        students.add(new Student("Anna", 90, "Math"));
        students.add(new Student("Henry", 70, "Math"));

        Map<String, Double> byDepartment = students.stream()
                .collect(Collectors.groupingBy(
                        Student::getDepartment,
                        Collectors.averagingInt(Student::getGrade)));

        System.out.println(byDepartment);
    }
}
