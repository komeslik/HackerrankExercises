package SortingBubbleSort;

/**
 * Created by komes on 8/6/2017.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        bubbleSort(a);

    }
    private static void bubbleSort(int[] a){
        int totalSwaps=0;
        for(int i=0; i<a.length; i++){
            int numSwaps=0;
            for(int j=0; j<a.length-1; j++){
                if(a[j]>a[j+1]){
                    swap(a,j,j+1);
                    numSwaps++;
                }
            }
            totalSwaps+=numSwaps;
            if (numSwaps==0){
                System.out.println("Array is sorted in "+totalSwaps+" swaps.");
                System.out.println("First Element: "+ a[0]);
                System.out.println("Last Element: "+ a[a.length-1]);
                break;
            }
        }

    }
    private static void swap(int[] a, int index1, int index2){
        int temp = a[index1];
        a[index1]=a[index2];
        a[index2]=temp;
    }
}