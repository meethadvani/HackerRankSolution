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
public class String_Combination_New {

    private StringBuilder output = new StringBuilder();
    private final String inputstring;
    static HashMap<Character, Integer> mapVowel = new HashMap<>();
    static long badCount = 0;

    public String_Combination_New(final String str) {
        inputstring = str;
//        System.out.println("The input string  is  : " + inputstring);
    }

    public static void main(String args[]) {

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
            String_Combination_New combobj = new String_Combination_New(s);
            //System.out.println("All possible combinations are :  ");
            combobj.combine();
            long total = (long) (Math.pow(2, s.length()) % 1000000007) - 1;
            System.out.println(total - badCount);
            badCount = 0;
        }

    }

    public void combine() {
        combine(0);
    }

    private void combine(int start) {
        for (int i = start; i < inputstring.length(); ++i) {
            output.append(inputstring.charAt(i));
//            System.out.println(output);
            if (output.length() % 2 != 0 && output.length() > 1) {
                findBadString(output);
            }
            if (i < inputstring.length()) {
                combine(i + 1);
            }
            output.setLength(output.length() - 1);
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
               // System.out.println("Bad String--->" + outstrNew);
                ++badCount;
            }
        }
    }
}
