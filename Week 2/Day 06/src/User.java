public record User(String username, String email, int age) {

    // 2. Compact Constructor (No parenthesis after the name!)
    public User {
        if (age < 13 || age > 120) {
          throw new IllegalArgumentException("Age must be between 13 and 120");

        }

        if (email == null || !email.contains("@")) {
             throw new IllegalArgumentException("Invalid email format");
        }

    }
}
