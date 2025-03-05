class Solution {
    public int[] applyOperations(int[] nums) {
        int n = nums.length,index =0;
        for(int i=0;i<n;i++){
            if( i<n-1 && nums[i]==nums[i+1] && nums[i]!=0){
                nums[i] = nums[i]*2;
                nums[i+1] = 0;
            }
            if(nums[i]!=0){
                if(i != index){
                    int temp = nums[i];
                    nums[i] = nums[index];
                    nums[index] = temp;
                }
                index++;
            }
        }
        return nums;
    }
}