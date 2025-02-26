class Solution {
    public double average(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        int ans = 0;
        for(int i =1;i<arr.length-1;i++){
            ans = ans + arr[i];
        }
        return (double)ans/(n-2);

        
    }
}