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

/*Add a Number(between 0-9) to given Array on the last index and return newArray 
* input[9,0,5]+ 5 --->output[9,1,0]
* input[9,9,9]+ 1 --->output[1,0,0,0]
*/
public class AddNumToArray {

    public static int[] outputArray(int input[], int num) {
        int count = 1;
        int ans[] = new int[input.length];;
        int carry = 0;
       // ans[ans.length - 1] = num + input[input.length - 1];
        carry = num;
        for (int i = input.length - 1; i >= 0; i--) {
            int temp = carry + input[i];
            if (temp > 9) {
                ans[i] = temp - 10;
                carry = 1;
            } else {
                ans[i] = temp;
                carry = 0;
            }
        }
        int newAns[] = null;
        if (carry == 1) {
            newAns = new int[input.length + 1];
            newAns[0] = 1;
            for (int j = 0; j < ans.length; j++) {
                newAns[j + 1] = ans[j];
            }
            return newAns;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array_size = sc.nextInt();
        int input_array[] = new int[array_size];
        for (int i = 0; i < array_size; i++) {
            input_array[i] = sc.nextInt();
        }
        int sum[] = outputArray(input_array, 5);
        for (int j = 0; j < sum.length; j++) {
            System.out.print(sum[j] + " ");
        }
    }

}
