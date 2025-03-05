class Solution {
    public void moveZeroes(int[] nums) {
        
        int c=0;
        int n = nums.length;
        if(n<=1) return;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
               c++;
            }
            else{
                nums[i-c]=nums[i];
            }
        }
        c = n-c;
        while(c<n){
            nums[c++]=0;
            
        }

        
    }
}