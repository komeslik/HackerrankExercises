package ArraysLeftRotation;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] b = new int[n];
        int index=0;
        for(int i=k; i<n; i++){
            b[index]=a[i];
            index++;
        }
        for(int i=0; i<k; i++){
            b[index]= a[i];
            index++;
        }
        for(int i=0;i<b.length;i++){
            System.out.print(b[i] + " ");
        }
    }
}
