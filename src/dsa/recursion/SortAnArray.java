package dsa.recursion;

public class SortAnArray {
    public static void main(String[] args) {
        int[] a = {4, 6, 2, 5, 7, 9, 1, 3};
        sort(a, 0, a.length - 1);
        int x = 502309670;
    }

    private static void sort(int[] a, int l, int h) {
        if (l >= h)
            return;
        int partition = partition(a, l, h);
        sort(a, l, partition - 1);
        sort(a, partition + 1, h);
    }

    private static int partition(int[] a, int l, int h) {
        int piv = a[l];
        int left = l;
        int right = h;
        while (right > left) {
            while (a[left] <= piv)
                left++;
            while (a[right] > piv)
                right--;
            if(right>left) {
                int t = a[left];
                a[left] = a[right];
                a[right] = t;
            }
        }
        int t = a[right];
        a[right] = a[l];
        a[l] = t;
        return right;
    }
}
