/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Live_Contest;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author meet
 */
//Question Link : https://www.hackerrank.com/contests/hackerrank-hiring-contest/challenges/winning-lottery-ticket
//Note : not passes all the test cases dua to timeout

public class Winning_LotteryTickets_HRH {

    static int winningLotteryTicketTemp(String[] tickets) {
        int a[]=new int[tickets.length];
        for(int i=0;i<tickets.length;i++){
            for(int j=0;j<tickets[i].length();j++){
                
            }
        }
        
        return 1;
    }

    static long winningLotteryTicket(String[] tickets) {
        // Complete this function
        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> resultMap = new HashMap<>();
        long count = 0;

        for (int i = 0; i < tickets.length; i++) {
            for (int j = 0; j < tickets[i].length(); j++) {
                map.put(tickets[i].charAt(j), 1);
            }
            for (int k = i + 1; k < tickets.length; k++) {
                resultMap = (HashMap) map.clone();
                for (int l = 0; l < tickets[k].length(); l++) {
                    if (!map.containsKey(tickets[k].charAt(l))) {
                        resultMap.put(tickets[k].charAt(l), 1);
                    }
                }
                if (resultMap.size() == 10) {
                    count++;
                    //System.out.println("Unique pair of tickets--->"+tickets[i] +" & "+tickets[k]);
                }
                resultMap.clear();
            }
            map.clear();
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] tickets = new String[n];
        for (int tickets_i = 0; tickets_i < n; tickets_i++) {
            tickets[tickets_i] = in.next();
        }
        long result = winningLotteryTicket(tickets);
        System.out.println(result);
        in.close();
    }

}
