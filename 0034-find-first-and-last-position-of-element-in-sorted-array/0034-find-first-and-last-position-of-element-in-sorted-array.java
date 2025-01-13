class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = helper(nums,target,true);
        int last = helper(nums,target,false);
        return new int[]{first,last};
    }
    public int helper(int[] nums,int target,boolean flag){
        int s=0,e=nums.length-1,ans = -1;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(nums[mid]==target) {
                ans = mid;
                if(flag){
                    e = mid-1;
                }
                else{
                    s = mid+1;
                }
            }
            else if(nums[mid]>target) e = mid-1;
            else s = mid+1;
        }
        return ans;
    }
}