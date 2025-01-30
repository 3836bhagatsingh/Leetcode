class Solution {
    public void rotate(int[] arr, int k) {
        
         int n = arr.length;
        k = k%n;
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            int index = (i+k)%n;
            a[index] = arr[i];
        }
        for(int i=0;i<n;i++){
            arr[i] = a[i];
        }
    }
}