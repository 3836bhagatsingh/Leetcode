class Solution {
    public int[] sortArrayByParityII(int[] nums) {

        // Brute force
        // int n  = nums.length;
        // int[] arr = new int[n];
        // int even =0,odd =1;
        // for(int i=0;i<n;i++){
        //     if(nums[i]%2==0){
        //         arr[even] = nums[i];
        //         even +=2;
        //     }
        //     else{
        //         arr[odd] = nums[i];
        //         odd+=2;
        //     }
        // }
        // return arr;

        //optimized
        int n = nums.length;
        int even = 0,odd =1;
        while(even<n && odd<n){
            if(nums[odd]%2 < nums[even]%2){
                int temp = nums[odd];
                nums[odd] = nums[even];
                nums[even] = temp;
            }
            if(nums[even]%2==0) even = even +2;
            if(nums[odd]%2==1) odd = odd +2;
        }
        return nums;
    }
}