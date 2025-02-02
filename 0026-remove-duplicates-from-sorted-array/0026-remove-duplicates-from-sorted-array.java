class Solution {
    public int removeDuplicates(int[] nums) {
        int k =0,n = nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]!=nums[k]){
                nums[++k] = nums[i];
            
            }
        }
        return k+1;
    }
}