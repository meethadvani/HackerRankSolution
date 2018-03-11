/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank.Algorithms.Implementation;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author meet
 */
//Question Link : https://www.hackerrank.com/challenges/sock-merchant/problem
public class Sock_Merchant {

    static int sockMerchant(int n, int[] ar) {
        // Complete this function
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (map.containsKey(ar[i])) {
                map.remove(ar[i]);
                count++;
            } else {
                map.put(ar[i], 1);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for (int ar_i = 0; ar_i < n; ar_i++) {
            ar[ar_i] = in.nextInt();
        }
        int result = sockMerchant(n, ar);
        System.out.println(result);
    }

}
