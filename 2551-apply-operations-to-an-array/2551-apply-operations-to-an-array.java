class Solution {
    public int[] applyOperations(int[] nums) {
        int n = nums.length;
        for(int i=0;i<n-1;i++){
            if(nums[i]==nums[i+1]){
                nums[i] = 2*nums[i];
                nums[i+1]=0;
            }
        }
        int snowball =0;
        for(int i=0;i<n;i++){
            if(nums[i]==0) snowball++;
            else if(snowball>0){
                nums[i-snowball] = nums[i];
                nums[i] = 0;
            }
        }
        return nums;
    }
}