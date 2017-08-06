package TriesContacts;

/**
 * Created by komes on 8/4/2017.
 */

import java.util.*;

public class Solution {
    public static class Trie {
        private static int NUMBER_OF_CHARACTERS = 26;
        Trie[] children = new Trie[NUMBER_OF_CHARACTERS];
        int count = 0;

        private static int getCharIndex(char c){
            return c -'a';
        }
        private Trie getChild(char c){
            return children[getCharIndex(c)];
        }
        private void setChild(char c, Trie trie){
            children[getCharIndex(c)]= trie;
        }
        public void add(String s){
            add(s,0);
        }
        private void add(String s, int index){
            count ++;
            if(index>=s.length()){
                //return
                return;
            }
            char current = s.charAt(index);
            Trie child = getChild(current);
            if(child == null){
                child = new Trie();
                setChild(current, child);
            }
            child.add(s, index+1);
        }
        public int findCount(String s){
            return findCount(s, 0);
        }
        private int findCount(String s, int index){
            if(index == s.length()){
                return count;
            }
            char current = s.charAt(index);
            Trie child = getChild(current);
            if(child == null){
                return 0;
            }
            return child.findCount(s, index+1);
        }
    }

    public static void main(String[] args) {
        Trie root = new Trie();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int a0 = 0; a0 < n; a0++){
            String op = in.next();
            String contact = in.next();
            if(op.equals("add") && contact !=null){
                root.add(contact);
            }else if (op.equals("find") && contact != null){
                int searchResult = root.findCount(contact);
                System.out.println(searchResult);
            }
        }
    }
}
