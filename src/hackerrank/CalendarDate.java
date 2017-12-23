//Programs to find a new date by adding given number of days.[Note: Consider leap year also]
//like today date is 2-OCT-2017 , add 20 days to current Date then next date is 22-OCT-2017 
package hackerrank;

import java.util.Scanner;

/**
 *
 * @author meet
 */
public class CalendarDate {

    //String date="";
    public static void findDate(String d, long day) {

        System.out.println("-----------hello------");
        String monthName[] = {"JAN", "FEB", "MAR", "APR", "MAY", "JUN", "JUL", "AUG", "SEP", "OCT", "NOV", "DEC"};
        int month[] = new int[12];
        month[0] = 31;
        month[1] = 28;
        month[2] = 31;
        month[3] = 30;
        month[4] = 31;
        month[5] = 30;
        month[6] = 31;
        month[7] = 31;
        month[8] = 30;
        month[9] = 31;
        month[10] = 30;
        month[11] = 31;

        String date[] = d.split("-");
        int currentDay = Integer.parseInt(date[0]);
        String currentMonth = date[1];
        long currentYear = Long.parseLong(date[2]);
        // System.out.println("------------->"+currentYear+"-------------...."+currentDay);
        long days = day;
        int index = 0;
        for (int i = 0; i < days; i++) {
            if (currentYear % 4 == 0) {
                month[1] = 29;
            }
            currentDay += 1;
            for (int j = 0; j < 12; j++) {
                if (currentMonth.equals(monthName[j])) {
                    index = j;
                    break;
                }
            }
            if (currentDay > month[index]) {
                currentDay = currentDay - month[index];
                index++;
                if (index > 11) {
                    index = 0;
                    currentMonth = monthName[index];
                    currentYear += 1;
                }
                currentMonth = monthName[index];
            }

        }
        System.out.println("Date: " + currentDay + "-" + currentMonth + "-" + currentYear);
    }

    public static void main(String args[]) {
        String date = "06-AUG-2017";

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No of Days: ");
        long days = sc.nextLong();

        CalendarDate.findDate(date, days);

    }

}
