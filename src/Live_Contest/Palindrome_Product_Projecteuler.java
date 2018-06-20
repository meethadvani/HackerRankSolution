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
//Question Link : https://www.hackerrank.com/contests/projecteuler/challenges/euler004/problem

public class Palindrome_Product_Projecteuler {

    static boolean predefine[] = new boolean[1000001];

    public static boolean palindrome(String input) {
        for (int i = 0; i < input.length() / 2; i++) {
            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void preCalculation() {
        for (int i = 100; i <= 999; i++) {
            for (int j = i; j <= 999; j++) {
                int product = i * j;
                if (product >= 101101) {
                    boolean isPalindrome = palindrome(product + "");
                    if (isPalindrome) {
                        predefine[product] = true;
                    } else {
                        predefine[product] = false;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        preCalculation();
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            int n = in.nextInt();
            for (int i = n - 1; i >= 101101; i--) {
                if (predefine[i]) {
                    System.out.println(i);
                    break;
                }
            }
        }
    }

}
