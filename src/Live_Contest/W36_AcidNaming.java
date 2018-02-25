/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Live_Contest;

import java.util.Scanner;

/**
 *
 * @author meet
 */
//Question Link : https://www.hackerrank.com/contests/w36/challenges/acid-naming

public class W36_AcidNaming {

    static String acidNaming(String acid_name) {
        // Complete this function
        String ans="";
        if (acid_name.matches("hydro." + "*" + ".ic") || acid_name.equals("hydroic")) {
            ans = "non-metal acid";
        } else if (acid_name.matches(".*" + ".ic") || acid_name.equals("ic")) {
          ans = "polyatomic acid";
        }
        else{
           ans = "not an acid";
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int a0 = 0; a0 < n; a0++){
            String acid_name = in.next();
            String result = acidNaming(acid_name);
            System.out.println(result);
        }
        in.close();
    }
}
