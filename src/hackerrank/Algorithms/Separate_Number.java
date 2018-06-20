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
//Question Link : https://www.hackerrank.com/challenges/separate-the-numbers/problem 
//edge cases remaining like 9--->10--->11
public class Separate_Number {

    static void separateNumbers(String s) {
        // Complete this function
//        int count = 0;

        //for selecting subsequence lenght (Start from 1 length)
        for (int i = 1; i <= s.length() / 2; i++) {
            int sequence = 0;
            //It tooks one by one subsequence as per i length
            for (int j = 0; j < s.length() - i; j += i) {
                int first = Integer.parseInt(s.substring(j, j + i));
                //
                int second = 0;
                int temp = 0;
                boolean flag = false;
                //For edge cases : 9--->10--->11
//                for (int k = 0; k < s.substring(j, j + i).length(); k++) {
//                    if (!(s.substring(j, j + i).charAt(k) == '9')) {
//                        break;
//                    }
//                    ++temp;
//                    if (temp == s.substring(j, j + i).length()) {
//                        second = Integer.parseInt(s.substring(j + i, j + (2 * i) + 1));
//                        flag = true;
//                    }
//
//                }
                //
                if (!flag) {
                    second = Integer.parseInt(s.substring(j + i, j + (2 * i)));
                }
                //for checking first subsequence with second subsequence 
                if ((first + 1) == second) {
                    //uncomments below line and check sequence for understanding
                    System.out.println(first + " = " + second);
//                    ++count;
                    ++sequence;
                    if (flag) {
                        break;
                    }
                } //If first sequence + one will not match with second then break the loop and go for next length sequence 
                //example 1011 (1+1 !=0 ) so go for length 2 so 10+1 --->11 and break the current loop.
                else {
                    break;
                }
            }
            //For printing correct substring and entry point
            //if correct string found then just print & return from there no need for further loop
            //like 101112 we found for length 2 (10-->11-->12)
            //then no need to go for length 3 like 101--->112 )
            if (sequence == (s.length() / i) - 1) {
                System.out.println("YES " + s.substring(0, i));
                return;
            }
        }
        System.out.println("NO");
        return;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for (int a0 = 0; a0 < q; a0++) {
            String s = in.next();
            separateNumbers(s);
        }
        in.close();
    }

}
