class Solution {
    public int numIdenticalPairs(int[] nums) {
        int ans =0;
        Map<Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(mp.containsKey(nums[i])){
                ans += mp.get(nums[i]);
                mp.put(nums[i],mp.get(nums[i])+1);
            }
            else{
                mp.put(nums[i],1);
            }
        }
        return ans;

        
    }
}