public class WeekendExercise3_FindFirstNonRepeating {
    public static void main(String[] args) {
        System.out.println("swiss -> " + findFirstNonRepeating("swiss"));
        System.out.println("programming -> " + findFirstNonRepeating("programming"));
        System.out.println("aabbccx -> " + findFirstNonRepeating("aabbccx"));
        System.out.println("rrddhh -> " + findFirstNonRepeating("rrddhh"));
    }

    public static char findFirstNonRepeating(String text) {

        for (int i = 0; i < text.length(); i++) {
            char current = text.charAt(i);
            int count = 0;

            for (int j = 0; j < text.length(); j++) {
                if (text.charAt(j) == current) {
                    count++;
                }
            }

            if (count == 1) {
                return current;
            }
        }

        return '\u0000';
    }
}
