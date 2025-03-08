class Solution {
    public int wateringPlants(int[] nums, int capacity) {
        int initial_capacity = capacity;
        int steps=0;
        for(int i=0;i<nums.length;i++){
           
            if(nums[i]<=capacity){
                capacity = capacity-nums[i];
                 steps+=1;
            }
            else{
                steps = steps + 2*i ;
                capacity  = initial_capacity;
                i--;
            }
        }
        return steps;

        
    }
}