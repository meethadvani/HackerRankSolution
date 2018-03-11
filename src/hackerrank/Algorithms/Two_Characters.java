/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank.Algorithms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author meet
 */
//Question Link : https://www.hackerrank.com/challenges/two-characters/problem 
//Note : Done, Pass all test case :)
public class Two_Characters {

    static String noDuplicate = "";
    static int ansCount = 0;

    static int twoCharaters(String s) {
        // Complete this function
        HashMap<Character, Integer> map = new HashMap<>();

        //Create a map with unique character as key and occurance as value
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                int oldValue = (int) map.get(s.charAt(i));
                map.put(s.charAt(i), ++oldValue);
            } else {
                map.put(s.charAt(i), 1);
                noDuplicate += s.charAt(i) + "";
            }
        }
        Set set = map.keySet();
        Iterator i = set.iterator();
        //iterate through each key/value of map
        while (i.hasNext()) {
            char c = (char) i.next();
            int occurence = map.get(c);
            //check the next "value" of key 'c' in map
            if (map.containsValue(++occurence)) {
                //find map key from value(occurance)
                for (int j = 0; j < noDuplicate.length(); j++) {
                    if (occurence == map.get(noDuplicate.charAt(j))) {
                        String temp = c + "" + noDuplicate.charAt(j) + "";
                        boolean ans = isAlternativeString(s, temp);
                        if (ans) {
                            //System.out.println("Yes it is alternative string");
                        }
                    }
                }
//                System.out.println("Key: " + c + " value: " + occurence);
            }
            if (map.containsValue(--occurence)) {
                for (int j = 0; j < noDuplicate.length(); j++) {
                    if (occurence == map.get(noDuplicate.charAt(j))) {
                        String temp = c + "" + noDuplicate.charAt(j) + "";
                        boolean ans = isAlternativeString(s, temp);
                        if (ans) {
                            //System.out.println("Yes it is alternative string");
                        }

                    }
                }
            }
        }
        return ansCount;
    }

    static boolean isAlternativeString(String original, String twoCharcter) {
        String regex = "[^" + twoCharcter + "]"; //this will remove all the charactor except "twoCharactor"
        String temp = original.replaceAll(regex, "");
//      check ,temp contain alternate chracter or not
        char first, second;
        int count = 0;
        for (int i = 0; i < temp.length() - 2; i++) {
            first = temp.charAt(i);
            second = temp.charAt(i + 2);
            if (first == second) {
                count++;
            }
        }
        if ((count + 2) == temp.length()) {
            //for length 2 string like "aa"
            if (temp.charAt(0) != temp.charAt(1)) {
                if (ansCount < temp.length()) {
                    ansCount = temp.length();
                }
                return true;
            }

        }
        return false;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int l = in.nextInt();
        String s = in.next();
        int result = twoCharaters(s);
        System.out.println(result);
        in.close();
    }

}
