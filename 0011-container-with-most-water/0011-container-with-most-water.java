class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int left=0;
        int right= n-1;
        int max=0;
        while(left<right){
        int width= right-left;
        int minheight= Math.min(height[left],height[right]);
        int water= width*minheight;
        max= Math.max(max,water);
        if(height[left]<height[right]){
            left++;
        }
        else{
            right--;
        }
        }
        return max;


        
    }
}