class Solution {
    public int[][] flipAndInvertImage(int[][] nums) {

        // WITH EXTRA SPACE
        // int n = nums.length;
        // int[][] arr = new int[n][n];
        // int k=0;
        // for(int i=0;i<n;i++){
        //     for(int j=n-1;j>=0;j--){
        //       arr[i][k++] = nums[i][j];
        //     }
        //     k=0;
        // }

        // for(int i=0;i<n;i++){
        //     for(int j=0;j<n;j++){
        //         if(arr[i][j]==0) arr[i][j]=1;
        //         else arr[i][j] = 0;
        //     }
        // } 

        // return arr; 


         int n = nums.length;         
        // WITHOUT EXTRA SPACE
        for(int i=0;i<n;i++){
            int a = 0,b = n-1;
            while(a<=b){
                int temp = nums[i][a];
                nums[i][a] = nums[i][b];
                nums[i][b] = temp;
                a++;
                b--;
            }
        }
         for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(nums[i][j]==0) nums[i][j]=1;
                else nums[i][j] = 0;
            }
        }
        return nums;


    }
}