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
//Question Link : https://www.hackerrank.com/challenges/breaking-best-and-worst-records/problem

public class Breaking_The_Records {

    // Complete the breakingRecords function below.
    static int[] breakingRecords(int[] scores) {
        int maxValue = scores[0];
        int maxCount = 0;
        int minValue = scores[0];
        int minCount = 0;
        for (int i = 1; i < scores.length; i++) {
            if (maxValue < scores[i]) {
                maxValue = scores[i];
                maxCount++;
            }
            if (minValue > scores[i]) {
                minValue = scores[i];
                minCount++;
            }
        }

        int ans[] = new int[]{maxCount, minCount};
        return ans;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] scores = new int[n];

        String[] scoresItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int scoresItem = Integer.parseInt(scoresItems[i]);
            scores[i] = scoresItem;
        }

        int[] result = breakingRecords(scores);
        System.out.println(result[0] + " " + result[1]);

//        for (int i = 0; i < result.length; i++) {
        //bufferedWriter.write(String.valueOf(result[i]));
//            if (i != result.length - 1) {
//                //bufferedWriter.write(" ");
//            }
//        }
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();
        scanner.close();
    }

}
