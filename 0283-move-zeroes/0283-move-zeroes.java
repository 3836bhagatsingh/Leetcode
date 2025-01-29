class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        if(n==0 || n==1) return;

        // Brute force approach
        // int[] arr = new int[n];
        // int k = 0;
        // for(int i=0;i<n;i++){
        //     if(nums[i]!=0){
        //         arr[k++] = nums[i];
        //     }
        // }
        //  for(int i=0;i<n;i++){   
        //         nums[i] = arr[i];   
        // }

        // Optimized Approach
        // int k=0;
        // for(int i=0;i<n;i++){
        //     if(nums[i]!=0){
        //         nums[k++] = nums[i];
        //     }
        // }
        // while(k<n){
        //     nums[k++]=0;

        // }

        // some different method
        int s = 0;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                s++;
            }
            else if(s>0){
                int temp = nums[i];
                nums[i] = 0;
                nums[i-s] = temp;

            }
        }
        
    }
}