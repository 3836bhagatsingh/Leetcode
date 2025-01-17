class Solution {
   
    public int[] buildArray(int[] nums) {
        //not inplace
        // int[] ans = new int[nums.length];
        // for(int i=0;i<nums.length;i++){
        //     ans[i] = nums[nums[i]];
        // }
        // return ans;

        //inplace
          int n = nums.length;

    // Encode both old and new values in the array.
    for (int i = 0; i < n; i++) {
        nums[i] = nums[i] + n * (nums[nums[i]] % n);
    }
    for (int i = 0; i < n; i++) {
        nums[i] = nums[i] / n;
    }

    return nums;
        

    }
}