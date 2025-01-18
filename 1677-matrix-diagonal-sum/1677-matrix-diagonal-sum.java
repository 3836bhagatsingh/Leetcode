class Solution {
    public int diagonalSum(int[][] mat) {
        // Brute force
        // int sum =0,n = mat.length;
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<n;j++){
        //         if(i==j || (i+j)==n-1) sum += mat[i][j];
        //     }
        // } 
        // return sum;

        // Optimized
        int n = mat.length,sum =0;
        for(int i=0;i<n;i++){
            sum =  sum + mat[i][i] + mat[n-1-i][i];
        }
         if(n%2!=0) sum -= mat[n/2][n/2];
        return sum;
    }
}