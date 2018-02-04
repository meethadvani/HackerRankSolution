/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author meet
 *Question : https://www.hackerrank.com/challenges/ctci-contacts/problem
 *Logic : add all the substring of name into hashmap and then find.
 * like if name is meet --> add m, add me, add mee, add meet
 */
public class ContactSearch {

    public static HashMap<String, Integer> map = new HashMap<String, Integer>();

    public static void addContact(String name) {

        for (int i = 0; i < name.length(); i++) {
            String partialName = name.substring(0, i);
            if (map.containsKey(partialName)) {
                int frequency = map.get(partialName);
                map.put(partialName, ++frequency);
            } else {
                map.put(partialName, 1);
            }
        }
    }

    public static int findContact(String name) {
        if (map.containsKey(name)) {
            int ans = map.get(name);
            return ans;
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList a = new ArrayList<>();
        for (int a0 = 0; a0 < n; a0++) {
            String op = in.next();
            String contact = in.next();
            if (op.equals("add")) {
                addContact(contact);
            } else if (op.equals("find")) {
                a.add(findContact(contact));
            }
        }
        for (int i = 0; i < a.size(); i++) {
            System.out.println(a.get(i));
        }
    }
}
