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
//Question Link :  https://www.hackerrank.com/challenges/palindrome-index/problem
public class Palindrome_Index {

    static int palindromeIndex(String s) {
        // Complete this function
        StringBuilder sb = new StringBuilder(s);
        int len = s.length() - 1;
        int ans = -1;
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(len)) {
                if (s.charAt(i + 1) == s.charAt(len)) {
                    sb.deleteCharAt(i);
                    //after deleteing, need to check string is palindrom or not
                    //create a new stringbuilder for checking reverser string
                    StringBuilder temp = new StringBuilder(sb);
                    //need to convert into string for equal checking bcz two string builder object are not same even content is same
                    if (sb.reverse().toString().equals(temp.toString())) {
                        //System.out.println("Reverse: " + sb);
                        ans = i;
                        return ans;
                    }

                }
                if (s.charAt(i) == s.charAt(len - 1)) {
                    ans = len;
                    //System.out.println("Left: " + s.charAt(i) + " Right: " + s.charAt(len - 1));
                    return ans;
                }
            }
            System.out.println(s.charAt(i) + " " + s.charAt(len));
            --len;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for (int a0 = 0; a0 < q; a0++) {
            String s = in.next();
            int result = palindromeIndex(s);
            System.out.println(result);
        }
    }

}
