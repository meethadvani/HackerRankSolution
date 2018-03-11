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
//Question Link: https://www.hackerrank.com/challenges/apple-and-orange/problem
public class Apple_Orange {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int[] apple = new int[m];
        for (int apple_i = 0; apple_i < m; apple_i++) {
            apple[apple_i] = in.nextInt();
        }
        int[] orange = new int[n];
        for (int orange_i = 0; orange_i < n; orange_i++) {
            orange[orange_i] = in.nextInt();
        }
        int app[] = new int[m];
        int org[] = new int[n];
        int c = 0;
        int d = 0;
        for (int i = 0; i < m; i++) {
            //if(apple[i]<0)
            app[i] = a + apple[i];
            if (s <= app[i] && t >= app[i]) {
                c++;
            }
        }
        for (int i = 0; i < n; i++) {
            //if(apple[i]<0)
            org[i] = b + orange[i];
            if (t >= org[i] && s <= org[i]) {
                d++;
            }
        }
        System.out.println(c);
        System.out.println(d);
    }

}
