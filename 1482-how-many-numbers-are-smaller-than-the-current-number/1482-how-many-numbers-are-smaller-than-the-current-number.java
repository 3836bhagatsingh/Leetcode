class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;
        int[] arr = new int[101];
        for(int num  : nums){
            arr[num]++;
        }
        for(int i = 1;i<101;i++){
            arr[i] = arr[i] + arr[i-1];
        }
        int[] ans = new int[n];
        for(int i=0;i<n;i++){
            ans[i] = nums[i]==0? 0 :  arr[nums[i]-1];
        }
        return ans;
    }
}

