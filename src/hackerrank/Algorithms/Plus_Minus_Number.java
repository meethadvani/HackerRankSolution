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
//Question Link : https://www.hackerrank.com/challenges/plus-minus/problem

public class Plus_Minus_Number {

    static void plusMinus(int[] arr) {
        // Complete this function
        int plusCount = 0;
        int minusCount = 0;
        int zeroCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                plusCount++;
            } else if (arr[i] < 0) {
                minusCount++;
            } else {
                zeroCount++;
            }

        }
        System.out.println((double)plusCount / arr.length);
        System.out.println((double)minusCount / arr.length);
        System.out.println((double)zeroCount / arr.length);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int arr_i = 0; arr_i < n; arr_i++) {
            arr[arr_i] = in.nextInt();
        }
        plusMinus(arr);
        in.close();
    }
}
