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
//QuestionLink : https://www.hackerrank.com/contests/projecteuler/challenges/euler001
public class Multiplesof3And5_Projecteuler {

    public static long findMultiple(int inputNum, int startNum, int dif) {
        /*sum=N*(a1+an)/2 ; N=numberof term, a1=startNumer(3 or 5), an=endNumber
                                    OR
        sum=n/2[2*a1 + (N-1)d]; d=diff between two number
         */
        long sum;
        long N = inputNum / startNum;
        long endNum = N * startNum;
        sum = N * (startNum + endNum) / 2;
        // sum = (N * ((2 * startNum) + ((N - 1) * dif))) / 2;
        return sum;
    }
    
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            int n = in.nextInt();
            long sumOfThree = findMultiple(n - 1, 3, 3);
            long sumOfFive = findMultiple(n - 1, 5, 5);
            long sumOfBoth = 0;
            if (n > 15) {
                sumOfBoth = findMultiple(n - 1, 15, 15);
            }
            long ans = (sumOfThree + sumOfFive) - sumOfBoth;
            System.out.println(ans);
        }
    }

}
