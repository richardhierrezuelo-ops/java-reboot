public class Student {

    private final String name;
    private int grade;
    private String department;
    private String letterGrade;
    private String section;


    public Student(String name, int grade, String department) {
        this.name = name;
        this.grade = grade;
        this.department = department;
    }

    public Student(String name, String letterGrade, String section) {
        this.name = name;
        this.letterGrade = letterGrade;
        this.section = section;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public String getDepartment() {
        return department;
    }

    public String getLetterGrade() {
        return letterGrade;
    }

    public String getSection() {
        return section;
    }

    @Override
    public String toString() {
        if(section == null && letterGrade == null){
            return name + " " + grade + " " + department ;
        } else {
            return name + " " + letterGrade + " " + section;
        }
    }

}
