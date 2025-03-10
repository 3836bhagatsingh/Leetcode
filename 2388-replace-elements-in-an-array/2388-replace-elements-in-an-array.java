class Solution {
    public int[] arrayChange(int[] nums, int[][] op) {
        Map<Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            mp.put(nums[i],i);
        }
         for(int[] arr : op){
            int idx = mp.get(arr[0]);
            nums[idx] = arr[1];
            mp.remove(arr[0]);
            mp.put(arr[1],idx);
         }
         return nums;
    }
}