/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practice_Programs;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author meet
 */
//Question Link: https://www.geeksforgeeks.org/given-two-strings-find-first-string-subsequence-second/

public class StringMatching {

    public static int matchString(String first, String second) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int count = 0;
        for (int i = 0; i < second.length(); i++) {
            if (map.containsKey(second.charAt(i))) {
                int value = map.get(second.charAt(i));
                map.put(second.charAt(i), ++value);
            } else {
                map.put(second.charAt(i), 1);
            }
        }
        for (int j = 0; j < first.length(); j++) {
            if (map.containsKey(first.charAt(j))) {
                int num = map.get(first.charAt(j));
                if (num > 1) {
                    map.put(first.charAt(j), num - 1);
                } else {
                    map.remove(first.charAt(j));
                }
            } else {
                count++;
            }
        }
        return map.size() > count ? map.size(): count;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String first = sc.next();
        String second = sc.next();
        System.out.println(matchString(first,second));
    }
}
