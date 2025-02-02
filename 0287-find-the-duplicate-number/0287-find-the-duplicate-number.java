class Solution {
    public int findDuplicate(int[] nums) {
        //Brute force
        // Arrays.sort(nums);
        // for(int i=0;i<nums.length-1;i++){
        //     if(nums[i]==nums[i+1]) return nums[i];
        // }
        // return -1;

        //optimized
        int n = nums.length;
        boolean[] flag = new boolean[n+1];
        for(int i:nums){
            if(flag[i]) return i;
            else flag[i] = true;
        }
        return -1;

        
    }
}