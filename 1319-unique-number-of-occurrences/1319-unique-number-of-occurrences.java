class Solution {
    public boolean uniqueOccurrences(int[] nums) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int num:nums){
            mp.put(num,mp.getOrDefault(num,0)+1);
        }
        Set<Integer> set = new HashSet<>();
        for(Integer i : mp.keySet()){
            if(set.contains(mp.get(i))) return false;
            else set.add(mp.get(i));
        }
        return true;

        
    }
}