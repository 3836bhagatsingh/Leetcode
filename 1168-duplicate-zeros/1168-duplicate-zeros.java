class Solution {
    public void duplicateZeros(int[] arr) {
        int n = arr.length;
        int[] nums = new int[n];
        int k=0;
        for(int i=0;i<n;i++){
          if(arr[i]==0){
           if(k<n){
            nums[k] = 0;
            k = k+1;
           }
           if(k<n){
            nums[k++] = 0;
           }
          }
          else{
           if(k<n){
             nums[k++] = arr[i];
           }
          }
        }

        for(int i=0;i<n;i++){
            arr[i]  = nums[i];
        }
        
    }
}