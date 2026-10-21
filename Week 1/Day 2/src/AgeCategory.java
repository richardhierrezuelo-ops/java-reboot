public class AgeCategory {
    public static void main(String[] args) {

        System.out.println("Age 10 is: " + getAgeCategory(10));
        System.out.println("Age 15 is: " + getAgeCategory(15));
        System.out.println("Age 30 is: " + getAgeCategory(30));
        System.out.println("Age 70 is: " + getAgeCategory(70));
    }

    public static String getAgeCategory(int age) {
        if (age < 13) {
            return "Child";
        } else if (age >= 13 && age <= 17) {
            return "Teenager";
        } else if(age >= 18 && age <= 64) {
            return "Adult";
        } else {
            return "Senior";
        }
    }
}
