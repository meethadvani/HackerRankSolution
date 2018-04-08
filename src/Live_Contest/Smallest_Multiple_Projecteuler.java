/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Live_Contest;

import java.util.Scanner;

/**
 *
 * @author meet
 */
//Question Link : https://www.hackerrank.com/contests/projecteuler/challenges/euler005

public class Smallest_Multiple_Projecteuler {

    public static void smallestNumber(int num) {
        int base;
        for (int i = 1;; i++) {
            base = num * i;
            int count = 0;
            for (int j = 1; j < num; j++) {
                if (base % j == 0) {
                    count++;
                } else {
                    break;
                }
            }
            if (count + 1 == num) {
                System.out.println(base);
                break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            int n = in.nextInt();
            smallestNumber(n);
        }
    }

}
