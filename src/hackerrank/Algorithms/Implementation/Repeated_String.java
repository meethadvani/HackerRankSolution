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

public class Repeated_String {

    static long repeatedString(String s, long n) {

        int stringLength = s.length();
        int perStringA = 0;
        long result = 0;
        int count = 0;
        while (n % stringLength != 0) {
            n--;
            count++;
        }
        for (int i = 0; i < stringLength; i++) {
            if (s.charAt(i) == 'a') {
                perStringA++;
            }
        }
        long stringOccurence = n / stringLength;
        result = stringOccurence * perStringA;
        for (int i = 0; i < count; i++) {
            if (s.charAt(i) == 'a') {
                result++;
            }
        }
        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);
        System.out.println("Ans: " + result);
        //bufferedWriter.write(String.valueOf(result));
        //bufferedWriter.newLine();
        //bufferedWriter.close();
        scanner.close();
    }

}
