class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int c=0,
            ans =0,
            n = nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]==1) c++;
            else{ 
                ans = Math.max(c,ans);
                c=0;
            }
        }
        return Math.max(ans,c);
    }
}