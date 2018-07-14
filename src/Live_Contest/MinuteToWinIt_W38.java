/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Live_Contest;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author meet
 */
//Question Link: https://www.hackerrank.com/contests/w38/challenges/minute-to-win-it
public class MinuteToWinIt_W38 {

    // Complete the minuteToWinIt function below.
    static int minuteToWinIt(int[] a, int k) {
        // Return the minimum amount of time in minutes.
        int tempForStart;
        int tempForLast;
        int countFromStart = 0;
        int countFromLast = 0;
        int tempArray[] = new int[a.length];
        tempArray[0] = a[0];

        //Approch from first elements to last
        for (int i = 0; i < a.length - 1; i++) {
            tempArray[i + 1] = a[i + 1];
            tempForStart = k + a[i];
            if (tempForStart != a[i + 1]) {
                a[i + 1] = tempForStart;
                countFromStart++;
            }
        }

        //Approch from last elements to first
        for (int i = a.length - 1; i > 0; i--) {
            tempForLast = tempArray[i] - k;
            if (tempForLast != tempArray[i - 1]) {
                tempArray[i - 1] = tempForLast;
                countFromLast++;
            }
        }

//        if (countFromStart == countFromLast) {
//            return countFromStart - 1;
//        }
        //Check for minimum 
        if (countFromStart < countFromLast) {
            return countFromStart;
        }
        return countFromLast;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        int result = minuteToWinIt(a, k);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();
        System.out.println("Ans: " + result);
        scanner.close();
    }

}
