class Solution {
    public int longestOnes(int[] nums, int k) {
        int left =0,zerocount=0,n = nums.length,ans = 0;;
        for(int right =0;right<n;right++){
            if(nums[right]==0){
                zerocount++;
            }
            while(zerocount>k){
                if(nums[left]==0){
                    zerocount--;
                }
                left++;
            }
            ans = Math.max(ans,right-left+1);
        }
        return ans;

    }
}