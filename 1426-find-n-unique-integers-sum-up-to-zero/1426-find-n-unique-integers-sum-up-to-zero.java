class Solution {
    public int[] sumZero(int n) {
        int l = -(n/2);
        int r = (n/2);
        int[] nums = new int[n];
        int k =0;
        for(int i=l;i<0;i++){
            nums[k++] = i;
        }
        for(int i=1;i<=r;i++){
            nums[k++] = i;
        }
       
        return nums;
        
    }
}