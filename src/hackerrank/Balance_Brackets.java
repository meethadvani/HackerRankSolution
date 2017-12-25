/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author meet
 */
//Question Link : https://www.hackerrank.com/challenges/ctci-balanced-brackets/problem

public class Balance_Brackets {

    public static boolean isBalanced(String expression) {
        Stack<String> stackBracket = new Stack<String>();
        if (expression.length() % 2 != 0) {
            return false;
        }
        for (int i = 0; i < expression.length(); i++) {
            if (!stackBracket.empty()) {
                String bracket = stackBracket.peek() + expression.charAt(i);
                if (bracket.equals("[]") || bracket.equals("{}") || bracket.equals("()")) {
                    stackBracket.pop();
                } else {
                    stackBracket.push(expression.charAt(i) + "");
                }
            } else {
                stackBracket.push(expression.charAt(i) + "");
            }
        }
        return stackBracket.empty();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            String expression = in.next();
            System.out.println((isBalanced(expression)) ? "YES" : "NO");
        }
    }

}
