/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank.Algorithms.Implementation;

import java.util.Scanner;

/**
 *
 * @author meet
 */
//Question Link : https://www.hackerrank.com/challenges/between-two-sets/problem

public class BetweenTwoSets {

    static int ans;

    static int getTotalX(int[] a, int[] b) {
        // Complete this function
        int temp = 0;
        int count = 0;
        for (int i = a[a.length - 1]; i <= b[0]; i++) {
            temp = 0;
            count = 0;
            while (temp < a.length) {
                if (i % a[temp] != 0) {
                    break;
                }
                temp++;
                count++;
            }
            if (count == a.length) {
                temp = 0;
                count = 0;
                while (temp < b.length) {
                    if (b[temp] % i != 0) {
                        break;
                    }
                    temp++;
                    count++;
                }
                if (count == b.length) {
                    ans++;
                    //System.out.println("ans: " + i);
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        for (int a_i = 0; a_i < n; a_i++) {
            a[a_i] = in.nextInt();
        }
        int[] b = new int[m];
        for (int b_i = 0; b_i < m; b_i++) {
            b[b_i] = in.nextInt();
        }
        int total = getTotalX(a, b);
        System.out.println(total);
        in.close();
    }

}