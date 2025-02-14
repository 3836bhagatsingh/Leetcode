class Solution {
    public void rowTraversal(int n,int[][] arr){
        for(int i=0;i<arr[0].length;i++){
            arr[n][i] +=1;
        }
    }
    public void colTraversal(int n,int[][] arr){
        for(int i=0;i<arr.length;i++){
            arr[i][n] +=1;
        }
    }
    public int oddCells(int m, int n, int[][] indices) {
        int[][] arr = new int[m][n];
        for(int[] num : indices){
            rowTraversal(num[0],arr);
            colTraversal(num[1],arr);
        }
        int ans = 0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j]%2!=0) ans++;
            }
        }
        return ans;
    }
}