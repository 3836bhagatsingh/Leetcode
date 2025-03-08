class Solution {
    public int maxArea(int[] nums) {
       int i=0,j=nums.length-1,max_area=0;
       while(i<j){
        int height = Math.min(nums[i],nums[j]);
        int width = j-i;
        max_area = Math.max(max_area,height*width);

        if(nums[i]<nums[j]) i++;
        else j--;
       }
       return max_area;
        
    }
}