/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursion;

import java.util.Scanner;

/**
 *
 * @author meet
 */
//Question Link : https://www.hackerrank.com/challenges/ctci-fibonacci-numbers/problem

public class Fibonacci_Number {

    public static int fibonacci(int n) {
        int result;
        // Complete the function.
        // return (n > 2) ? fibonacci(n - 1) + fibonacci(n - 2) : 1; (when 0 < n )
        if (n <= 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        } else {
            result = fibonacci(n - 1) + fibonacci(n - 2);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        System.out.println(fibonacci(n));
    }

}
