class Solution {
    public List<Boolean> kidsWithCandies(int[] nums, int e) {
        int maxi = -1,n = nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]>maxi) maxi = nums[i];
        }
        List<Boolean> li = new ArrayList<>();
        for(int i=0;i<n;i++){
            if((nums[i]+e)>=maxi) li.add(true);
            else li.add(false);
        }
        return li;
    }
}