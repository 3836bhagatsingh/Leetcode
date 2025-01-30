class Solution {
    public void rotate(int[] arr, int k) {
        // Brute Force
        //  int n = arr.length;
        // k = k%n;
        // int[] a = new int[n];
        // for(int i=0;i<n;i++){
        //     int index = (i+k)%n;
        //     a[index] = arr[i];
        // }
        // for(int i=0;i<n;i++){
        //     arr[i] = a[i];
        // }

        //optimized
         int n = arr.length;
        k = k%n;
        reverse(arr,0,n-1);
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);


    }
    static  void reverse(int[] arr,int i,int j){
        while(i<j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

    }
}