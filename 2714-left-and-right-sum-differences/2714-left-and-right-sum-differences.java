class Solution {
    public int[] leftRightDifference(int[] nums) {
        // Brute force  
        // int n = nums.length;
        // int[] l = new int[n];
        // int[] r = new int[n];
        // int[] ans = new int[n];

        // l[0] = 0;
        // for(int i=1;i<n;i++){
        //     l[i] = l[i-1] + nums[i-1];
        // }

        // r[n-1] = 0;
        // for(int i =n-2;i>=0;i--){
        //     r[i] = r[i+1] + nums[i+1];
        // }
        // for(int i=0;i<n;i++){
        //     ans[i] = Math.abs(l[i]-r[i]);
        // }
        // return ans;


        // Optimal solution

        int n = nums.length;
        int rightsum =0;
        for(int i =0;i<n;i++){
            rightsum = rightsum + nums[i];
        }
        int leftsum =0;
        for(int i =0;i<n;i++){
            int a = nums[i];
            leftsum = leftsum + a;
            nums[i] = Math.abs(rightsum-leftsum);
            rightsum = rightsum - a;
        }
        return nums;
        
    }
}