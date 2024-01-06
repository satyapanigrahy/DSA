package dsa.preplaced.array;

import java.util.HashMap;

public class TwoSumProblem {
    public static void main(String[] args) {
        int []nums = {-1,-2,-3,-4,-5};
        int target = -8;
        //logic
        twoSum(nums,target);
    }
    public static int[] twoSum(int[] nums, int target) {
        int res[] = new int[2];
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0; i<nums.length;i++){
            hm.put(nums[i],i);
        }
        for(int j=0;j<nums.length;j++){
            int r = target-nums[j];
            if(hm.containsKey(r)){
                if(j<hm.get(r)) {
                    res[0] = j;
                    res[1] = hm.get(r);
                    break;
                }
            }
        }
        return res;
    }
}
