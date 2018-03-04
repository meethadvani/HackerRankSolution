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
//Question Link: https://www.hackerrank.com/challenges/camelcase/problem
public class CamelCase {

    static int camelcase(String s) {
        // Complete this function
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 65 && s.charAt(i) <= 90) {
                count++;
            }
        }
        return count + 1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int result = camelcase(s);
        System.out.println(result);
        //second Method
        System.out.println(s.length() - s.replaceAll("[A-Z]", "").length() + 1);
        in.close();
    }

}
