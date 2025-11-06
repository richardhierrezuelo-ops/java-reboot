public class Day4_FakeBinary {
    public static void main(String[] args) {

        System.out.println(fakeBin("45385593107843568"));
    }

    //    Given a string of digits, you should replace any digit below 5 with '0'
//    and any digit 5 and above with '1'. Return the resulting string.
//    Note: input will never be an empty string
    public static String fakeBin(String numberString) {
        if (numberString == null || numberString.isEmpty()) {
            return "Invalid input";
        }
        return numberString.replaceAll("[0-4]", "0").replaceAll("[5-9]", "1");
    }

}
