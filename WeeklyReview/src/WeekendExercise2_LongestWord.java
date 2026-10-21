public class WeekendExercise2_LongestWord {

    public static void main(String[] args) {
        System.out.println("Java is powerful -> " + findLongestWord("Java is powerful"));
        System.out.println("I love coding -> " + findLongestWord("I love coding"));
        System.out.println("Hello World -> " + findLongestWord("Hello World"));
        System.out.println("Playstation is better tnan Xbox -> " + findLongestWord("Playstation is better tnan Xbox"));
    }

    public static String findLongestWord(String text) {

        String[] words = text.split(" ");
        String longestWord = words[0];

        for (int i = 1; i < words.length; i++) {
            if (words[i].length() > longestWord.length()) {
                longestWord =  words[i];
            }
        }

        return longestWord;
    }
}
