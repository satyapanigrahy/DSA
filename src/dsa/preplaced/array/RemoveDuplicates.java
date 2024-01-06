package dsa.preplaced.array;

//leetcode 26
public class RemoveDuplicates {
    public static void main(String[] args) {
        int []nums = {0,0,1,1,1,2,2,3,3,4};
        removeDuplicates(nums);
    }
    public static int removeDuplicates(int[] nums) {
        int nn[] = new int[nums.length];
        nn[0] = nums[0];
        int m=0;
        for(int i=1;i<nums.length;i++){
            if(nn[m]!=nums[i]){
                nn[m+1]=nums[i];
                m=m+1;
            }
        }
        nums = new int[m+1];
        for(int i=0;i<nums.length;i++){
            nums[i] = nn[i];
        }
        return m;
    }
}
