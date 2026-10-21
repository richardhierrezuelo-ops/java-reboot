public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Rick", 35, 95);
        Student s2 = new Student("Portia", 33, 55);
        Student s3 = new Student("Anna", 55, 75);


        System.out.println(s1.getName() + " is " + s1.getAge() + " years old.  Grade: " + s1.getGrade() + " Passed: " + s1.isPassing());
        System.out.println(s2.getName() + " is " + s2.getAge() + " years old.  Grade: " + s2.getGrade() + " Passed: " + s2.isPassing());
        System.out.println(s3.getName() + " is " + s3.getAge() + " years old.  Grade: " + s3.getGrade() + " Passed: " + s3.isPassing());
    }
}
