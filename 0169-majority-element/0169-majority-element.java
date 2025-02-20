class Solution {
    public int majorityElement(int[] nums) {
        int c = 1,ele = nums[0];
        for(int i = 1;i<nums.length;i++){
            if(c==0){
                c=1;
                ele = nums[i];
            }
            else if(nums[i]==ele) c++;
            else{
                c--;
            }
        }
        return ele;

    }
}