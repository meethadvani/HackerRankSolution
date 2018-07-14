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
//Question Link : https://www.hackerrank.com/challenges/ctci-fibonacci-numbers/problem
public class Fibonacci_Number {

    static int count = 0;
    static int count1 = 0;

    public static int fibonacci(int n) {
        //System.out.println("Count: " + count++);
        int result;
        // Complete the function.
        // return (n > 2) ? fibonacci(n - 1) + fibonacci(n - 2) : 1; (when 0 < n )
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            result = fibonacci(n - 1) + fibonacci(n - 2);
            System.out.print(result + " ");
        }
        return result;
    }

    //Without recursion
    public static int fibonacciWithoutRec(int n) {
        int result = 0;
        int end = 1;
        int start = 0;
        for (int i = 1; i < n; i++) {
            //System.out.println("Count WR: " + count1++);
            result = start + end;
            start = end;
            end = result;
            System.out.print(" " + result);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
//        System.out.println("Using recursion: " + fibonacci(n));
         System.out.println("Withot recursion: " + fibonacciWithoutRec(n));
    }

}
