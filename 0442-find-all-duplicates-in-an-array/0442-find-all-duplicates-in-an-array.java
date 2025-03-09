class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> li = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for(int num:nums){
            if(set.contains(num)) li.add(num);
            set.add(num);
        }
        return li;
        
    }
}