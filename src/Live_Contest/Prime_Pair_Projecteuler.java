/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Live_Contest;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author meet
 */

//All cases timeout

public class Prime_Pair_Projecteuler {

    static ArrayList<Integer> ans = new ArrayList<>();
    public static void generatePrime(int p1, int p2) {
        for (int i = p1; i <= p2; i++) {
            boolean flag = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                ans.add(i);
            }
        }
//        for (int i = p2;; i++) {
//            boolean flag = true;
//            for (int j = 2; j <= Math.sqrt(i); j++) {
//                if (i % j == 0) {
//                    flag = false;
//                    break;
//                }
//            }
//            if (flag) {
//                ans.add(i);
//                break;
//            }
//        }
    }

    public static void findSum(int p1, int p2) {
        long mult = 1;
        long sum = 0;
        for (int i = 0; i < ans.size() - 1; i++) {
            for (int j = 1;; j++) {
                String temp = j + "" + ans.get(i);
                long value = Long.parseLong(temp);
                if (value % ans.get(i + 1) == 0) {
                    mult = value;
                    sum += mult;
                    break;
                }
            }
            //System.out.println("Ans of:" + ans.get(i) + " & " + ans.get(i + 1) + " = " + sum);
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        for (int i = 0; i < testCase; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            generatePrime(1, 100000);
        }

    }
}
