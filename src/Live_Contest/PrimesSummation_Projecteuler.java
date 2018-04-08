/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Live_Contest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author meet
 */
//Question Link : https://www.hackerrank.com/contests/projecteuler/challenges/euler010/problem
public class PrimesSummation_Projecteuler {

    static List<Long> list = new ArrayList<Long>();

    public static void allPrime(int maxRange) {
        for (int i = 2; i <= maxRange; i++) {
            if (isPrime(i)) {
                list.add(Long.valueOf(i));
            }
        }
    }

    public static boolean isPrime(int number) {
        if ((number > 2 && number % 2 == 0) || number == 1) {
            return false;
        }
        for (int i = 3; i <= (int) Math.sqrt(number); i += 2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        allPrime(100000);
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            int n = in.nextInt();
            long sum = 0;
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) <= n) {
                    sum += list.get(i);
                } else {
                    break;
                }
            }
            System.out.println(sum);
        }
    }
}
