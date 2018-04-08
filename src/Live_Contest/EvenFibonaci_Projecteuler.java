/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Live_Contest;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author meet
 */
//Question Link : https://www.hackerrank.com/contests/projecteuler/challenges/euler002/problem
public class EvenFibonaci_Projecteuler {

    public static void findEvenSumOfFibonaci(long num) {
        BigInteger result = BigInteger.ZERO;
        BigInteger ans = new BigInteger("0");
        BigInteger first = new BigInteger("0");
        BigInteger second = new BigInteger("1");
       // int count = 0;
        for (long i = 1; i <= num; i++) {
            result = first.add(second);
            first = second;
            second = result;
            //System.out.print(result + " ");
            if (num >= result.longValue()) {
                if (result.mod(new BigInteger("2")).equals(BigInteger.ZERO)) {
                   // count++;
                    ans = ans.add(result);
                }
            } else {
                break;
            }
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            long n = in.nextLong();
            findEvenSumOfFibonaci(n);
        }
    }

}
