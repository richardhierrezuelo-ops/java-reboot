public class FakeBinary {
    public static void main(String[] args) {
        var digits = "1234567890";

        System.out.println(digits + " -> " + convertToBinary(digits));
        System.out.println("45385593107843568" + " -> " + convertToBinary("45385593107843568"));
    }

    // Given a string of digits, you should replace any digit below 5 with '0'
    // and any digit 5 and above with '1'.
    // Return the resulting string.
    private static String convertToBinary(String digits) {
        if (digits == null || digits.isEmpty()) {
            return "Invalid input";
        }

        return digits.replaceAll("[0-4]", "0").replaceAll("[5-9]", "1");
    }
}
