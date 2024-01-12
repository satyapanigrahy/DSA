package dsa.preplaced.array;

public class ReverseSignedInteger {
    public static void main(String[] args) {
        int x = 1534236469;
        System.out.println(Integer.MAX_VALUE+"::"+Integer.MIN_VALUE);
        int y = reverse(x);

    }

    private static int reverse(int x) {
        long r =0;
        while(x!=0){
            int rem = x%10;
            r = r*10+rem;
            x = x/10;
        }
        r = r/10;
        if(r > Integer.MAX_VALUE || r<Integer.MIN_VALUE){
            return 0;
        }
        if(x<0){
            return (int)(-1*r);
        }
        return (int)r;
    }
}
