//Now please submit Exercise 2: Word Frequency (HashMap)Reminder:Take a String sentence
//Count frequency of each word
//Print the result (you can return a Map<String, Integer>)

import java.util.HashMap;
import java.util.Map;

public class WordFrequency {

    public static void main(String[] args) {
        String sentence = "Java is great and Java is fun and Java is powerful";
        System.out.println(getWordFrequency(sentence));

        String sentence2 = "Hello world hello everyone hello again";
        System.out.println(getWordFrequency(sentence2));
    }

    public static Map<String, Integer> getWordFrequency(String sentence) {
        Map<String, Integer> map = new HashMap<>();

        String[] words = sentence.split(" ");
        for (String word : words) {
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }
        return map;
    }
}
