class Solution {
    public int missingNumber(int[] nums) {
        //brute force
        // int n = nums.length;
        // for(int i=0;i<=n;i++){
        //     boolean flag = false;
        //     for(int j =0;j<n;j++){
        //         if(nums[j]==i) flag = true;
        //     }
        //     if(flag == false) return i;
        // }
        // return -1;

        //optimized
        int n  = nums.length,sum = 0;
        for(int i=0;i<n;i++){
            sum += nums[i];
        }
        return (n*(n+1))/2 - sum;
    }
}