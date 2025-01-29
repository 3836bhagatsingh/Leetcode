class Solution {
    public int maximumDifference(int[] nums) {
      int n = nums.length;
      int ans = -1;
      int min_ele = nums[0];
      for(int i=1;i<n;i++){
        if(nums[i]>min_ele)
        ans = Math.max(ans,nums[i]-min_ele);
        else 
        min_ele = nums[i];
      }
      return ans;


        
    }
}