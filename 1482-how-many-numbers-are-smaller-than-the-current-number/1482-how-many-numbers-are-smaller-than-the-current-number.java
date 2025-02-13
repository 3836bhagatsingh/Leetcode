class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int k=0;
        for(int i=0;i<nums.length;i++){
            int c=0;
            for(int j = 0;j<nums.length;j++){
                if(nums[j]<nums[i]){
                    c++;
                }
            }
            ans[k++] = c;
        }
        return ans;
    }
}