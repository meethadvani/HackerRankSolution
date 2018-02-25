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
//Question Link :https://www.hackerrank.com/challenges/caesar-cipher-1/problem
//Sample input  :90
//               !m-rB`-oN!.W`cLAcVbN/CqSoolII!SImji.!w/`Xu`uZa1TWPRq`uRBtok`xPT`lL-zPTc.BSRIhu..-!.!tcl!-U
//               62
//Output :       !w-bL`-yX!.G`mVKmFlX/MaCyyvSS!CSwts.!g/`He`eJk1DGZBa`eBLdyu`hZD`vV-jZDm.LCBSre..-!.!dmv!-E

public class Caesar_Cipher {

    static String caesarCipher(String s, int k) {
//         Complete this function
        int oneChar;
        int newChar;
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            oneChar = s.charAt(i);
            if (oneChar >= 65 && oneChar <= 90) {
                newChar = oneChar + k%26;
                if (newChar > 90) {
                    newChar = (newChar - 90) + 64;
                }
                ans += (char)newChar;
            } else if (oneChar >= 97 && oneChar <= 122) {
                newChar = oneChar + k%26;
                if (newChar > 122) {
                    newChar = (newChar - 122) + 96;
                }
                ans += (char)newChar;
            } else {
                ans += (char)oneChar;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        int k = in.nextInt();
        String result = caesarCipher(s, k);
        System.out.println(result);
        in.close();
    }

}
