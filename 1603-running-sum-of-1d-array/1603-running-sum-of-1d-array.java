class Solution {
    public int[] runningSum(int[] nums) {
        // Brute force
        // int[] arr = new int[nums.length];
        // arr[0] = nums[0];
        // for(int i=1;i<nums.length;i++){
        //     arr[i] = arr[i-1]+nums[i];
        // }
        // return arr;

        // Optimized
        int n = nums.length;
        for(int i=1;i<n;i++){
            nums[i] = nums[i]+nums[i-1];
        }
        return nums;
    }
}