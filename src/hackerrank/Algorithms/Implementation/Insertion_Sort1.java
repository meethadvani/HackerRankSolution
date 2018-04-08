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
//Question Link : https://www.hackerrank.com/challenges/insertionsort1/problem
//Note : have to improve
public class Insertion_Sort1 {

    static void insertionSort1(int n, int[] arr) {
        // Complete this function
        int rightMost = arr[n - 1];
        int i;
        boolean flag = false;
        for (i = arr.length - 1; i >= 0; i--) {
            if (i == 0 || arr[i - 1] > rightMost) {
                if (i == 0) {
                    arr[i + 1] = arr[i];
                    arr[i] = rightMost;
                } else {
                    arr[i] = arr[i - 1];
                }
                for (int j = 0; j < arr.length; j++) {
                    System.out.print(arr[j] + " ");
                }
                System.out.println("");
            } else {
                for (int k = 0; k < i; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.print(rightMost + " ");
                for (int l = i + 1; l < arr.length; l++) {
                    System.out.print(arr[l] + " ");
                }
                break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int arr_i = 0; arr_i < n; arr_i++) {
            arr[arr_i] = in.nextInt();
        }
        insertionSort1(n, arr);
        in.close();
    }

}
