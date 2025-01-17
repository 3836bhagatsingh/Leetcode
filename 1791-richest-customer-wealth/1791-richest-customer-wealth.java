class Solution {
    public int maximumWealth(int[][] accounts) {
        int n =accounts.length,
            sum=0,
            ans =0;
        for(int i=0;i<n;i++){
            sum = 0;
            for(int j=0;j<accounts[0].length;j++){
                sum = sum + accounts[i][j];
            }
            ans = Math.max(ans,sum);
        }
        return ans;
    }
}