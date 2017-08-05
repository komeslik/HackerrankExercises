import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int[] solve(int[] grades) {
        // Complete this function
        int[] result = new int[grades.length];
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] < 38 ||(grades[i] * 2) % 10 <= 5) {
                result[i] = grades[i];
            } else if ((grades[i] * 2) % 10 > 5) {
                double a = grades[i] / 5.0;
                result[i] = (int)(Math.round(a)*5.0);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] grades = new int[n];
        for (int grades_i = 0; grades_i < n; grades_i++) {
            grades[grades_i] = in.nextInt();
        }
        int[] result = solve(grades);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");


    }
}
