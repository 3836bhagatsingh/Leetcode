class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        int n = nums.length;
        Set<Integer> li = new TreeSet<>();
        for(int i=0;i<n;i++){
            if(nums[i]==key){
                for(int j = Math.max(0,i-k);j<=Math.min(i+k,n-1);j++){
                    li.add(j);
                }

            }
        }
        return new ArrayList<>(li);
        
    }
}