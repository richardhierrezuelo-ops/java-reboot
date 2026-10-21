public class PrintPatterns {
    public static void main(String[] args) {

        for (int i=5; i>=1; i--) {
            if (i ==1) {
                System.out.println("*");
            } else if (i == 2) {
                System.out.println("**");
            } else if (i == 3) {
                System.out.println("***");
            } else if (i == 4) {
                System.out.println("****");
            } else {
                System.out.println("*****");
            }
        }
        System.out.println();

        for (int i=5; i>=1; i--) {
            String pattern = switch (i) {
                case 1 -> "*";
                case 2 -> "**";
                case 3 -> "***";
                case 4 -> "****";
                default -> "*****";
            };
            System.out.println(pattern);
        }

        printDecreasingStars(5);

    }

    public static void printDecreasingStars(int rows) {
        for (int i = rows; i >= 1; i--) {           // Outer loop: controls rows
            for (int j = 1; j <= i; j++) {          // Inner loop: prints stars in current row
                System.out.print("*");
            }
            System.out.println();                   // Move to next line
        }
    }
}
