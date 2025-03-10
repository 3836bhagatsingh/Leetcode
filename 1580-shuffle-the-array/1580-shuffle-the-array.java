class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] arr = new int[2*n];
        int k=0;
      for(int i=0;i<n;i++){
        arr[k] = nums[i];
        k = k+2;
      }
      k = 1;
        for(int i=n;i<2*n;i++){
        arr[k] = nums[i];
        k = k+2;
      }
       return arr;
        
    }
}