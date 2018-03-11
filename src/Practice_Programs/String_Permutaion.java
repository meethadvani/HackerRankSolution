/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practice_Programs;
import java.util.Scanner;

/**
 *
 * @author meet
 */
public class String_Permutaion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input=sc.next();
        permutation(input);
    }

    public static void permutation(String str) {
        permutation("", str);
    }

    private static void permutation(String prefix, String str) {
        int n = str.length();
        if (n == 0) {
            System.out.println(prefix);
        } else {
            for (int i = 0; i < n; i++) {
                permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1, n));
            }
        }
    }

}
