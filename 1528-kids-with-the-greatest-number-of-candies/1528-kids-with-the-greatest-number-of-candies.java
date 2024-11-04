class Solution {
    public List<Boolean> kidsWithCandies(int[] nums, int e) {
        List<Boolean> li = new ArrayList<>(); 
        int m = nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>m) m = nums[i];
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i] + e >= m){
                li.add(true);

            } 
            else li.add(false);
        }
        return li;
    }
}