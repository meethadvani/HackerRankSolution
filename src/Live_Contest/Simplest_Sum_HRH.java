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
//Question Link : https://www.hackerrank.com/contests/hackerrank-hiring-contest/challenges/the-simplest-sum
//Note : working fine on pc but not passes all test case due to timeout

public class Simplest_Sum_HRH {

    static double  simplestSum(int k, long a, long b) {
        double ans = 0;
        long count = a;
        while (count <= b) {
            long sum = 0;
            for (int i = 1; i <= count; i += 1) {
                sum += i;
                i *= k;
            }
            ans += sum;
            count++;
        }
        if(ans > Math.pow(10, 9)){
            return ( ans % (Math.pow(10, 9)+ 7));
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for (int a0 = 0; a0 < q; a0++) {
            int k = in.nextInt();
            long a = in.nextLong();
            long b = in.nextLong();
            double result = simplestSum(k, a, b);
            System.out.println((long)result);
        }
        in.close();
    }
}
