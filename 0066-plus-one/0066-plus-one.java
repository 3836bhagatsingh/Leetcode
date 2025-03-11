class Solution {
    public int[] plusOne(int[] nums) {
        int i = nums.length-1;
        while(i>=0){
            if(nums[i]<9){
                nums[i] = nums[i]+1;
                return nums;
            }
            else{
                nums[i]=0;
            }
            i--;
        }
        int[] arr = new int[nums.length+1];
        arr[0] = 1;
        return arr;
            }
}