class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        int[] freq = new int[51];
        int ans =0;
        for(int num:nums){
            freq[num]++;
        }
        for(int i=1;i<=50;i++){
            if(freq[i]==2) ans = ans^i;
        }
        return ans;
        
    }
}