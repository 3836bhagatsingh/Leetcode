class Solution {
    public int[] sortArrayByParity(int[] nums) {
        // Brute Force
        // int n = nums.length;
        // int k =0;
        // int[] arr = new int[n];
        // for(int i=0;i<n;i++){
        //     if(nums[i]%2==0){
        //         arr[k++] = nums[i];
        //     }
        // }
        // for(int i=0;i<n;i++){
        //     if(nums[i]%2!=0){
        //         arr[k++] = nums[i];
        //     }
        // }
        // return arr;

        //Optimized
        int n = nums.length,i=0,j=n-1;
        while(i<j){
            if(nums[i]%2==0) i++;
            else if (nums[j]%2==1){
                j--;
            }
            else{
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j--;
            }
        
        }
        return nums;



    }
}