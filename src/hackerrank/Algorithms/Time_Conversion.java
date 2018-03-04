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
//Question Link: https://www.hackerrank.com/challenges/time-conversion/problem
public class Time_Conversion {

    static String timeConversion(String s) {
        // Complete this function
        int length = s.length();
        String AM_PM = s.charAt(length - 2) + "" + s.charAt(length - 1);
        String time = s.replace(AM_PM, "");
        String timeArray[] = time.split(":");
        StringBuffer newTime = new StringBuffer();
        if (AM_PM.equals("PM") && Integer.parseInt(timeArray[0]) < 12) {
            int hour = 12 + Integer.parseInt(timeArray[0]);
            newTime.append(hour).append(":").append(timeArray[1]).append(":").append(timeArray[2]);
        }
        if (AM_PM.equals("PM") && Integer.parseInt(timeArray[0]) == 12) {
            int hour = Integer.parseInt(timeArray[0]);
            newTime.append(hour).append(":").append(timeArray[1]).append(":").append(timeArray[2]);
        }
        if (AM_PM.equals("AM") && Integer.parseInt(timeArray[0]) < 12) {
            int hour = Integer.parseInt(timeArray[0]);
            newTime.append("0" + hour).append(":").append(timeArray[1]).append(":").append(timeArray[2]);
        }
        if (AM_PM.equals("AM") && Integer.parseInt(timeArray[0]) == 12) {
            int hour = 12 - Integer.parseInt(timeArray[0]);
            newTime.append("0" + hour).append(":").append(timeArray[1]).append(":").append(timeArray[2]);
            //System.out.println("------>"+output);
        }
        //System.out.println("new Time : " + newTime.toString());
        //System.out.println("--->" + timeArray[0] + "  " + timeArray[1] + "  " + timeArray[2]);

        return newTime.toString();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = timeConversion(s);
        System.out.println(result);
    }
}
