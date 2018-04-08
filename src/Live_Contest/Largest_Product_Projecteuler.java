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
//Question Link : https://www.hackerrank.com/contests/projecteuler/challenges/euler008/problem
public class Largest_Product_Projecteuler {

    public static void largestProduct(String number, int consecutiveNum) {
        int maxProduct = 0;
        for (int i = 0; i <= number.length() - consecutiveNum; i++) {
            int product = 1;
            for (int j = i; j < i + consecutiveNum; j++) {
                product *= Character.getNumericValue(number.charAt(j));
            }
            if (maxProduct < product) {
                maxProduct = product;
            }
        }
        System.out.println(maxProduct);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            int n = in.nextInt();
            int k = in.nextInt();
            String num = in.next();
            largestProduct(num, k);
        }
    }

}
