class Solution {
    public int maxSubArray(int[] nums) {
        // Btrute force
        // int ans = Integer.MIN_VALUE,n = nums.length;
        // int sum =0;
        // for(int i=0;i<n;i++){
        //     sum = 0;
        //     for(int j=i;j<n;j++){
        //         sum += nums[j];
        //         ans = Math.max(ans,sum);
        //     }
        // }
        // return ans;

        //Optimized Approach
        int sum = 0,ans =nums[0],n = nums.length;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            ans = Math.max(ans,sum);
             if(sum<0) sum = 0;
        }
        return ans;
    }
}