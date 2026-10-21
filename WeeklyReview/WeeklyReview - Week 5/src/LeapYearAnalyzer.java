public class LeapYearAnalyzer {

    public static void main(String[] args) {

        System.out.println("1999 -> " + isLeapYear(1999));
        System.out.println("2024 -> " + isLeapYear(2024));
        System.out.println("2023 -> " + isLeapYear(2023));
        System.out.println("1900 -> " + isLeapYear(1900));
        System.out.println("2000 -> " + isLeapYear(2000));
        System.out.println("2100 -> " + isLeapYear(2100));
        System.out.println("2400 -> " + isLeapYear(2400));
        System.out.println("0 -> " + isLeapYear(0));
        System.out.println("\n");
        System.out.println("countLeapYears(2000, 2024)  -> "  + countLeapYears(2000, 2024));
        System.out.println("countLeapYears(2021, 2023)  -> "  + countLeapYears(2021, 2023));
        System.out.println("countLeapYears(2024, 2024)  -> "  + countLeapYears(2024, 2024));
        System.out.println("countLeapYears(1900, 1904)  -> "  + countLeapYears(1900, 1904));
        System.out.println("countLeapYears(2000, 1904)  -> "  + countLeapYears(2000, 1904));

    }

    public static boolean isLeapYear(int year) {
        if (year <= 0) {
//            throw new IllegalArgumentException("This is an Invalid Year: " + year);
            return false;
        }

        return (year % 400 == 0  || (year % 4 == 0 && year % 100 != 0) );
    }

    public static int countLeapYears(int startYear, int endYear) {
        if (startYear <= 0) {
//            throw new IllegalArgumentException("This is an Invalid Start Year: " + startYear);
            return -1;
        }

        if (endYear <= 0 || (startYear > endYear) ){
//            throw new IllegalArgumentException("This is an Invalid End Year: " + endYear);
            return -1;
        }

        int count = 0;

        for (int i = startYear; i <= endYear; i++) {
            if (isLeapYear(i)) {
                count++;
            }
        }

        return count;
    }
}
