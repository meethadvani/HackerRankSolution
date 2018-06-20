/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Live_Contest;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author meet
 */
//Question Link : https://www.hackerrank.com/contests/w37/challenges/simple-language
//Done
public class Simple_Language_W37 {

    static long maximumProgramValue(int n) {
        String input;
        long ans = 0;
        for (int i = 0; i < n; i++) {
            input = scanner.nextLine();
            String last = input.substring(input.lastIndexOf(" ")+1);
            if (input.contains("add")) {
                if (Integer.parseInt(last) > 0) {
                    ans += Integer.parseInt(last + "");
                }
            } else {
                if (Integer.parseInt(last) > ans) {
                    ans = Integer.parseInt(last + "");
                }
            }
        }
        System.out.println("Final Ans: "+ans);
        return ans;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        long result = maximumProgramValue(n);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();
        scanner.close();
    }

}
