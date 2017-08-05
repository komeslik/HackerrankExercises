package HeapsFindRunningMedian;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        PriorityQueue<Integer> highers = new PriorityQueue<>();
        PriorityQueue<Integer> lowers = new PriorityQueue<>(Comparator.reverseOrder());
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int a_i = 0; a_i < n; a_i++) {
            int number = in.nextInt();
            addNumber(number, lowers, highers);
            rebalance(lowers, highers);
            getMedian(lowers, highers);
        }
    }

    private static void addNumber(int number, PriorityQueue<Integer> lowers, PriorityQueue<Integer> highers) {
        if (lowers.isEmpty() || lowers.peek() > number) {
            lowers.add(number);
        }else{
            highers.add(number);
        }
    }
    private static void rebalance(PriorityQueue<Integer> lowers, PriorityQueue<Integer> highers){
        PriorityQueue<Integer> biggerHeap = lowers.size() > highers.size() ? lowers : highers;
        PriorityQueue<Integer> smallerHeap = lowers.size() > highers.size() ? highers : lowers;
        if(biggerHeap.size() - smallerHeap.size() > 1){
                smallerHeap.add(biggerHeap.poll());
        }
    }
    private static void getMedian(PriorityQueue<Integer> lowers, PriorityQueue<Integer> highers) {
        PriorityQueue<Integer> biggerHeap = lowers.size() > highers.size() ? lowers : highers;
        PriorityQueue<Integer> smallerHeap = lowers.size() > highers.size() ? highers : lowers;
        if(biggerHeap.size()==smallerHeap.size()){
            double currentMedian = (biggerHeap.peek()+smallerHeap.peek())/2.0;
            System.out.println(currentMedian);
        }else{
            double currentMedian = (double) biggerHeap.peek();
            System.out.println(currentMedian);
        }
    }


}

