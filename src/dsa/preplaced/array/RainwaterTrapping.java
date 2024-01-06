package dsa.preplaced.array;

//leetcode 11
public class RainwaterTrapping {
    public static void main(String[] args) {
        int height[] = {1,8,6,2,5,4,8,3,7};
        int result = maxArea(height);
        System.out.println(result);
    }
    public static int maxArea(int[] height) {
        int[] left = new int[height.length];
        int[] right = new int[height.length];
        left[0]=0;
        right[height.length-1] = height.length-1;
        int max = height[0];
        int mxPos = 0;
        for(int i=1;i<height.length;i++){
            if(height[i]>max){
                max = height[i];
                mxPos = i;
            }
            left[i] = mxPos;
        }
        mxPos = height.length-1;
        max = height[height.length-1];
        for(int i=height.length-2;i>=0;i--){
            if(height[i]>max){
                max = height[i];
                mxPos = i;
            }
            right[i] = mxPos;
        }
        int area[] = new int[height.length];
        max = Integer.MIN_VALUE;
        for(int i=0;i<area.length;i++){
            max = Math.max(max,(height[i])*(right[i]-left[i]));
        }
        return max;
    }
}
