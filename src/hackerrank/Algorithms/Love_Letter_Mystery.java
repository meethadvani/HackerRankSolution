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
//Question Link : https://www.hackerrank.com/challenges/the-love-letter-mystery/problem
public class Love_Letter_Mystery {

    static int theLoveLetterMystery(String s) {
        int start = 0;
        int end = s.length() - 1;
        int count = 0;
        while (start < end) {
            count += Math.abs(s.charAt(start) - s.charAt(end));
            start++;
            end--;
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for (int a0 = 0; a0 < q; a0++) {
            String s = in.next();
            int result = theLoveLetterMystery(s);
            System.out.println(result);
        }
    }
}
