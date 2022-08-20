package companyProgramms.agoda;

import java.util.Stack;

public class CheckValidParenthsis {
    public static void main(String[] args) {
        System.out.println(validParen(""));
        System.out.println(validParen("()"));
        System.out.println(validParen("()[]{}"));
        System.out.println(validParen("(]"));
        System.out.println(validParen("([)]"));
        System.out.println(validParen("{[]}"));
    }
    private static boolean validParen(String input) {

        if (input.isEmpty()) {
            return true;
        } else {
            Stack<Character> stack = new Stack<>();
            for (int i = 0; i < input.length(); i++) {
                char current = input.charAt(i);
                if (current == '(' || current == '[' || current == '{') {
                    stack.push(current);
                } else {
                    if(stack.isEmpty()) {
                        return false;
                    }
                    char peekChar = stack.peek();
                    if ((current == ')' && peekChar != '(')
                            || (current == '}' && peekChar != '{')
                            || (current == ']' && peekChar != '[')) {
                        return false;  // for a valid input, a close brackets must have an open brackets
                    } else {
                        stack.pop();
                    }
                }
            }
            return true;
        }
    }
}
