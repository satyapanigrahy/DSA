package dsa.arrays;

import java.util.HashMap;

public class LongestSubArrayWithSumK {
    public static void main(String[] args) {
        int nums[] = {2,0,0,0,3};
        int k=3;
        find(nums,k);
    }
    private static int find(int[] nums, int k) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int sum = 0,len = 0;
        for(int i=0;i<nums.length;i++){
            sum = sum+nums[i];
            if(sum==k)
                len = Math.max(len,i+1);
            if(hm.containsKey(sum-k))
                    len = Math.max(len,(i-hm.get(sum-k)));
            if(!hm.containsKey(sum))
                hm.put(sum,i);
        }
        return len;
    }
}
