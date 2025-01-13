class Solution {
    public char nextGreatestLetter(char[] arr, char target) {
        int s =0,e=arr.length-1;
        char ans = '#';
        while(s<=e){
            int mid = s+(e-s)/2;
            if(arr[mid]>target){ e = mid-1; ans = arr[mid];}
            else {
                s = mid+1;
            }
        }
        return ans=='#'?arr[0]:ans;
    }
     
}
