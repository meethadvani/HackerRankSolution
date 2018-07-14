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
//Question Link : https://www.hackerrank.com/challenges/beautiful-days-at-the-movies/problem
public class Beautiful_Days {

    // Complete the beautifulDays function below.
    static int beautifulDays(int i, int j, int k) {

        int count = 0;
        for (int start = i; start <= j; start++) {
            int reverseNumber = doReverse(start);
            int temp = Math.abs(start - reverseNumber);
            if (temp % k == 0) {
                count++;
            }
        }
        return count;
    }

    public static int doReverse(int num) {
        int newNum = 0;
        while (num > 0) {
            int lastDigit = num % 10;
            newNum = (newNum * 10) + lastDigit;
            num /= 10;
        }
        return newNum;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] ijk = scanner.nextLine().split(" ");

        int i = Integer.parseInt(ijk[0]);

        int j = Integer.parseInt(ijk[1]);

        int k = Integer.parseInt(ijk[2]);

        int result = beautifulDays(i, j, k);

        System.out.println("Ans: " + result);
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();
        scanner.close();
    }

}
