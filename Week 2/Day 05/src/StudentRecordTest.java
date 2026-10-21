public class StudentRecordTest {

    public static void main(String[] args) {
        StudentRecord student = new StudentRecord("Rick", 35, 95);
        System.out.println(student);
        System.out.println("Name: "+student.name());
        System.out.println("Age: "+student.age());
        System.out.println("Grade: "+student.grade());
        System.out.println("Passed: " + student.isPassing());
    }
}
