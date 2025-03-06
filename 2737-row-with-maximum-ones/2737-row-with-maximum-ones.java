class Solution {
    public int[] rowAndMaximumOnes(int[][] nums) {
        int r=0,max_1=0,n=nums.length;
        for(int i=0;i<n;i++){
            int c=0;
            for(int j=0;j<nums[i].length;j++){
                if(nums[i][j]==1) c++;
            }
            if(c>max_1) {
                max_1 = c;
                r=i;
            }
        }
       int[] ans = new int[2];
       ans[0] = r;
       ans[1] = max_1;
        return ans;
        
    }
}