/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author meet
 */

//Question Link : https://www.hackerrank.com/challenges/ctci-lonely-integer/problem

public class BitManipulation {
    
    public static int lonelyInteger(int[] a) {
        HashMap map =new HashMap();
        int result=0;
        for(int i=0;i<a.length;i++){
            if(map.containsKey(a[i])){
               int count=(int)map.get(a[i]);
               count++;
               map.put(a[i], count);
            }
            else
                map.put(a[i],1);
        }
        for (Iterator it = map.entrySet().iterator(); it.hasNext();) {
            Entry et = (Entry) it.next();
            if((int)et.getValue()< 2){
                result=(int)et.getKey();
            }
        }
        return result;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        System.out.println(lonelyInteger(a));
    }
    
}
