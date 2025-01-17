class Solution {
    public int[] runningSum(int[] nums) {
        // Brute force
        // int n  = nums.length;
        // int[] arr = new int[n];
        // int sum =0;
        // for(int i=0;i<n;i++){
        //     sum = sum + nums[i];
        //     arr[i] = sum;
        // }
        // return arr;

        // optimized
        int n = nums.length;
        for(int i=1;i<n;i++){
            nums[i] = nums[i]+nums[i-1];
        }
        return nums;
    }
}
