class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int c=0,ans = 0;
        for(int num:nums){
            if(num==0) c=0;
            else{
                c++;
                ans = Math.max(ans,c);
            }
        }
        return ans;
    }
}