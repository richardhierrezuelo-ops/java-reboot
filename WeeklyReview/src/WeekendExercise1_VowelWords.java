public class WeekendExercise1_VowelWords {
    public static void main(String[] args) {
        System.out.println("Apple is orange -> " + countVowelWords("Apple is orange"));
        System.out.println("Java is fun -> " + countVowelWords("Java is fun"));
        System.out.println("An excellent engineer -> " + countVowelWords("An excellent engineer"));
        System.out.println("Hello world -> " + countVowelWords("Hello world"));
    }

    public static int countVowelWords(String text) {
        int count = 0;

        String[] words = text.split(" ");

        for (int i = 0; i < words.length; i++) {
            String firstLetter = words[i].substring(0, 1);

            if (firstLetter.equalsIgnoreCase("a") ||
                    firstLetter.equalsIgnoreCase("e") ||
                    firstLetter.equalsIgnoreCase("i") ||
                    firstLetter.equalsIgnoreCase("o") ||
                    firstLetter.equalsIgnoreCase("u")) {

                count++;
            }
        }

        return count;
    }
}
