/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank.Algorithms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author meet
 */
/*Question Link: https://www.hackerrank.com/challenges/reduced-string/problem 
 *Short Description: remove the duplicate char which is near to each other like : abba--->aa--->Empty String 
 *Like : aaabccddd --->abccddd --->abddd --->abd
*/
public class String_Reduce {

    static String super_reduced_string(String s) {
        // Complete this function
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                s = s.substring(0, i) + s.substring(i + 2);
                i = -1;
            }
        }
        return s;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = super_reduced_string(s);
        if (result.equals("")) {
            result = "Empty String";
        }
        System.out.println(result);
    }

}
