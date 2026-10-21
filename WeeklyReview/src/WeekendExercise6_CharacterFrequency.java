public class WeekendExercise6_CharacterFrequency {

    public static void main(String[] args) {
        printCharacterFrequency("banana");
    }

    public static void printCharacterFrequency(String text) {

        StringBuilder sb = new StringBuilder();

        // Filter out unique letters
        for (int i = 0; i < text.length(); i++) {
            char current = text.charAt(i);

            if (!sb.toString().contains(String.valueOf(current))) {
                sb.append(current);
            }
        }

        String[] letters = sb.toString().split("");

        // Loop through letters, count and print
        for (String letter : letters) {
            int counter = 0;
            for (int j = 0; j < text.length(); j++) {
                if (letter.equals(Character.toString(text.charAt(j)))) {
                    counter++;
                }
            }
            System.out.println(letter + ": " + counter);
        }
    }
}
