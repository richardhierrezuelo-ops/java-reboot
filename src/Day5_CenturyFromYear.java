//Introduction
//The first century spans from the year 1 up to and including the year 100, the second century - from the year 101 up to and including the year 200, etc.
//
//        Task
//Given a year, return the century it is in.
//Examples
//1705 --> 18
//1900 --> 19
//1601 --> 17
//2000 --> 20
//2742 --> 28


public class Day5_CenturyFromYear {
    public static void main(String[] args) {
        System.out.println("1705 --> " + century(1705));
        System.out.println("1900 --> " + century(1900));
        System.out.println("1601 --> " + century(1601));
        System.out.println("2000 --> " + century(2000));
        System.out.println("89 --> " + century(89));
        System.out.println("2025 --> " + century(2025));

    }

    public static int century(int number) {
        // your code goes here
        int remainder = number % 100;
        if (remainder == 0) {
            return number / 100;
        } else {
            return (number / 100) + 1;
        }
    }
}
