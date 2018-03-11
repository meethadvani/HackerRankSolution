/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank.Algorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author meet
 */
//Question Link : https://www.hackerrank.com/challenges/weighted-uniform-string/problem

public class Weighted_Uniform_Strings {

    static Set<Integer> map = new HashSet<Integer>();

    public static void uniformWeightedString(String s) {
        char[] charArray = s.toCharArray();
        int continuousString = 1;
        int lastAlphaNum = 0;
        for (int i = 0; i < charArray.length; i++) {
            int alphaNum = charArray[i] - 96; //96=ASCII value before 'a'
            if (alphaNum == lastAlphaNum) {
                continuousString++;
            } else {
                continuousString = 1;
                lastAlphaNum = alphaNum;
            }
            int num = (alphaNum) * continuousString;
            map.add(num);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int n = in.nextInt();
        uniformWeightedString(s);
        for (int a0 = 0; a0 < n; a0++) {
            int x = in.nextInt();
            String output = map.contains(x) ? "Yes" : "No";
            System.out.println(output);
        }
    }

}
