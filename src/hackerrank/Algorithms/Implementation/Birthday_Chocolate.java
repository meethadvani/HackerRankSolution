/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank.Algorithms.Implementation;

import java.util.Scanner;

/**
 *
 * @author meet
 */
//Question Link : https://www.hackerrank.com/challenges/the-birthday-bar/problem
public class Birthday_Chocolate {

    static int solve(int[] s, int d, int m) {

        int count = 0;
        for (int i = 0; i <= s.length - m; i++) {
            int sum = 0;
            for (int j = i; j < m + i; j++) {
                sum += s[j];
            }
            if (sum == d) {
                count++;
            }
        }
        return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] s = new int[n];

        String[] sItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int sItem = Integer.parseInt(sItems[i]);
            s[i] = sItem;
        }

        String[] dm = scanner.nextLine().split(" ");

        int d = Integer.parseInt(dm[0]);

        int m = Integer.parseInt(dm[1]);

        int result = solve(s, d, m);
        System.out.println("Ans: " + result);
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();
        scanner.close();
    }

}
