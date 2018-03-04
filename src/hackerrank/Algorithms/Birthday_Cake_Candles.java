/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank.Algorithms;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author meet
 */
//Question Link : https://www.hackerrank.com/challenges/birthday-cake-candles/problem
public class Birthday_Cake_Candles {

    static int birthdayCakeCandles(int n, int[] ar) {
        // Complete this function
        int max = 0;
        int count = 0;
        Arrays.sort(ar);
        for (int i = n - 1; i > 0; i--) {
            if (ar[i] == ar[i - 1]) {
//                System.out.println(ar[i] + " = " + ar[i - 1]);
                count++;
            } else {
                break;
            }
        }
        return count + 1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for (int ar_i = 0; ar_i < n; ar_i++) {
            ar[ar_i] = in.nextInt();
        }
        int result = birthdayCakeCandles(n, ar);
        System.out.println(result);
    }

}
