/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank.Algorithms.Implementation;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author meet
 */
//Question Link : https://www.hackerrank.com/challenges/day-of-the-programmer/problem
public class Day_of_the_Programmer {

//    static int month[] = new int[]{31, 28, 31, 30, 31, 30, 31, 31};
    // Complete the solve function below.
    static String solve(int year) {
        int totalSumOfEightMonth = 243;
        boolean julianCalendar = false;
        boolean gregorianCalendar = false;
        if (year == 1918) {
            return "26.09.1918";
        }
        if (year < 1998) {
            julianCalendar = (year % 4 == 0);
            if (julianCalendar) {
                totalSumOfEightMonth = 244;
            }
        } else if (year >= 1998) {
            gregorianCalendar = ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)));
            if (gregorianCalendar) {
                totalSumOfEightMonth = 244;
            }
        }

        int ans = 256 - totalSumOfEightMonth;
        return ans + "." + "09." + year;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int year = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String result = solve(year);
        System.out.println("Ans: " + result);
        // bufferedWriter.write(result);
        // bufferedWriter.newLine();
        //bufferedWriter.close();
        scanner.close();
    }

}
