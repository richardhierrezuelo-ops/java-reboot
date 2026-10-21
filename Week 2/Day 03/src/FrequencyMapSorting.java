//Given this sentence:
//"java is fun and java is powerful and java is awesome"
// Count word frequency using HashMap
//Print the words sorted by frequency (highest first)

import java.util.*;

public class FrequencyMapSorting {

    public static void main(String[] args) {
        String sentence = "java is fun and java is powerful and java is awesome";
        System.out.println(sentence);
        System.out.println(frequencyMapSorting(sentence));
        HashMap<String, Integer> map = frequencyMapSorting(sentence);
//        TreeMap<String, Integer> sortedMap = new TreeMap<>(Collections.reverseOrder());
//        sortedMap.putAll(map);
//        System.out.println(sortedMap);

        // 1. Dump map data into an ArrayList of Entry objects
        List<Map.Entry<String, Integer>> sortedList = new ArrayList<>(map.entrySet());

        // 2. Sort the ArrayList by value
        sortedList.sort(Map.Entry.<String, Integer>comparingByValue().reversed());

        // 3. Use it immediately
        for (Map.Entry<String, Integer> entry : sortedList) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }

    public static HashMap<String, Integer> frequencyMapSorting(String sentence) {
        HashMap<String, Integer>  map = new HashMap<String, Integer>();

        if (sentence == null || sentence.length() == 0) {
            return map;
        }

        String [] words = sentence.toLowerCase().split(" ");
        for (String word: words) {
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }
        return map;
    }
}
