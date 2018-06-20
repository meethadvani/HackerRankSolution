/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Live_Contest;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author meet
 */
//Question Link : https://www.hackerrank.com/contests/w37/challenges/the-average-rating-of-top-employees
public class Average_Rating_W37 {

    // Complete the averageOfTopEmployees function below.
    static void averageOfTopEmployees(int[] rating) {
        int sum = 0;
        double count = 0;
        Arrays.sort(rating);
        for (int i = 0; i < rating.length; i++) {
            if (rating[i] >= 90) {
                sum += rating[i];
                count++;
            }
        }
        double ans = sum / count;
        System.out.println(String.format("%.2f", ans));

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] rating = new int[n];

        for (int ratingItr = 0; ratingItr < n; ratingItr++) {
            int ratingItem = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            rating[ratingItr] = ratingItem;
        }

        averageOfTopEmployees(rating);

        scanner.close();
    }

}
