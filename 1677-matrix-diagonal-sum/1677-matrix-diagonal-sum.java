class Solution {
    public int diagonalSum(int[][] nums) {
        int sum=0,n=nums.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j) sum += nums[i][j];
                if((i+j)==(n-1)) sum+= nums[i][j];
            }
        }
        if(n%2==1) sum = sum-nums[n/2][n/2];
        return sum;
        
    }
}