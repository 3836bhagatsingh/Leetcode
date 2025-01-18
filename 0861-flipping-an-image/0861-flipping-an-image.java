class Solution {
    public int[][] flipAndInvertImage(int[][] nums) {
        int n = nums.length;
        int[][] arr = new int[n][n];
        int k=0;
        for(int i=0;i<n;i++){
            for(int j=n-1;j>=0;j--){
              arr[i][k++] = nums[i][j];
            }
            k=0;
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j]==0) arr[i][j]=1;
                else arr[i][j] = 0;
            }
        } 

        return arr;       
    }
}