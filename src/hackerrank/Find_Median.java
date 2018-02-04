/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author meet
 */
//Question Link : https://www.hackerrank.com/challenges/ctci-find-the-running-median/problem 
//NOTE : It does not pass all test cases (improve code if you can and commit)

public class Find_Median {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        int index;
        double ans;
        for (int a_i = 0; a_i < n; a_i++) {
            a[a_i] = in.nextInt();
        }
        for (int i = 1; i <= a.length; i++) {
            Arrays.sort(a, 0, i);
            if (i % 2 == 0) {
                index = (i / 2);
                ans = (a[index - 1] + a[index]) / 2.0;
            } else {
                index = (i / 2);
                ans = a[index];
            }
            System.out.println(ans);
        }
    }
}
