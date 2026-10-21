public class JavaRebootDay4 {
    public static void main(String[] args) {

        System.out.println("10 -> " + isPositive(10));
        System.out.println("-5 -> " + isPositive(-5));
        System.out.println("0 -> " + isPositive(0));
        System.out.println("------------------------------");
        System.out.println("Result -> " + String.format("%.2f", calculateTotal(12.50, 4)));
        System.out.println("------------------------------");
        System.out.println("Positive Number Count: " + countPositiveNumbers(5));
        System.out.println("------------------------------");
        System.out.println("Price: " + calculateFinalPrice(100, 10));
        System.out.println("Price: " + calculateFinalPrice(200, 25));
        System.out.println("Price: " + calculateFinalPrice(50, 0));
        System.out.println("------------------------------");
        System.out.println("0 -> " + isValidAge(0));
        System.out.println("42 -> " + isValidAge(42));
        System.out.println("120 -> " + isValidAge(120));
        System.out.println("121 -> " + isValidAge(121));
        System.out.println("-1 -> " + isValidAge(-1));
        System.out.println("------------------------------");
        System.out.println("0 -> " + getAgeStatus(0));
        System.out.println("17 -> " + getAgeStatus(17));
        System.out.println("18 -> " + getAgeStatus(18));
        System.out.println("42 -> " + getAgeStatus(42));
        System.out.println("120 -> " + getAgeStatus(120));
        System.out.println("121 -> " + getAgeStatus(121));
        System.out.println("-1 -> " + getAgeStatus(-1));
        System.out.println("------------------------------");
        System.out.println("orderTotal = 75.00, premiumMember = false → " + hasFreeShipping(75.00, false));
        System.out.println("orderTotal = 25.00, premiumMember = true → " + hasFreeShipping(25.00, true));
        System.out.println("orderTotal = 25.00, premiumMember = false → " + hasFreeShipping(25.00, false));
        System.out.println("orderTotal = 50.00, premiumMember = false → " + hasFreeShipping(50.00, false));
        System.out.println("------------------------------");
        System.out.println(getShippingStatus(75.00, 2, false));
        System.out.println(getShippingStatus(25.00, 1, true));
        System.out.println(getShippingStatus(25.00, 1, false));
        System.out.println(getShippingStatus(50.00, 1, false));
        System.out.println(getShippingStatus(75.00, 0, true));
        System.out.println(getShippingStatus(0.00, 2, false));
    }

    public static boolean isPositive(int number) {
        return number > 0;
    }

    public static double calculateTotal(double price, int quantity) {
        return price * quantity;
    }

    public static int countPositiveNumbers(int n) {
        int count = 0;

        for (int i = -n; i <= n; i++) {
            if (isPositive(i)) {
                count++;
            }
        }
        return count;
    }

    public static int calculateFinalPrice(int price, int discountPercent) {
        return price - calculateDiscountPrice(price, discountPercent);
    }

    public static int calculateDiscountPrice(int price, int discountPercent) {
        double percent = ((double) discountPercent / 100);
        return (int)(price * percent);
    }

    public static boolean isValidAge(int age) {
        return (age >= 0 && age <= 120);
    }

    public static String getAgeStatus(int age) {
        if (isValidAge(age)) {
            return (age >= 18) ? "Adult" : "Minor";
        } else {
            return "Invalid";
        }
    }

    public static boolean hasFreeShipping(double orderTotal, boolean premiumMember) {
        return (orderTotal >= 50 || premiumMember);
    }

    public static boolean isValidOrder(double orderTotal, int quantity) {
        return (orderTotal > 0 && quantity > 0);
    }

    public static String getShippingStatus(
                           double orderTotal,
                           int quantity,
                           boolean premiumMember) {

        if (isValidOrder(orderTotal, quantity)) {
             return hasFreeShipping(orderTotal, premiumMember) ? "Free Shipping" : "Shipping Required";
        } else {
            return "Invalid Order";
        }
    }

}
