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
public class String_Combination  {

    static HashMap<Character, Integer> mapVowel = new HashMap<>();
    static long badCount = 0;

    public static void combine(String instr, StringBuilder outstr, int index) {
        for (int i = index; i < instr.length(); i++) {
            outstr.append(instr.charAt(i));
            if (outstr.length() % 2 != 0 && outstr.length() > 1) {
                //System.out.println("test---->"+outstr.toString());
                findBadString(outstr);
            }
            combine(instr, outstr, i + 1);
            outstr.deleteCharAt(outstr.length() - 1);
        }
    }

    public static void findBadString(StringBuilder outstrNew) {
        boolean flag = true;
        if (mapVowel.containsKey(outstrNew.charAt(0))) {
            return;
        }
        int middleChar = outstrNew.length() / 2;
        if (mapVowel.containsKey(outstrNew.charAt(middleChar))) {
            for (int j = 0; j < middleChar; j++) {
                if (mapVowel.containsKey(outstrNew.charAt(j))) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                for (int k = middleChar + 1; k < outstrNew.length(); k++) {
                    if (mapVowel.containsKey(outstrNew.charAt(k))) {
                        flag = false;
                        break;
                    }
                }
            }
            if (flag) {
//                System.out.println("Bad String--->" + outstrNew);
                ++badCount;
            }
        }
    }

    public static void main(String[] args) {

        int numOfCase;
        mapVowel.put('a', 1);
        mapVowel.put('e', 1);
        mapVowel.put('i', 1);
        mapVowel.put('o', 1);
        mapVowel.put('u', 1);
        Scanner sc = new Scanner(System.in);
        numOfCase = sc.nextInt();
        String s;
        for (int i = 0; i < numOfCase; i++) {
            s = sc.next();
            combine(s, new StringBuilder(), 0);
            long total = (long) (Math.pow(2, s.length()) % 1000000007) - 1;
            System.out.println(total - badCount);
            badCount = 0;
        }

    }
}