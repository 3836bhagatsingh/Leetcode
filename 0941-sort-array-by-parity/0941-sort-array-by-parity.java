class Solution {
    public void swap(int[] arr,int i,int j){
        int temp  = arr[i];
        arr[i]  = arr[j];
        arr[j] = temp;
    }
    public int[] sortArrayByParity(int[] nums) {
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                swap(nums,i,k);
                k++;
            }
        }
        return nums;
    }
}