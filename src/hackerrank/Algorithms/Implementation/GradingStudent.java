/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank.Algorithms.Implementation;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author meet
 */
//Question Link : https://www.hackerrank.com/challenges/grading/problem
public class GradingStudent {

    static int[] gradingStudents(int[] grades) {

        int finalGrades[] = new int[grades.length];
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] < 38) {
                finalGrades[i] = grades[i];
                continue;
            } else {
                int division = grades[i] / 5;
                int temp = division + 1;
                int tempGrade = temp * 5;
                if (tempGrade - grades[i] < 3) {
                    finalGrades[i] = tempGrade;
                } else {
                    finalGrades[i] = grades[i];
                }
            }
        }
        return finalGrades;
    }
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(scan.nextLine().trim());

        int[] grades = new int[n];

        for (int gradesItr = 0; gradesItr < n; gradesItr++) {
            int gradesItem = Integer.parseInt(scan.nextLine().trim());
            grades[gradesItr] = gradesItem;
        }

        int[] result = gradingStudents(grades);

        for (int results = 0; results < result.length; results++) {
            System.out.println(result[results]);
        }
//        for (int resultItr = 0; resultItr < result.length; resultItr++) {
//            bw.write(String.valueOf(result[resultItr]));
//
//            if (resultItr != result.length - 1) {
//                bw.write("\n");
//            }
//        }
//        bw.newLine();
//
//        bw.close();
    }

}
