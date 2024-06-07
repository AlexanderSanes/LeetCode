import java.util.Stack;

public class isValid20 {
    public static boolean isValid(String s) {
        Stack<Character> stack1 = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(')
                stack1.push(')');
            else if (s.charAt(i) == '[')
                stack1.push(']');
            else if (s.charAt(i) == '{')
                stack1.push('}');
            else if (s.charAt(i) == ')' || s.charAt(i) == '}' || s.charAt(i) == ']')
                if (stack1.isEmpty() || stack1.pop() != s.charAt(i)) return false;
        }
        if (stack1.isEmpty()) return true;
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isValid(args[0]));
    }
}
