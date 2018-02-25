/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Live_Contest;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author meet
 */
//Question Link : https://www.hackerearth.com/challenge/college/february-long-18/algorithm/df4573fc5362409883d0f13f0abefb09/

public class Good_Subsqeuence_HackerEarth {

    static long count = 0;
    static long badCount = 0;
    static HashMap<Character, Integer> map = new HashMap<>();

    public static void main(String[] args) {
        int numOfCase;
        map.put('a', 1);
        map.put('e', 1);
        map.put('i', 1);
        map.put('o', 1);
        map.put('u', 1);

        Scanner sc = new Scanner(System.in);
        numOfCase = sc.nextInt();
        String s;
        for (int i = 0; i < numOfCase; i++) {
            s = sc.next();
            char c[] = s.toCharArray();
            combine(c);
            // System.out.println("Good Count Total : " + (count - badCount));
            System.out.println(count - badCount);
            count = 0;
            badCount = 0;
        }
    }

    private static void combine(char[] arr) {
        for (int i = 1; i <= arr.length; i++) {
            char[] res = new char[i];
            doCombine(arr, res, 0, 0, i);
        }
    }

    private static void doCombine(char[] arr, char[] res, int currIndex, int level, int r) {
        if (level == r) {
            if ((res.length % 2) != 0 && res.length > 1) {
                printArray(res);
            }
            count++;
            return;
        }
        for (int i = currIndex; i < arr.length; i++) {
            res[level] = arr[i];
            doCombine(arr, res, i + 1, level + 1, r);
            //way to avoid printing duplicates
            if (i < arr.length - 1 && arr[i] == arr[i + 1]) {
                i++;
            }
        }
    }

    private static void printArray(char[] res) {
        boolean flag = true;
        String original = "";
        if (map.containsKey(res[0])) {
            return;
        }
        int middleChar = res.length / 2;
        if (map.containsKey(res[middleChar])) {
            for (int i = 0; i < middleChar; i++) {
                if (map.containsKey(res[i])) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                for (int i = middleChar + 1; i < res.length; i++) {
                    if (map.containsKey(res[i])) {
                        flag = false;
                        break;
                    }
                }
            }
            if (flag) {
                //System.out.println("Bad--->" + original);
                ++badCount;
            }
        }
    }
}
