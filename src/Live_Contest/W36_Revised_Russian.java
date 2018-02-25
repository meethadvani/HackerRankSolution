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
//Question Link : https://www.hackerrank.com/contests/w36/challenges/revised-russian-roulette/problem
//Note : Half test cases pass

public class W36_Revised_Russian {
    static int[] revisedRussianRoulette(int[] doors) {
        // Complete this function
        int count = 0;
        int maxCount=0;
        int ans[]=new int[2];
        for (int i = 0; i < doors.length - 1; i++) {
            if (doors[i] == 1) {
                
                if (doors[i] == doors[i + 1]) {
                    ++i;
                    maxCount+=2;
                }
                count++;
            }
        }
        ans[0]=count;
        ans[1]=maxCount;
        return ans;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] doors = new int[n];
        int result[]={};
        for (int doors_i = 0; doors_i < n; doors_i++) {
            doors[doors_i] = in.nextInt();
        }
        result = revisedRussianRoulette(doors);
//        for (int i = 0; i < result.length; i++) {
//            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
//        }
//        System.out.println("");
        System.out.print(result[0] + " ");
        System.out.println(result[1]);

        in.close();
    }
}
