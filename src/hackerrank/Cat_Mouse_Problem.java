/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;

import java.util.Scanner;

/**
 *
 * @author meet
 */
//Question Link : https://www.hackerrank.com/challenges/cats-and-a-mouse/problem 

public class Cat_Mouse_Problem {

    static String catAndMouse(int x, int y, int z) {
        // Complete this function
        int catA = Math.abs(z - x);
        int catB = Math.abs(z - y);
        if (catA > catB) {
            return "Cat B";
        }
        if (catB > catA) {
            return "Cat A";
        } else {
            return "Mouse C";
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for (int a0 = 0; a0 < q; a0++) {
            int x = in.nextInt();
            int y = in.nextInt();
            int z = in.nextInt();
            String result = catAndMouse(x, y, z);
            System.out.println(result);

        }
        in.close();
    }

}
