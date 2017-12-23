/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author meet
 */
//Question Link : https://www.hackerrank.com/challenges/ctci-ransom-note/problem

public class Ransom_note {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        String magazine[] = new String[m];
        //Store words of first String
        HashMap<String, Integer> map1 = new HashMap();
        for (int magazine_i = 0; magazine_i < m; magazine_i++) {
            magazine[magazine_i] = in.next();
            if (map1.containsKey(magazine[magazine_i])) {
                int value = map1.get(magazine[magazine_i]);
                value++;
                map1.put(magazine[magazine_i], value);
            } else {
                map1.put(magazine[magazine_i], 1);
            }
            //System.out.println("-------"+magazine[magazine_i]);
        }
        String ransom[] = new String[n];
        //Store words of second String
        HashMap<String, Integer> map2 = new HashMap();
        for (int ransom_i = 0; ransom_i < n; ransom_i++) {
            ransom[ransom_i] = in.next();
            if (map2.containsKey(ransom[ransom_i])) {
                int value = map2.get(ransom[ransom_i]);
                value++;
                map2.put(ransom[ransom_i], value);
            } else {
                map2.put(ransom[ransom_i], 1);
            }
        }
        
        //check rensom words in magazine or not
        boolean flag = false;
        for (String s : map2.keySet()) {
            System.out.println("---key: "+s +" value :"+map2.get(s));
            if (map1.containsKey(s)) {
                flag = map1.get(s) >= map2.get(s) ? true : false;
            }
            if(!flag) {
                break;
            }
        }
        String result=(flag==true) ? "Yes" : "No";
        System.out.println(result);
    }
}
