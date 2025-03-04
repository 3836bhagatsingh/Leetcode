class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n = nums.length;
        int c=0,k=0;
        int[] ans = new int[n];
        for(int i =0;i<n;i++){
            if(nums[i]<pivot){
                ans[k++] = nums[i];
            }
            else if(nums[i]==pivot) c++;
        }
        for(int i=1;i<=c;i++){
            ans[k++] = pivot;
        }
        for(int i =0;i<n;i++){
            if(nums[i]>pivot){
                ans[k++] = nums[i];
            }
        }
        return ans;

    }
}