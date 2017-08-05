package MakingAnagrams;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution {
    public static int numberNeeded(String first, String second) {
        int[] chars= new int[26];
        int result = 0;
        for(int i=0; i<first.length();i++){
            char c = first.charAt(i);
            chars[((int)c)-97]++;
        }
        for(int i=0; i<second.length();i++){
            char c = second.charAt(i);
            chars[((int)c)-97]--;
        }
        for(int i=0;i<chars.length;i++) {
            if(chars[i]!=0){
                result+=Math.abs(chars[i]);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
    }
}
