class Solution {
    public boolean canPlaceFlowers(int[] nums, int n) { 
        int count =0;  
            for(int i=0;i<nums.length;i++){
    
                if(nums[i]==0){
                     boolean leftEmpty = (i == 0) || (nums[i - 1] == 0);
                boolean rightEmpty = (i == nums.length - 1) || (nums[i + 1] == 0);
                
                if (leftEmpty && rightEmpty) {
                    nums[i] = 1; // Place a flower
                    count++; 
                    if (count >= n) return true; // Stop early if we reach the goal
                }

                }
            }
            
        
        return count>=n;
        
    }
}