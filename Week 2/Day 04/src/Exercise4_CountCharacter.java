public class Exercise4_CountCharacter {

    public static void main(String[] args) {
        System.out.println("\"banana\", 'a' -> " + countCharacter("banana", 'a'));
        System.out.println("\"banana\", 'n' -> " + countCharacter("banana", 'n'));
        System.out.println("\"Java\", 'J' -> " + countCharacter("Java", 'J'));
        System.out.println("\"Java\", 'x' -> " + countCharacter("Java", 'x'));
    }

    public static int countCharacter(String text, char target) {
        int count = 0;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == target) {
                count++;
            }
        }

        return count;
    }
}
