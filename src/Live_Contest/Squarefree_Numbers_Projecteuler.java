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
//Not understood question
public class Squarefree_Numbers_Projecteuler {

    public static void findSquareFree(int n, int k) {

        long count = 0;
        for (int i = 2; i <= n; i++) {
            double ans = Math.pow(i, k);
            if (ans > n) {
                break;
            } else {
                count++;
            }
        }
        System.out.println("Ans: " + (n - count));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputN = sc.nextInt();
        int inputK = sc.nextInt();
        findSquareFree(inputN, inputK);
    }
}
