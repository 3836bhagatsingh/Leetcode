class Solution {
    public int arraySign(int[] nums) {
        for(int i =0;i<nums.length;
        i++){
            if(nums[i]==0) return 0;
            if(nums[i]>0) nums[i] = 1;
            else nums[i] = -1;
        }
        int ans = 1;
        for(int i =0;i<nums.length;i++){
            ans = ans *  nums[i];
        }
        
        return ans;
    }
}