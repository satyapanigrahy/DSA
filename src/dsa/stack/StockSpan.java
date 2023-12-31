package dsa.stack;

import java.util.Stack;

public class StockSpan {
    public static void main(String[] args) {
        int price[] = {60, 70, 80, 90};
        stockSpan(price);
    }

    private static int[] stockSpan(int[] price) {
        int []r = new int[price.length];
        Stack<int[]> st = new Stack<>();
        for(int i=0;i<price.length;i++){
            if(st.isEmpty())
                r[i] = 1;
            else if(!st.isEmpty() && price[i]<=st.peek()[0])
                r[i] = i-st.peek()[1];
            else if(!st.isEmpty() && price[i]>=st.peek()[0]) {
                while (!st.isEmpty() && price[i] > st.peek()[0])
                    st.pop();
                if (st.isEmpty())
                    r[i] = 1;
                else
                    r[i] = i - st.peek()[1];
            }
            st.push(new int[]{price[i],i});
        }
        return r;
    }
}
