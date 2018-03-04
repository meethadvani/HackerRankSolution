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
public class Mars_Exploration_LetterChange {

    static int marsExploration(String s) {
        // Complete this function
        int length = s.length();
        int count = 0;
        for (int i = 0; i < length; i += 3) {
            if (s.charAt(i) != 'S') {
                ++count;
            }
            if (s.charAt(i + 1) != 'O') {
                ++count;
            }
            if (s.charAt(i + 2) != 'S') {
                ++count;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int result = marsExploration(s);
        System.out.println(result);
        in.close();
    }

}
