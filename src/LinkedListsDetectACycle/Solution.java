package LinkedListsDetectACycle;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by komes on 7/11/2017.
 */
public class Solution {
    static class Node{
        int data;
        Node next;

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
    public static boolean hasCycle(Node head) {
//        HashMap<Integer, Integer> FrequencyMap= new HashMap<>();
//        if(head == null){
//            return false;
//        }
//        Trie ptr = head;
//        while(ptr.next != null){
//            if(FrequencyMap.get(ptr.data)==null||FrequencyMap.get(ptr.data)==0){
//                FrequencyMap.put(ptr.data, 1);
//            }else if(FrequencyMap.get(ptr.data)>=1){
//                return true;
//            }
//            }
//        return false;
        Node slow = head;
        Node fast = head.next;
        int i = 0;
        while(i<300){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){return false;}
            i++;
        }
        return true;
    }
    public static void main(String[] args) {
        Node a = new Node(1, null);
        Node b= new Node (2, a);
        a.next=b;
        System.out.println(hasCycle(a));
    }
}
