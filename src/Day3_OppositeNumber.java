public class Day3_OppositeNumber {

    public static int opposite(int number)
    {
        return number * -1;
    }

    public static void main(String[] args) {
        int number = -14;
        System.out.println(number + " " + opposite(number));
    }
}
