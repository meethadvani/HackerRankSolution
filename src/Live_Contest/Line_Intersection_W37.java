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
//Question Link : https://www.hackerrank.com/contests/w37/challenges/dynamic-line-intersection
//Not Completed
public class Line_Intersection_W37 {

    static void dynamicLineIntersection(int n) {
        int kArray[] = new int[n];
        int bArray[] = new int[n];
        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            if (input.contains("+")) {
                kArray[i] = input.charAt(2) - '0';
                bArray[i] = input.charAt(4) - '0';
            }
            if (input.contains("-")) {
                int removeK = input.charAt(2) - '0';
                int removeB = input.charAt(4) - '0';
                for (int k = 0; k < bArray.length; k++) {
                    if (removeK == kArray[k] && removeB == bArray[k]) {
                        kArray[k] = 0;
                        bArray[k] = 0;
                        break;
                    }
                }
            }
            if (input.contains("?")) {
                int queryValue = input.charAt(2) - '0';
                double ans = 0;
                int count = 0;
                for (int j = 0; j < kArray.length; j++) {
                    double temp = queryValue - bArray[j];
                    if (kArray[j] != 0) {
                        ans = temp / kArray[j];
                        //check for the ans, it is int or double value (1 or 0.5)
                        if (ans == (int) ans) {
                            count++;
                        }
//                        System.out.println("Ans : " + ans);
                    } 
                }
                System.out.println(count);
            }

        }

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        dynamicLineIntersection(n);

        scanner.close();
    }

}
