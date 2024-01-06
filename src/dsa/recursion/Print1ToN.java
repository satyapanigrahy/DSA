package dsa.recursion;

public class Print1ToN {
    public static void main(String[] args) {
        print(5);
    }

    private static void print(int n) {
        if(n==1) {
            System.out.println(n);
            return;
        }
        print(n-1);
        System.out.println(n);
    }
}
