public class WeekendExercise3_CharacterTypes {
    public static void main(String[] args) {
        countCharacterTypes("Java17!");
    }

    public static void countCharacterTypes(String text) {
        int upperCaseCount = 0;
        int lowerCaseCount = 0;
        int digitCount = 0;
        int otherCount = 0;

        for (int i = 0; i < text.length(); i++) {

          if (text.charAt(i) >= 'a' && text.charAt(i) <= 'z' ||
                    text.charAt(i) >= 'A' && text.charAt(i) <= 'Z') {
              if (Character.isUpperCase(text.charAt(i))) {
                    upperCaseCount++;
              } else {
                    lowerCaseCount++;
              }
          } else if (text.charAt(i) >= '0' && text.charAt(i) <= '9') {
                digitCount++;
          } else {
                otherCount++;
          }
        }

        System.out.println("Uppercase: " + upperCaseCount);
        System.out.println("Lowercase: " + lowerCaseCount);
        System.out.println("Digits: " + digitCount);
        System.out.println("Other: " + otherCount);

    }
}
