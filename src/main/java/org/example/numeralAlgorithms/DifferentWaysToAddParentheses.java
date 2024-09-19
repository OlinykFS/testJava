package org.example.numeralAlgorithms;

import java.util.ArrayList;
import java.util.List;

public class DifferentWaysToAddParentheses {
    public List<Integer> diffWaysToCompute(String expression) {
    List<Integer> result = new ArrayList<>();
        for(int i = 0; i < expression.length(); i++){
        char c = expression.charAt(i);
        if (c == '+' || c == '-' || c == '*') {
            List<Integer> leftResults = diffWaysToCompute(expression.substring(0, i));
            List<Integer> rightResults = diffWaysToCompute(expression.substring(i + 1));
            for (int left : leftResults) {
                for (int right : rightResults) {
                    int res = 0;
                    switch (c) {
                        case '+':
                            res = left + right;
                            break;
                        case '-':
                            res = left - right;
                            break;
                        case '*':
                            res = left * right;
                            break;
                    }
                    result.add(res);
                }
            }
        }
    }
        if (result.isEmpty()) {
        result.add(Integer.parseInt(expression));
    }
        return result;
}
}
