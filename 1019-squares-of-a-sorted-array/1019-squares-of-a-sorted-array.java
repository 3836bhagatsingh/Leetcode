class Solution {
    public int[] sortedSquares(int[] nums) {
        //Approach 1
        // int n = nums.length;
        // for(int i=0;i<n;i++){
        //     nums[i] = nums[i]*nums[i];
        // }
        // Arrays.sort(nums);
        // return nums;

        // Approach 2
        int n = nums.length,i=0,j = n-1,k=n-1;
        int[] arr = new int[nums.length];
        while(i<=j){
            int a = nums[i]*nums[i];
            int b = nums[j]*nums[j];
            if(a < b ){
                arr[k--] = b;
                j--;
            }
            else{
                arr[k--] = a;
                i++;
            }

        }
        return arr;






    }
}