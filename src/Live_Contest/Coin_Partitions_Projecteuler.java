/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Live_Contest;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 *
 * @author meet
 */
//Question Link: https://www.hackerrank.com/contests/projecteuler/challenges/euler078/problem 
//Note : timeout due to modulo (10^9+7)
public class Coin_Partitions_Projecteuler {

    static long[] table = new long[60000 + 1]; //max size as given in problem

    static void count(int S[], int m, int n) {
        //long[] table = new long[n + 1];
        Arrays.fill(table, 0);   //O(n)
        table[0] = 1;
        for (int i = 0; i < m; i++) {
            for (int j = S[i]; j <= n; j++) {
                table[j] += table[j - S[i]] % 1000000007;
            }
        }
//Print all the table value
//        for (int i = 0; i < table.length; i++) {
//            System.out.print(" " + table[i]);
//        }
        //return (table[n] % 1000000007);
    }

    public static void main(String[] args) {
        //Pre calculate all the value till the max range(60000)
        int numberOfCoins = 60000;
        int[] coinArray = IntStream.range(1, numberOfCoins + 1).toArray(); //to fill the array with consecutive number
        count(coinArray, coinArray.length, numberOfCoins);
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        for (int i = 0; i < testCase; i++) {
            int input = sc.nextInt();
            System.out.println(table[input]);
        }
    }
}
