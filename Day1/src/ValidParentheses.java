import java.util.*;

public class ValidParentheses {
    public static boolean isValid(String s) {
        // Stack magic — 6 lines max
        Stack<Character> stack = new Stack<>();

        Map<Character, Character> pairs  = new HashMap<>();
        pairs.put(')', '(');
        pairs.put(']', '[');
        pairs.put('}', '{');

        for (char c : s.toCharArray()) {
            if (pairs.containsKey(c)) {
                if (stack.isEmpty() || pairs.get(c) != stack.pop()) {
                    return false;
                }
            } else {
                stack.push(c);
            }
        }


        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isValid("()[]{}")); // true
        System.out.println(isValid("(]"));     // false
    }
}
