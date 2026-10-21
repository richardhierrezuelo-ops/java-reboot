package algorithms.arrays;

public class CreatePhoneNumber {
    public static void main(String[] args) {
        System.out.println("Phone Number: " + createPhoneNumber(new int[] {1,2,3,4,5,6,7,8,9,0}));
    }

    public static String createPhoneNumber(int[] numbers) {
        StringBuilder phoneNumber = new StringBuilder("(");

           for (int i = 0; i < numbers.length; i++) {
               if (i==3) phoneNumber.append(") ");
               if (i==6) phoneNumber.append("-");
               phoneNumber.append(numbers[i]);
           }

        return phoneNumber.toString();
    }
}
