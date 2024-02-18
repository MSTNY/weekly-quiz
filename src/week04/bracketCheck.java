package week04;

import java.util.Stack;

public class bracketCheck {
    public static void main(String[] args) {
        String example1 = "((())())";
        String example2 = "(()()))(";
        String example3 = "((())";
        String example4 = "()())";

        System.out.println(isCorrect(example1));
        System.out.println(isCorrect(example2));
        System.out.println(isCorrect(example3));
        System.out.println(isCorrect(example4));
    }

    public static boolean isCorrect(String brackets) {
        Stack<Character> bracketStack = new Stack<>();

        for (char bracket : brackets.toCharArray()) {
            if (bracket == '(') {
                bracketStack.push('(');
            } else if (bracket == ')') {
                if (bracketStack.isEmpty()) {
                    return false;
                } else {
                    bracketStack.pop();
                }
            }
        }
        return bracketStack.isEmpty();
    }
}
