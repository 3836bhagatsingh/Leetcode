class Solution {
    public int[] sortArray(int[] arr) {
       return helper(arr);
    }
    public static int[] helper(int[] arr){
        if(arr.length  <= 1) return arr;
        int mid = arr.length/2;
        int[] left = helper(Arrays.copyOfRange(arr,0,mid));
        int[] right = helper(Arrays.copyOfRange(arr,mid,arr.length));
        return merge(left,right);
    }
  
     public static int[] merge(int[] a,int[] b){
      int m = a.length,n = b.length;
      int[] ans = new int[m+n];
      int i=0,j=0,k=0;
      while(i<m && j<n){
           if(a[i]<=b[j]){
               ans[k++] = a[i++];
           }
           else{
               ans[k++] = b[j++];
           }
      }
      while(i<m){
              ans[k++] = a[i++];
      }
      while(j<n){
          ans[k++] = b[j++];
      }
      return ans;
    }
}