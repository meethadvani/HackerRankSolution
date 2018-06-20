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
//Question Link : https://www.hackerrank.com/challenges/common-child/problem
//Only 3 test cases pass
public class Common_Child_String {

    static int commonChild(String s1, String s2) {
        // Complete this function
        int s1Pointer = 0;
        int s2Pointer = 0;
        int storage = 0;
        int count = 0;
        while (s2Pointer < s2.length()) {
            if (s2.charAt(s2Pointer) == s1.charAt(s1Pointer)) {
                System.out.println(s2.charAt(s2Pointer) + " ");
                storage = s1Pointer;
                s1Pointer++;
                s2Pointer++;
                storage++;
                count++;
                if (storage == s1.length() && s2Pointer != s2.length()) {
                    storage = 0;
                    s1Pointer = storage;
                    count--;
                }
            } else if (s2.charAt(s2Pointer) != s1.charAt(s1Pointer)) {
                s1Pointer++;
                if (s1Pointer == s1.length()) {
                    s1Pointer = storage;
                    s2Pointer++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = in.next();
        String s2 = in.next();
        int result = commonChild(s1, s2);
        System.out.println(result);
    }

}
