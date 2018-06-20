/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank.Algorithms.Implementation;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author meet
 */
//Question Link : https://www.hackerrank.com/challenges/extra-long-factorials/problem
public class LongFactorials {

    static void extraLongFactorials(int num) {
        BigInteger fNum = BigInteger.ONE;
        BigInteger temp;
        for (int i = 1; i <= num; i++) {
            if (i == num) {
                temp = BigInteger.valueOf(i);
            } else {
                temp = BigInteger.valueOf(i * (i + 1));
            }
            fNum = fNum.multiply(temp);
            i++;
        }
        System.out.println(fNum);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        extraLongFactorials(n);

        scanner.close();
    }
}
