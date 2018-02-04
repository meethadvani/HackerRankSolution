/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Live_Contest;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author meet
 */
//Question Link : https://www.hackerrank.com/contests/hackerrank-hiring-contest/challenges/programming-competition/problem

public class Programming_Competition_HRH {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int max = 0;
        int index=0;
        String nameOfCandidate[] = new String[n];
        for (int a0 = 0; a0 < n; a0++) {
            String name = in.next();
            nameOfCandidate[a0] = name;
            int d = in.nextInt();
            int j = in.nextInt();
            int solvedQue = j - d;
            if (max < solvedQue) {
                max = solvedQue;
                index = a0;
            }
        }
        System.out.println(nameOfCandidate[index]+ " "+max);
    }
}
