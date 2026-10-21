public class VowelCount {
    public static void main(String[] args) {
        var sentence = "Hello World";

        System.out.println(sentence);
        System.out.println("Count: " + getCount(sentence));
    }


//    Return the number (count) of vowels in the given string.
//
//We will consider a, e, i, o, u as vowels for this Kata (but not y).
//
//The input string will only consist of lower case letters and/or spaces.

    public static int getCount(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }

        int count = 0;
        String vowels = "aeiouAEIOU";

        for (char ch : str.toCharArray()) {
            if (vowels.indexOf(ch) != -1) {
                count++;
            }
        }
        return count;
    }

}
