package org.example;

import java.util.Stack;

public class ValidBracket {

    public static boolean validBrackets(String bracket) {
        if (bracket.isEmpty()) {
            return false;
        }
        Stack<Character> openBrackets = new Stack<>();
        char[] chars = bracket.toCharArray();

        for (char c : chars) {
            if (thisOpenBrackets(c)) {
                openBrackets.push(c);
            } else if (thisCloseBrackets(c)) {
                if (openBrackets.isEmpty()) {
                    return false;
                }
                if (!isMatchingBrackets(openBrackets.pop(), c)) {
                    return false;
                }
            }
        }

        return openBrackets.isEmpty();
    }

    private static boolean thisCloseBrackets(char c) {
        switch (c) {
            case ')':
            case '}':
            case ']':
                return true;
            default:
                return false;
        }
    }

    private static boolean thisOpenBrackets(char c) {
        switch (c) {
            case '(':
            case '{':
            case '[':
                return true;
            default:
                return false;

        }
    }

    private static boolean isMatchingBrackets(char opening, char closing) {
        switch (opening) {
            case '(':
                return closing == ')';
            case '{':
                return closing == '}';
            case '[':
                return closing == ']';
            default:
                return false;
        }
    }
}
