package dsa.stack;

import java.util.Stack;

public class Games {
    public static void main(String[] args) {
        String []ops = {"5","-2","4","C","D","9","+","+"};
        callPoints(ops);
    }

    private static int callPoints(String[] ops) {
        int result = Integer.MIN_VALUE;
        Stack<String> st = new Stack<>();
        for(int i=0;i<ops.length;i++){
            if(st.isEmpty())
                st.push(ops[i]);
            else if(!st.isEmpty() && ops[i]=="C"){
                st.pop();
            }
            else if(!st.isEmpty() && ops[i]=="D"){
                int s = Integer.parseInt(String.valueOf(st.pop()));
                st.push(""+(s*2));
            }
            else if(!st.isEmpty() && ops[i]=="+") {
                int s = Integer.parseInt(String.valueOf(st.pop()));
                int l = Integer.parseInt(String.valueOf(st.peek()));
                st.push("" + (s + l));
            }
            else
                st.push(ops[i]);
        }
        while (!st.isEmpty()){
            if(result<Integer.parseInt(st.peek()))
                result = Integer.parseInt(st.peek());
            else
                result = Integer.parseInt(st.peek())+result;
            st.pop();
            }

        return result;
    }

}
