class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n = nums.length,k=0;
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            if(nums[i]<pivot){
                arr[k++] = nums[i];         
            }
        }
          for(int i=0;i<n;i++){
            if(nums[i]==pivot){
                arr[k++] = nums[i];         
            }
        }
         for(int i=0;i<n;i++){
            if(nums[i]>pivot){
                arr[k++] = nums[i];         
            }
        }
        return arr;
    }
}