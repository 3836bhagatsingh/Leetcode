class Solution {
    public void sortColors(int[] nums) {
        int zero = 0,one = 0,n = nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]==0) zero++;
            if(nums[i]==1) one++;
        }
        int k=0;
        for(int i=1;i<=zero;i++){
            nums[k++] = 0;
        }
        for(int i=1;i<=one;i++){
            nums[k++] = 1;
        }
        for(int i=1;i<=(n-zero-one);i++){
            nums[k++] = 2;
        }

        
    }
}