package dsa.recursion;

public class KthSymbolGrammer {
    public static void main(String[] args) {
        System.out.println(kthGrammar(2,2));
    }
    public static int kthGrammar(int n, int k) {
        if(n==1)
            return 0;
        int mid = (int) Math.pow(2,(n-1))/2;
        if(k<=mid)
            return kthGrammar(n-1,k);
        else{
            int c = kthGrammar(n,k-mid);
            if(c==0)
                return 1;
            else
                return 0;
        }
    }
}
