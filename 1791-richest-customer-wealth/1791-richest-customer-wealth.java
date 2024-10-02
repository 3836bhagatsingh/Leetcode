class Solution {
    public int maximumWealth(int[][] nums) {
        int ans = 0;
        for(int i=0;i<nums.length;i++){
            int sum = 0;
            for(int j=0;j<nums[i].length;j++){
                sum += nums[i][j];
            }
            ans = Math.max(ans,sum);
        }
        return ans;
    }
}