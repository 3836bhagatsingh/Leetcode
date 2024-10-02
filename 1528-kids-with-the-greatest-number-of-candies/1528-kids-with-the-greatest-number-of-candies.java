class Solution {
    public List<Boolean> kidsWithCandies(int[] nums, int c) {
        int m =0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>m) m = nums[i];
        }
        List<Boolean> li = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int a = nums[i]+c;
            if(a>=m) li.add(true);
            else li.add(false);
        }
        return li;
        
    }
}