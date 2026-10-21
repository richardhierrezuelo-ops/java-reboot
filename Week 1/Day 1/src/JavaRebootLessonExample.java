public class JavaRebootLessonExample {

    public static void main(String[] args) {
        String name = "Richard";
        int age = 35;

        int nextYearAge = calculateNextYearAge(age);

        System.out.println("Name: " + name);
        System.out.println("Current age: " + age);
        System.out.println("Next year: " + nextYearAge);
    }

    public static int calculateNextYearAge(int age) {
        return age + 1;
    }
}
