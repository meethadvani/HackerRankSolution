/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank.Algorithms;

import java.util.Scanner;

/**
 *
 * @author meet
 */
//Question Link : https://www.hackerrank.com/challenges/funny-string/problem
public class Funny_String {

    static String funnyString(String s) {
        // Complete this function
        boolean flag = false;
        for (int i = 0; i < s.length() - 1; i++) {
            int num1 = Math.abs(s.charAt(i) - s.charAt(i + 1));
            int num2 = Math.abs(s.charAt(s.length() - (i + 1)) - s.charAt(s.length() - (i + 2)));
            if (num1 == num2) {
                flag = true;
            } else {
                flag = false;
                break;
            }
        }
        if (flag) {
            return "Funny";
        } else {
            return "Not Funny";
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for (int a0 = 0; a0 < q; a0++) {
            String s = in.next();
            String result = funnyString(s);
            System.out.println(result);
        }
    }

}
