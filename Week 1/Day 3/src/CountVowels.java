import java.util.ArrayList;
import java.util.List;

public class CountVowels {
    public static void main(String[] args) {
        var sentence = "Hello World";

        System.out.println(sentence);
        int count = countVowels(sentence).size();
        System.out.println(count + " " + countVowels(sentence));
    }

    public static  List<String>  countVowels(String str){
        List<String> results = new ArrayList<>();

        if (str == null || str.isEmpty()) return results;

        for (int i =0; i < str.length(); i++){
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
               results.add(String.valueOf(ch));
            }
        }
        return results;
    }
}
