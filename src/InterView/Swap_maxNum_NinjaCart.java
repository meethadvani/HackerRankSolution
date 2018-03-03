/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterView;

import java.util.Scanner;

/**
 *
 * @author meet
 */
//Company Name: NinjaCart
//Question Link(May be they remove) : https://www.hackerrank.com/contests/ninjacart-march3/challenges/do-you-even-swap/problem
/*
Question:You are given a positive integer 'a' that has no leading zeroes. 
You can swap two adjacent decimal digits of this number. What is the maximum number you can get in t swaps? 
Sample input : 1234 6
Expected Output : 4321
Sample input : 9022 2
Expected Output : 9220
*/

public class Swap_maxNum_NinjaCart {

    static void maxNumber(String input, int count) {
        int maxNum = 0;
        int index = 0;
        int start = 0;
        char inpt[] = new char[input.length()];
        inpt = input.toCharArray();
        while (count > 0) {
            for (int i = start; i < inpt.length; i++) {
                if (maxNum < Integer.parseInt(inpt[i] + "")) {
                    maxNum = Integer.parseInt(inpt[i] + "");
                    index = i;
                }
            }
            if (index == start) {
                start++;
                maxNum = 0;
                continue;
            }
            char temp = inpt[index];
            inpt[index] = inpt[index - 1];
            inpt[index - 1] = temp;
            --count;
            maxNum = 0;
        }
        for (int i = 0; i < inpt.length; i++) {
            System.out.print(inpt[i]);
        }
//        return 1;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner sc = new Scanner(System.in);
        String inputNumber = sc.next();
        int swapCount = sc.nextInt();
        maxNumber(inputNumber, swapCount);

    }
}
