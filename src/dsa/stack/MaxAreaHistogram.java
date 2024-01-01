package dsa.stack;

import java.util.Stack;

public class MaxAreaHistogram {
    public static void main(String[] args) {
        int a[] = {6,2,5,4,5,1,6};
        maximumArea(a);
    }

    private static void maximumArea(int[] a) {
        int pseudoIndex = -1;
        int left[] = new int[a.length];
        int right[] = new int[a.length];
        Stack<int[]> st = new Stack<>();
        for(int i=0;i<a.length;i++){
            if(st.isEmpty())
                left[i]=pseudoIndex;
            else if(!st.isEmpty() && st.peek()[0]<a[i]){
                left[i] = st.peek()[1];
            }
            else if(!st.isEmpty() && st.peek()[0]>a[i]){
                while (!st.isEmpty() && st.peek()[0]>a[i])
                    st.pop();
                if(st.isEmpty())
                    left[i] = pseudoIndex;
                else
                    left[i] = st.peek()[1];
            }
            st.push(new int[] {a[i],i});
        }
        while (!st.isEmpty())
            st.pop();
        pseudoIndex = a.length;
        for(int i=a.length-1;i>=0;i--){
            if(st.isEmpty())
                right[i]=pseudoIndex;
            else if(!st.isEmpty() && st.peek()[0]<a[i]){
                right[i] = st.peek()[1];
            }
            else if(!st.isEmpty() && st.peek()[0]>a[i]){
                while (!st.isEmpty() && st.peek()[0]>a[i])
                    st.pop();
                if(st.isEmpty())
                    right[i] = pseudoIndex;
                else
                    right[i] = st.peek()[1];
            }
            st.push(new int[] {a[i],i});
        }
        int width[] = new int[a.length];
        for(int i=0;i<width.length;i++){
            width[i] = right[i]-left[i]-1;
        }
        int area[] = new int[a.length];
        for(int i=0;i<area.length;i++){
            area[i] = width[i]*a[i];
        }
    }
}
