import java.util.Arrays;

public class SplitStrings {
// Complete the solution so that it splits the string into strings of two characters in
// a list/array (depending on the language you use). If the string contains an
// odd number of characters then it should replace the missing second character of
// the final pair with an underscore ('_').
//
//Examples:
//
//* 'abc' =>  ['ab', 'c_']
//* 'abcdef' => ['ab', 'cd', 'ef']

    public static void main(String[] args) {
        System.out.println("'abc' => " + Arrays.toString(split("abc")));
        System.out.println("'abcdef' => " + Arrays.toString(split("abcdef")));
    }

    public static String[] split(String str) {
        String[] words = null;

        if (str == null || str.isEmpty()) {
            return new String[0];
        }

        if (str.length() % 2 == 0) {
            words = new String[str.length() / 2];
        } else {
            words = new String[str.length() / 2 + 1];
        }

        int x = 0;
        for (int i=0; i<str.length(); i +=2) {    // Loop through the string, jumping by 2 each time
            if (i +1 < str.length()) {
                System.out.println(i);
                words[x] = str.substring(i, i+2);
            } else {
                words[x] = str.substring(i) + "_";
            }
            x++;
        }

        return words;
    }
}


