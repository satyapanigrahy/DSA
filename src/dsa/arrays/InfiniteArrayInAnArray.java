package dsa.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class InfiniteArrayInAnArray {
    public static void main(String[] args) {
        int []arr = {1,2,3};
        int n = 3;
        List<List<Long>> queries = new ArrayList<>();
        List<Long> l1 = new ArrayList<>();
        l1.add(1L);l1.add(3L);
        List<Long> l2 = new ArrayList<>();
        l2.add(1L);l2.add(5L);
        queries.add(l1);
        queries.add(l2);
        int q = 2;
        List<Integer> l=sumInRanges(arr,n,queries,q);
        System.out.println(l);
    }

    private static List<Integer> sumInRanges(int[] arr, int n, List<List<Long>> queries, int q) {
        int sum = 0;
        List<Integer> l = new ArrayList<>();
        for(List li:queries){
            long L = (long) li.get(0);
            long R = (long) li.get(1);
            sum = 0;
            for(long i=L-1;i<=R-1;i++){
                if(i<n){
                    sum+=arr[(int) i];
                }
                else {
                    int s = (int) (i%n);
                    sum+=arr[s];
                }
            }
            l.add((int) (sum%(Math.pow(10,9)+7)));
        }
        return l;
    }
}
