/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;

import java.util.Scanner;

/**
 *
 * @author meet
 */
public class PrimeNumChecker {

    public static String isPrime(int number) {
        if (number < 2) {
            return "Not prime";
        } else {
            for (int i = 2; i < (int) Math.sqrt(number) + 1; i++) {
                if (number % i == 0) {
                    return "Not prime";
                }
            }
            return "Prime";
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int p = in.nextInt();
        for (int a0 = 0; a0 < p; a0++) {
            int n = in.nextInt();
            System.out.println(isPrime(n));
        }
    }
}
