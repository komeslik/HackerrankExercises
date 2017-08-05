package StacksBalancedBrackets;
import java.util.*;

public class Solution {

    public static boolean isBalanced(String expression) {
        if (expression.length()%2!=0){
            return false;
        }
        Stack<Character> leftBrackets = new Stack<>();
        for(int i=0; i<expression.length(); i++){
            char currentChar= expression.charAt(i);
            if(isleftBracket(currentChar)){
                leftBrackets.push(currentChar);
            }else{
                if(leftBrackets.isEmpty())return false;
                char leftBracket = leftBrackets.pop();
                if(!bracketsMatch(leftBracket, currentChar)) {
                    return false;
                }
            }
        }
        return leftBrackets.isEmpty();
    }

    private static boolean bracketsMatch(char leftBracket, char rightBracket) {
        return(leftBracket=='('&&rightBracket==')'||
                leftBracket=='{'&&rightBracket=='}'||
                leftBracket=='['&&rightBracket==']');
    }

    private static boolean isleftBracket(char currentChar) {
        return(currentChar=='('||currentChar=='{'||currentChar=='[');
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            String expression = in.next();
            System.out.println( (isBalanced(expression)) ? "YES" : "NO" );
        }
    }
}
