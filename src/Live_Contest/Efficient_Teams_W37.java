/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Live_Contest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author meet
 */
//Question Link : https://www.hackerrank.com/contests/w37/challenges/two-efficient-teams/problem
//Not Completed
public class Efficient_Teams_W37 {

    public static Map map = new HashMap<String, Long>();
    public static ArrayList<Long> result = new ArrayList<Long>();
    public static Map teamOneMap = new HashMap<String, Integer>();
    public static Map teamTwoMap = new HashMap<String, Integer>();

    static void printCombination(int arr[], int n, int r) {
        // A temporary array to store all combination one by one
        int data[] = new int[r];

        // Print all combination using temprary array 'data[]'
        combinationUtil(arr, data, 0, n - 1, 0, r);
    }

    static void combinationUtil(int arr[], int data[], int start,
            int end, int index, int r) {
        if (index == r) {
            String teamOne = "";
            String teamTwo = "";
            long teamOneEfficiency = 0;
            long teamTwoEfficiency = 0;
            long ans = 0;
            for (int j = 0; j < r; j++) {
                teamOne += data[j] + " ";
                //System.out.print(data[j] + " ");
            }
            for (int i = 0; i < arr.length; i++) {
                boolean flag = false;
                for (int j = 0; j < data.length; j++) {
                    if (arr[i] == data[j]) {
                        flag = true;
                        break;
                    }
                }
                if (!flag) {
                    teamTwo += arr[i] + " ";
                }

            }
            if (map.containsKey(teamOne)) {
                teamOneEfficiency = (long) map.get(teamOne);
            }
            if (map.containsKey(teamTwo)) {
                teamTwoEfficiency = (long) map.get(teamTwo);

            }
            ans = teamOneEfficiency + teamTwoEfficiency;
            if (ans != 0) {
                result.add(ans);
            }
//            System.out.println("Team 1: " + teamOne);
//            System.out.println("Team 2: " + teamTwo);
            return;
        }
        for (int i = start; i <= end && end - i + 1 >= r - index; i++) {
            data[index] = arr[i];
            combinationUtil(arr, data, i + 1, end, index + 1, r);
        }
    }

    static long maximumEfficiency(int n, int m) {

        for (int i = 0; i < m; i++) {
            int numOfGrpMember = scanner.nextInt();
            long grpEfficiency = scanner.nextLong();
            scanner.nextLine();
            String grpMembers = scanner.nextLine();
            map.put(grpMembers + " ", grpEfficiency);
        }
        //Generating all combination from 0 to n
        int inpurArray[] = new int[n];
        for (int i = 0; i < n; i++) {
            inpurArray[i] = i + 1;
        }
        for (int j = 1; j < n; j++) {
            printCombination(inpurArray, n, j);
        }
        if (result.size() != 0) {
            return Collections.max(result);
        }
        return 0;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nm = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nm[0]);

        int m = Integer.parseInt(nm[1]);
        long result = maximumEfficiency(n, m);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();
        scanner.close();
    }

}
