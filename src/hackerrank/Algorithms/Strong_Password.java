/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank.Algorithms;

import java.util.Scanner;

/**
 *
 * @author meet
 */
//Question Link : https://www.hackerrank.com/challenges/strong-password/problem
public class Strong_Password {

    static int minimumNumber(int n, String password) {
        // Return the minimum number of characters to make the password strong
        boolean capital = false;
        boolean small = false;
        boolean num = false;
        boolean special = false;
        int count = 0;

        for (int i = 0; i < password.length(); i++) {
            if (password.charAt(i) >= 65 && password.charAt(i) <= 90) {
                capital = true;
                continue;
            }
            if (password.charAt(i) >= 97 && password.charAt(i) <= 122) {
                small = true;
                continue;
            }
            if (password.charAt(i) >= 48 && password.charAt(i) <= 57) {
                num = true;
                continue;
            }
            if ((password.charAt(i) >= 35 && password.charAt(i) <= 38) || (password.charAt(i) >= 40 && password.charAt(i) <= 43) || (password.charAt(i) == 94) || password.charAt(i) == 64 || password.charAt(i) == 33 || password.charAt(i) == 45) {
                special = true;
            }
        }
        if (!capital) {
            ++count;
        }
        if (!small) {
            ++count;
        }
        if (!num) {
            ++count;
        }
        if (!special) {
            ++count;
        }
        if (password.length() < 6) {
            int temp = 6 - password.length();
            if (temp < count) {
                return count;
            }
            return temp;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String password = in.next();
        int answer = minimumNumber(n, password);
        System.out.println(answer);
        in.close();
    }

}
