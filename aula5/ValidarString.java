package aula5;

import java.util.Stack;

public class ValidarString {

    public static void main(String[] args) {
        String stringValida = "(){[()]}";
        String stringInvalida = "(]";
        
        System.out.println("String válida? " + isValid(stringValida));
        System.out.println("String válida? " + isValid(stringInvalida));
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' || c == '}' || c == ']') {
                if (stack.isEmpty() || !isMatchingPair(stack.peek(), c)) {
                    return false;
                }
                stack.pop();
            }
        }

        return stack.isEmpty();
    }

    private static boolean isMatchingPair(char c1, char c2) {
        return (c1 == '(' && c2 == ')') ||
               (c1 == '{' && c2 == '}') ||
               (c1 == '[' && c2 == ']');
    }
}
