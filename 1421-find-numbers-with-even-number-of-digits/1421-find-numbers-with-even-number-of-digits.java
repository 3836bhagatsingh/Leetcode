class Solution {
    public int count(int n){
        return (int)Math.log10(n)+1;
    }
    public int findNumbers(int[] nums) {
        int c=0;
        for(int i=0;i<nums.length;i++){
            int a = count(nums[i]);
            if(a%2==0) c++;
        }
        return c;
        
    }
}