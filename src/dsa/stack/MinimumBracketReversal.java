package dsa.stack;

import java.util.Stack;

public class MinimumBracketReversal {
    public static void main(String[] args) {
        String input = "}}}{{{";
        int g = countBracketReversals(input);
    }

    private static int countBracketReversals(String input) {
        if(input.length()%2!=0)
            return -1;
        else if(input.length()==0)
            return 0;
        Stack<Character> st  = new Stack<>();
        int count = 0;
        for(int i=0;i<input.length();i++){
            if(input.charAt(i)=='{')
                st.push(input.charAt(i));
            else if(!st.isEmpty() && input.charAt(i)=='}' && st.peek()!='{') {
                st.push(input.charAt(i));
            }
            else if(!st.isEmpty() && input.charAt(i)=='}' && st.peek()=='{') {
                st.pop();
            }
            else if(st.isEmpty() && input.charAt(i)=='}')
                st.push(input.charAt(i));
        }
       while (!st.isEmpty()){
           char ch1 = st.pop();
           char ch2 = st.pop();
           if(ch1==ch2)
               count = count+1;
           else
               if(ch1=='{' && ch2=='}')
                   count = count+2;
               else
                   count = count+1;
       }
       return count;
    }

}
