class Solution {
    public List<Boolean> kidsWithCandies(int[] nums, int e) {

       int n = nums.length,
       max_candy = nums[0];

       for(int i=1;i<nums.length;i++){
        if(nums[i]>max_candy) max_candy = nums[i];
       }

       ArrayList<Boolean> li = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
        if(nums[i]+e >= max_candy){
            li.add(true);
        }
        else{li.add(false);}
       }
       return li;

    }
}