/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank.Algorithms.Implementation;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.function.Consumer;

/**
 *
 * @author meet
 */
//Question Link : https://www.hackerrank.com/challenges/picking-numbers/problem
//not done try it
public class Picking_Numbers {

    static int pickingNumbers(int[] a) {
        // Complete this function
        Arrays.sort(a);
        int temp = 0;
        int max = 0;
        int previous = 1;
        for (int i = 0; i < a.length - 2; i++) {
            if (a[i] == a[i + 1]) {
                ++temp;
                previous = a[i];
            }
            if (a[i] == a[i + 1] - 1) {
                if (a[i + 1] - previous <= 1) {
                    ++temp;
                } else {
                    if (max < temp) {
                        max = temp;
                    }
                    temp = 0;
                    previous = a[i + 1];
                }
            }
        }
        return max + 1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int a_i = 0; a_i < n; a_i++) {
            a[a_i] = in.nextInt();
        }
        int result = pickingNumbers(a);
        System.out.println(result);
        in.close();
    }

}
