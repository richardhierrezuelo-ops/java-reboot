public class WeekendExercise2_LeapYear {
    public static void main(String[] args) {
        System.out.println("2024 -> " + isLeapYear(2024));
        System.out.println("2023 -> " + isLeapYear(2023));
        System.out.println("1900 -> " + isLeapYear(1900));
        System.out.println("2000 -> " + isLeapYear(2000));
        System.out.println("2020 -> " + isLeapYear(2020));
    }

    public static boolean isLeapYear(int year) {
        return  year % 400 == 0  || (year % 4 == 0 && year % 100 != 0);
    }
}
