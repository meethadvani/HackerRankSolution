/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerRank;

/**
 *
 * @author meet
 */
//Question LINK : https://www.hackerrank.com/challenges/ctci-making-anagrams/problem 
import java.util.*;

public class Anagrams {

    /**
     * @param args the command line arguments
     */
    public static int numberNeeded(String first, String second) {
        //String bigString;
        int count, result = 0;
        //Put first String's Character into hashMap
        HashMap<Character, Integer> mapFirst = new HashMap<>();
        for (int i = 0; i < first.length(); i++) {
            if (mapFirst.containsKey(first.charAt(i))) {
                int value = mapFirst.get(first.charAt(i));
                value++;
                mapFirst.put(first.charAt(i), value);
            } else {
                mapFirst.put(first.charAt(i), 1);
            }
        }
         //Put second String's Character into hashMap
        HashMap<Character, Integer> mapSecond = new HashMap<>();
        for (int i = 0; i < second.length(); i++) {
            if (mapSecond.containsKey(second.charAt(i))) {
                int value = mapSecond.get(second.charAt(i));
                value++;
                mapSecond.put(second.charAt(i), value);
            } else {
                mapSecond.put(second.charAt(i), 1);
            }
        }

        //compare one hashMap key to another hashMap key
        for (Character key : mapSecond.keySet()) {
            // System.out.println("----key----: " + key + "-----valueSecond----: " + mapSecond.get(key) + "---valueFirst: " + mapFirst.get(key));
            if (mapFirst.containsKey(key)) {
                count = (mapFirst.get(key) >= mapSecond.get(key)) ? mapFirst.get(key) - mapSecond.get(key) : mapSecond.get(key) - mapFirst.get(key);
                result += count;
                mapFirst.remove(key);
                //System.out.println("---------result------" + result + "------Count-----" + count);
            } else {
                result+=mapSecond.get(key);
            }
        }
        //Counting Remaining key with value in first hashMap
        for (Character remaining : mapFirst.keySet()) {
            result += mapFirst.get(remaining);
        }
        return result;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
    }

}
