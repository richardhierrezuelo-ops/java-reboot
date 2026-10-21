public class WeekendReview_LeapYear {

    public static void main(String[] args) {
        System.out.println("2024 -> " + isLeapYear(2024));
        System.out.println("1900 -> " + isLeapYear(1900));
        System.out.println("2000 -> " + isLeapYear(2000));
        System.out.println("2025 -> " + isLeapYear(2025));
        System.out.println("2400 -> " + isLeapYear(2400));
    }

    public static boolean isLeapYear(int year) {

        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }
}
